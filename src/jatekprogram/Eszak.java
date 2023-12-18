
package jatekprogram;

public class Eszak extends Helyszin implements MasikIrany {

    @Override
    public String leiras() {
        return "Ez itt észak!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Eszak2();
    }

    @Override
    public Helyszin masikIrany() {
        return new Eszak1();
    }
    
    @Override
    public String egyikGombFelirat() {
        return "Irány észak 2!";
    }

    @Override
    public String masikGombFelirat() {
        return "Irány észak 1!";
    }

}
