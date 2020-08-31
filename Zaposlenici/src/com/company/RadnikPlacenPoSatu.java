package com.company;

public class RadnikPlacenPoSatu  extends Radnik{
    private int brojSati;
    private double cenaSata;

    public RadnikPlacenPoSatu() {
    }

    public RadnikPlacenPoSatu(int brojSati, double cenaSata) {
        this.brojSati = brojSati;
        this.cenaSata = cenaSata;
    }

    public RadnikPlacenPoSatu(String ime, long jmbg, int staz, int brojSati, double cenaSata) {
        super(ime, jmbg, staz);
        this.brojSati = brojSati;
        this.cenaSata = cenaSata;
    }

    public int getBrojSati() {
        return brojSati;
    }

    public void setBrojSati(int brojSati) {
        this.brojSati = brojSati;
    }

    public double getCenaSata() {
        return cenaSata;
    }

    public void setCenaSata(double cenaSata) {
        this.cenaSata = cenaSata;
    }

    @Override
    public String toString() {
        return "RadnikPlacenPoSatu{ " + super.toString() +
                "brojSati=" + brojSati +
                ", cenaSata=" + cenaSata +
                '}';
    }

    @Override
    public double izracunajPlatu() {
        return brojSati * cenaSata;
    }
}
