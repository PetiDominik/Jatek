
package jatekprogram;

public class Del1 extends Helyszin {
    
    @Override
    public String leiras() {
        return "Irány nyugat 2?!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Nyugat2();
    }

    @Override
    public String egyikGombFelirat() {
       return "Gyerünk nyugat 2!";
    }
}
