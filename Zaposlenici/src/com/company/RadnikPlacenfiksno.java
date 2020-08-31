package com.company;

public class RadnikPlacenfiksno extends Radnik{
    private double plata;

    public RadnikPlacenfiksno() {
    }

    public RadnikPlacenfiksno(double plata) {
        this.plata = plata;
    }

    public RadnikPlacenfiksno(String ime, long jmbg, int staz, double plata) {
        super(ime, jmbg, staz);
        this.plata = plata;
    }

    public double getPlata() {
        return plata;
    }

    public void setPlata(double plata) {
        this.plata = plata;
    }

    @Override
    public String toString() {
        return "RadnikPlacenfiksno{ " + super.toString()+
                " plata=" + plata +
                '}';
    }

    @Override
    public double izracunajPlatu() {
        return this.plata;
    }
}
