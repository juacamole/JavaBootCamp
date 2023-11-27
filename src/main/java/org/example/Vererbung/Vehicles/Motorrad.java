package org.example.Vererbung.Vehicles;

public class Motorrad extends Fahrzeug{
    private int Räderanzahl;
    private int PS;
    private int Hubraum;

    public int getPS() {
        return this.PS;
    }

    public int getHubraum() {
        return this.Hubraum;
    }

    public int getRäderanzahl() {
        return this.Räderanzahl;
    }

    public void setPS(int PS) {
        this.PS = PS;
    }

    public void setHubraum(int hubraum) {
        Hubraum = hubraum;
    }

    public void setRäderanzahl(int räderanzahl) {
        Räderanzahl = räderanzahl;
    }
    public static void MotorradAuskunft(String Hersteller, String Modell, int Baujahr, int RäderAnzahl, int PS, int Hubraum){
        System.out.println("The "+Hersteller+ " " + Modell + " made in " + Baujahr + " has " + Hubraum + " ccm and " + PS + " horsepower.");
        System.out.println("Also, its got " + RäderAnzahl + " wheels.");
    }
}
