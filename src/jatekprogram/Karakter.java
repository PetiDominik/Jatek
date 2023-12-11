
package jatekprogram;

import java.util.Random;

public class Karakter {
    private static final Random RND = new Random();
    private int eletero, ugyesseg, szerencse;
    
    public Karakter() {
        this.eletero = this.kockadobas(2) + 12;
        this.ugyesseg = this.kockadobas() + 6;
        this.szerencse = this.kockadobas() + 6;
    }
    
    private int kockadobas() {
        return this.kockadobas(1);
    }
    
    private int kockadobas(int db) {
        int osszeg = 0;
        
        for (int i = 0; i < db; i++) {
            osszeg += this.RND.nextInt(1, 6 + 1);
            
        }
        return osszeg;
    }

    public int getEletero() {
        return eletero;
    }

    public int getUgyesseg() {
        return ugyesseg;
    }

    public int getSzerencse() {
        return szerencse;
    }

    @Override
    public String toString() {
        return "Karakter{" + "eletero=" + eletero + ", ugyesseg=" + ugyesseg + ", szerencse=" + szerencse + '}';
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 47 * hash + this.eletero;
        hash = 47 * hash + this.ugyesseg;
        hash = 47 * hash + this.szerencse;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Karakter other = (Karakter) obj;
        if (this.eletero != other.eletero) {
            return false;
        }
        if (this.ugyesseg != other.ugyesseg) {
            return false;
        }
        return this.szerencse == other.szerencse;
    }
    
    
}
