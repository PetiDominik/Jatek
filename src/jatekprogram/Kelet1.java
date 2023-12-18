
package jatekprogram;

public class Kelet1 extends Helyszin {

    @Override
    public String leiras() {
        return "Ez itt a kelet 1, irány a kezdés !?";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Kezdes();
    }

    @Override
    public String egyikGombFelirat() {
        return "Vissza a kezdéshez!";
    }
    
}
