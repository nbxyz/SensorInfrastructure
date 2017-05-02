/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datasystem;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taras
 */
public class SensorControler {
    /*
    private String std_dbname = "jdbc:mysql://ubuntu4.javabog.dk:53067/";
    private String std_uname = "kamael2015";
    private String std_password = "simplePas";
    private String SensorDB = "SensorDB";
    /**/
    
    private String std_dbname = "jdbc:mysql://localhost/";
    private String std_uname = "root";
    private String std_password = "";
    private String SensorDB = "sensordb";
    /**/
    private Connection con_sensor;
    public static final int BASIC = 0;
    public static final int NOTACTIVE = 0;
    public static final int EXPERT = 1;
    public static final int ACTIVE = 1;
    /**
     * Sensor controler creates table for sensors
     * @throws java.sql.SQLException
     */
    public SensorControler() throws SQLException{
        
        try{
            con_sensor = DriverManager.getConnection(std_dbname+SensorDB, std_uname, std_password);
            System.out.println("Connected to Sensor Database");
               
            Statement stmt_exp_data;
            
            String sql = "CREATE TABLE IF NOT EXISTS `"+SensorDB+"` ("
                    + "`Sensor_ID` int(11) NOT NULL AUTO_INCREMENT,"
                    + "`Name` text NOT NULL,"
                    + "`Location` text NOT NULL,"
                    + "`Unit` text NOT NULL,"
                    + "`Owner` int(11) NOT NULL,"
                    + "`SetupTime` timestamp NOT NULL,"
                    + "`Status` int(11) NOT NULL,"
                    + "`DB_Status` int(11) NOT NULL,"
                    + "`Token` text NOT NULL,"
                    + " PRIMARY KEY (`Sensor_ID`)"
                    + ") ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=1";
                       
            stmt_exp_data = con_sensor.createStatement();             
            stmt_exp_data.executeUpdate(sql);
        } catch (SQLException ex) {
            throw new SQLException("Cannot connect the Sensor database!" + ex.getMessage());
        }
    }
    
    /**
     * This Function adds sensor to the database, status for this sensor is notActive 
     * this function returns sensor id, if everything is ok, returns -1 if there's an error 
     * @param name
     * @param location
     * @param unit
     * @param ownerID
     * @return 
     */
    public int addSensor(String name, String location, String unit, int ownerID){
    try{
        Statement stmt = con_sensor.createStatement();
            
            String sql ="INSERT INTO `"+SensorDB+"`"
                    + "(`Sensor_ID`, `Name`, `Location`, `Unit`, `Owner`, `SetupTime`, `Status`, `DB_Status`, `Token`) "
                    + "VALUES (null,'?','?','?','"+ownerID+"',now(),"+NOTACTIVE+","+BASIC+",'randomString')"; 
            stmt.executeUpdate(sql,Statement.RETURN_GENERATED_KEYS);
            ResultSet tableKeys = stmt.getGeneratedKeys();
            tableKeys.next();
            int autoGeneratedID = tableKeys.getInt(1);
            
            PreparedStatement prepStmt = con_sensor.prepareStatement("UPDATE `sensordb` SET `Name`=?,`Location`=?,`Unit`=? WHERE `Sensor_ID` = "+autoGeneratedID);
            prepStmt.setString(1, name);
            prepStmt.setString(2, location);
            prepStmt.setString(3, unit);
            prepStmt.executeUpdate();
            return autoGeneratedID;
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage());
            System.out.println(ex.getMessage());
            return -1;
        }        
    }
    
    /**
     * Activates single sensor this function should be called after sensor is created
     * @param SensorID 
     * @param state 
     */
    public void setSensorState(int SensorID, int state){
        if(state != SensorControler.ACTIVE && state != SensorControler.NOTACTIVE)
            return;
        
        try {
            Statement stmt = con_sensor.createStatement();            
            String sql ="UPDATE `"+SensorDB+"` SET `Status`="+state+" WHERE `Sensor_ID`= "+SensorID;        
            int updates= stmt.executeUpdate(sql);
            if(updates == 0){
                System.out.println("SENSOR with that ID Does Not Exist");
            }
            System.out.println("Sensor is now active");
        } catch (SQLException ex) {
            Logger.getLogger(SensorControler.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQL ERROR...");
        }
    }
    
    /**
     * This sensor changes status, means what database should this sensor saves information into
     * @param SensorID 
     * @param status 
     */
    public void changeSavingStatus(int SensorID, int status){
        if(status != SensorControler.EXPERT && status != SensorControler.BASIC){
            return;
        }
        try {
            Statement stmt = con_sensor.createStatement();            
            String sql ="UPDATE `"+SensorDB+"` SET `DB_Status`="+status+" WHERE `Sensor_ID`= "+SensorID;        
            int updates= stmt.executeUpdate(sql);
            if(updates == 0){
                System.out.println("SENSOR with that ID Does Not Exist");
            }
            System.out.println("Sensor is now in expert mode");
        }catch (SQLException ex) {
            Logger.getLogger(SensorControler.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQL ERROR...");
        }
    }
    /**
     * This function sets new Status, 1 for expert Status, 0 for basic
     * @param ownerID 
     * @param status 
     */
    public void changeStatusForALL(int ownerID, int status){
        if(status != SensorControler.EXPERT && status != SensorControler.BASIC){
            return;
        }
        
        try {
            Statement stmt = con_sensor.createStatement();            
            String sql ="UPDATE `"+SensorDB+"` SET `DB_Status`='"+status+"' WHERE `Owner`= "+ownerID;        
            int updates= stmt.executeUpdate(sql);
            if(updates == 0){
                System.out.println("User with that id doesnot exist or there was nothing to change");
            }
            String m;
            if(status == SensorControler.EXPERT){ 
                m = "Expert";
            }else{
                m = "Basic";
            }
            
            System.out.println("Sensors for user "+ownerID+" is now in "+m+" mode");
        }catch (SQLException ex) {
            Logger.getLogger(SensorControler.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("SQL ERROR...");
        }
    }
    /**
     * This function returns list of all sensor created by user
     * @param OwnerID
     * @return 
     */
    public ArrayList<String> getAllSensors(int OwnerID){
       ArrayList<String> data = new ArrayList<>(); 
        try {
            Statement stmt = con_sensor.createStatement(); // creates new sql statment
            ResultSet rs = null;
            rs = stmt.executeQuery("SELECT * FROM `sensordb` WHERE `Owner` = "+OwnerID);  //executes query  
            while (rs.next()) {         // while more data to read 
                
                //String date =""+t.getYear()+t.getMonth()+t.getDate();
                String d =  (int)rs.getObject(1)       +" "+
                            (String) rs.getObject(2)      +" "+
                            (String) rs.getObject(3)   +" "+
                            (String) rs.getObject(4)   +" "+
                            (int) rs.getObject(5)   +" "+
                            (Timestamp) rs.getObject(6)    +" "+
                            (int) rs.getObject(7)+" "+
                            (int) rs.getObject(8)+" "+
                            (String)rs.getObject(9);

                data.add(d);
            }
            rs.close();
        } catch (SQLException ex) {
            Logger.getLogger(ex.getMessage());
            System.out.println("Data convertion error... this should not happen");
        }
       
       return data;
    }
    
}