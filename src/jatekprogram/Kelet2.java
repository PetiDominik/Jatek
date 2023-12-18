
package jatekprogram;

public class Kelet2 extends Helyszin {

    @Override
    public String leiras() {
        return "Ez itt a kelet 2, irány észak ?!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Eszak();
    }

    @Override
    public String egyikGombFelirat() {
        return "Irány észak!";
    }
    
    
}
