/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL_forbindelse;

import static StartLoadSer.readSer.readHash;
import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.sql.Timestamp;
import java.sql.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author taras
 */
public class test_sql {

    public static void main(String[] args) throws MalformedURLException {

        DB test;
        try {
            test = new DB("jdbc:mysql://sensordb.cfdquak6nbpb.eu-west-2.rds.amazonaws.com:3306/SensorDB", "sensorDatabase", "sensor2017", readHash());
            //test = new DB("jdbc:mysql://localhost:3306/sensor_test","root","");


            // creates new data sample 
            // test.insertData(2, "stue", 2, 3, 4,"2017-11-12 22:00:00" , 25);
            //saves into array List ArrayList<SensorData> /// get all elements where sensor id is 2
            //test.getAllBySensorID(1);
            // saves into array List ArrayList<SensorData> /// get all elements where sensor id is 2 and interval data is the same
            System.out.println("Date interval test");
            //test.getIntervalBySensorID(2, new Date(117, 2, 10), new Date(117, 2, 12));
            //test.drop();
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
    }
}