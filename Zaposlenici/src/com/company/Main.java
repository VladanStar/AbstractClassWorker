package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Radnik r1 = new RadnikPlacenfiksno("Vladan Cupric",1234567890,5, 1000);
        Radnik r2 = new RadnikPlacenPoSatu("Zoran Mitrovic", 987654321,12,45,100);
        Radnik[] radnici = {
                new RadnikPlacenfiksno("Filip Drazic",234567889,32,45000),
                new RadnikPlacenfiksno("Goran Dunjic",34567312,12,68000),
                new RadnikPlacenPoSatu("Jovan Maric",45678321,12,56,2000),
                new RadnikPlacenPoSatu("Lazar Nikolic",23456789,23,45, 1050),
                r1,
                r2,
        };
        //Obracun plate za sve radnike
        for(Radnik r : radnici){
            System.out.println(r + " obracunata plata "+ r.izracunajPlatu());
        }
        System.out.println("Radnici sa 10 i vise godina radnog staza");
        for(Radnik rTen : radnici){
            if(rTen.getStaz()>=10){
                System.out.println(rTen);
            }

        }
        System.out.println("Veca plata:");


    }
}
