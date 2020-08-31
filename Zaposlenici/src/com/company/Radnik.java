package com.company;

public abstract class Radnik {
    private String ime;
    private long jmbg;
    private int staz;

    public Radnik() {
    }

    public Radnik(String ime, long jmbg, int staz) {
        this.ime = ime;
        this.jmbg = jmbg;
        this.staz = staz;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public long getJmbg() {
        return jmbg;
    }

    public void setJmbg(long jmbg) {
        this.jmbg = jmbg;
    }

    public int getStaz() {
        return staz;
    }

    public void setStaz(int staz) {
        this.staz = staz;
    }

    @Override
    public String toString() {
        return "Radnik{" +
                "ime='" + ime + '\'' +
                ", jmbg=" + jmbg +
                ", staz=" + staz +
                '}';
    }
    public abstract double izracunajPlatu();

    public static Radnik vecaPlata(Radnik r1, Radnik r2){
        if(r1.izracunajPlatu() >= r2.izracunajPlatu()){
            return r1;
        }
        else {
            return r2;
        }
    }

}
