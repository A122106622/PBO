/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package blaze.samsungm23;
import java.util.Scanner;
/**
 *
 * @author ALTAIR
 */
public class SamsungM23 {

    public static void main(String[] args) {
        
        Phone M23 = new Samsung("Samsung", "M23");
        
        M23.powerON();
        Scanner inp = new Scanner(System.in);
        String action;
        
        while(true) {
            System.out.println("==== MENU APLIKASI ====");
            System.out.println("[1] Reboot HP");
            System.out.println("[2] Matikan HP");
            System.out.println("[3] Volume UP");
            System.out.println("[4] Volume DOWN");
            System.out.println("[5] Tambah Kontak");
            System.out.println("[6] Lihat Kontak");
            System.out.println("[7] Cari Kontak");
            System.out.println("[8] Topup Saldo Pulsa");
            System.out.println("[9] Cek Saldo Pulsa");
            System.out.println("=======================");
            System.out.println("Pilihan: ");
            action = inp.nextLine();
            
            if(action.equalsIgnoreCase("1")) {
                M23.powerON();
            }
            else if(action.equalsIgnoreCase("2")) {
                M23.powerOFF();
            }
            else if(action.equalsIgnoreCase("3")) {
                M23.volumeUP();
            }
            else if(action.equalsIgnoreCase("4")) {
                M23.volumeDOWN();
            }
            else if(action.equalsIgnoreCase("5")) {
                M23.addContact(action, action);
            }
            else if(action.equalsIgnoreCase("6")) {
                M23.viewContact();
            }
            else if(action.equalsIgnoreCase("7")) {
                M23.findContact(action);
            }
            else if(action.equalsIgnoreCase("8")) {
                M23.topupCredit(0);
            }
            else if(action.equalsIgnoreCase("9")) {
                M23.checkBalance();
            }
            else {
                System.out.println("Pilihanmu tidak tertera dalam daftar..");
            }
        }
        
        
    }
}