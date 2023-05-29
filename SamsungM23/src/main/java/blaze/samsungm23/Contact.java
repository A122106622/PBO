/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package blaze.samsungm23;

/**
 *
 * @author ALTAIR
 */
public class Contact {
    
    private String nama;
    private String nomor;

    public Contact(String nama, String nomor)
    {
        this.nama = nama;
        this.nomor = nomor;
    }

    public String getNama()
    {
        return this.nama;
    }

    public String getNomor()
    {
        return this.nomor;
    }
    
    @Override
    public String toString() {
        return "Contact: "+getNama()+", "+getNomor();
    }
    
}