
package jatekprogram;

public class Bal extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {
        return "Ez a bal!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kelet();
    }

    @Override
    public Helyszin masikIrany() {
        return new Nyugat();
    }

    @Override
    public String egyikGombFelirat() {
        return "Irány kelet!";
    }

    @Override
    public String masikGombFelirat() {
        return "Irány nyugat!";
    }
    
}
