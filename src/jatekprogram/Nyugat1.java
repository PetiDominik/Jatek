
package jatekprogram;

public class Nyugat1 extends Helyszin {

    @Override
    public String leiras() {
        return "Nyugat?";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Nyugat();
    }

    @Override
    public String egyikGombFelirat() {
       return "Vissza a nyugatra!";
    }
    
    
}
