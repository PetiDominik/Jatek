
package jatekprogram;

public class Kelet extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Kelet 1 vag 2?";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kelet2();
    }
    
    @Override
    public Helyszin masikIrany() {
        return new Kelet1();
    }

    @Override
    public String egyikGombFelirat() {
        return "Irány kelet 2!";
    }

    @Override
    public String masikGombFelirat() {
        return "Irány kelet 1!";
    }

}
