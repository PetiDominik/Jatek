
package jatekprogram;

public class Start extends Helyszin {

    @Override
    public String leiras() {
        return "Ez a start! Menj tovább!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();
    }

    @Override
    public Helyszin masikIrany() {
        throw new UnsupportedOperationException("Nem tudjuk hova menjünk a start oldalról."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String gombFelirat() {
        return "egyikGomb";
    }

    
}
