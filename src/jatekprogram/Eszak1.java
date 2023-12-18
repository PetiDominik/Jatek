
package jatekprogram;

public class Eszak1 extends Helyszin {

    @Override
    public String leiras() {
        return "Nyertél!";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String egyikGombFelirat() {
        return "Nem tud semmit!";
    }
    
}
