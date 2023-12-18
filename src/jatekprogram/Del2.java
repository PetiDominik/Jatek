
package jatekprogram;

public class Del2 extends Helyszin {

    @Override
    public String leiras() {
        return "Irány jobbra?!";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Jobb();
    }

    @Override
    public String egyikGombFelirat() {
       return "Gyerünk jobbra!";
    }
    
}
