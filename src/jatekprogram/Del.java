
package jatekprogram;

public class Del extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Ez itt dél!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Del2();
    }

    @Override
    public Helyszin masikIrany() {
        return new Del1();
    }
    
    @Override
    public String egyikGombFelirat() {
        return "Irány dél 2!";
    }

    @Override
    public String masikGombFelirat() {
        return "Irány dél 1!";
    }
    
}
