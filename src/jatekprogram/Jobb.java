
package jatekprogram;

public class Jobb extends Helyszin implements MasikIrany{

    @Override
    public String leiras() {
        return "Észak vagy dél?";
    }

    @Override
    public Helyszin egyikIrany() {
        return new Eszak();
    }

    @Override
    public Helyszin masikIrany() {
        return new Del();
    }
    
    @Override
    public String egyikGombFelirat() {
        return "Irány észak!";
    }
    
    @Override
    public String masikGombFelirat() {
        return "Irány dél!";
    }
   
}
