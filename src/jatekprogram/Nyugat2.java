
package jatekprogram;

public class Nyugat2 extends Helyszin {

    @Override
    public String leiras() {
        return "Ez itt a nyugat2, irány Kelet!?";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kelet();
    }

    @Override
    public String egyikGombFelirat() {
        return "Irány kelet!";
    }
 
    
}
