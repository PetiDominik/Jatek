
package jatekprogram;

public class Kezdes extends Helyszin {
    
    @Override
    public String leiras() {
        return "Ez a kezdés!";
    }

    @Override
    public Helyszin egyikIrany() {
        throw new UnsupportedOperationException("Nem tudjuk hova menjünk a kezdés oldalról."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Helyszin masikIrany() {
        return new Start();
    }
    
}
