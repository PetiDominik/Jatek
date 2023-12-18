
package jatekprogram;

public class Kezdes extends Helyszin {
    
    @Override
    public String leiras() {
        return "Ez a kezdés!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Bal();
    }

    @Override
    public Helyszin masikIrany() {
        return new Start();
    }

    @Override
    public String gombFelirat() {
        return "Menj balra!";
    }

}
