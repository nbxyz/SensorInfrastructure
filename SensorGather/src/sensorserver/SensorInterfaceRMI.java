/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sensorserver;

//import mainframe.*;

/**
 *
 * @author nb
 */
public interface SensorInterfaceRMI extends java.rmi.Remote {
    
    boolean transferDataRMI(String username, String password, String data) throws java.rmi.RemoteException;
    boolean requestConnection() throws java.rmi.RemoteException;
    String getNonsense() throws java.rmi.RemoteException;
    String getPublicKey() throws java.rmi.RemoteException;
    byte[] sendCipherInonsense(byte[] cipher) throws java.rmi.RemoteException;
    byte[] sendCipherHash(byte[] cipher )throws java.rmi.RemoteException;
    
    //boolean isThereNewData() throws java.rmi.RemoteException;
    //public String getData() throws java.rmi.RemoteException;

    //public Object addTogether();
    
}