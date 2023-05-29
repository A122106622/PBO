/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blaze.samsungm23;
import java.lang.Math;
import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author ALTAIR
 */
public class Samsung implements Phone {
    
    String merk;
    String type;
    boolean status;
    private int batteryLevel;
    private int volume;
    private Map<String, String> contacts;
    private int credit;
    
    public Samsung(String merk, String type) {
        this.merk = merk;
        this.type = type;
        this.volume = 69;
        this.batteryLevel = (int)(Math.random()*(100-0+1)+0);
    }
    
    @Override
    public void powerON() {
        status = true;
        System.out.println("Phone ON");
    }
    
    @Override
    public void powerOFF() {
        status = false;
        System.out.println("Phone OFF");
    }
    
    public int getVolume() {
        return this.volume;
    }
    
    @Override
    public void volumeUP() {
        if(this.status == false) {
            System.out.println("Phone OFF");
        }
        else {
            this.volume++;
            if(this.volume >= 100)
            {
                this.volume = 100;
            }
        }
    }
    
    @Override
    public void volumeDOWN() {
        this.volume--;
        System.out.println("Volume: "+this.getVolume());
    }
    
    @Override
    public void addContact(String nama, String nomor) {
        contacts.put(nama, nomor);
    }
    
    @Override
    public void viewContact() {
        System.out.println("Daftar Kontak: ");
        for(Map.Entry<String, String>entry: contacts.entrySet()) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
    }
    
    @Override
    public void findContact(String nama) {
        if(contacts.containsKey(nama)) {
            System.out.println("Kontak dengan nama.. "+ nama +"ditemukan, nomor: "+contacts.get(nama));
        }
    }
    
    @Override
    public void topupCredit(int amount) {
        credit += amount;
        System.out.println("Topup Pulsa berhasil..");
    }
    
    @Override
    public void checkBalance() {
        System.out.println("Sisa saldo pulsa: "+credit);
    }
    
}