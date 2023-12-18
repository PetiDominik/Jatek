
package jatekprogram;

public class Kezdes extends Helyszin implements MasikIrany {
    
    @Override
    public String leiras() {
        return "Jobbra vagy balra?";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Jobb();
    }

    @Override
    public Helyszin masikIrany() {
        return new Bal();
    }

    @Override
    public String egyikGombFelirat() {
        return "Menj jobbra!";
    }

    @Override
    public String masikGombFelirat() {
        return "Menj balra";
    }

}
