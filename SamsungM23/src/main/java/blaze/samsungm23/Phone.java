/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package blaze.samsungm23;
/**
 *
 * @author ALTAIR
 */
public interface Phone {
    
    public static final int MAX_batteryLevel = 100;
    public static final int MIN_batteryLevel = 0;
    public static final int MAX_volume = 100;
    public static final int MIN_volume = 0;
    
    void powerON();
    int getVolume();
    void volumeUP();
    void volumeDOWN();
    void addContact(String nama, String nomor);
    void viewContact();
    void findContact(String nama);
    void topupCredit(int amount);
    void checkBalance();
    void powerOFF();
    
}