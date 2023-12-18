
package jatekprogram;

public class Nyugat extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Nyugat 1 vagy 2?!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Nyugat2();
    }
    
    @Override
    public Helyszin masikIrany() {
        return new Nyugat1();
    }

    @Override
    public String egyikGombFelirat() {
        return "Irány nyugat 2!";
    }

    @Override
    public String masikGombFelirat() {
        return "Irány nyugat 1!";
    }
    
}
