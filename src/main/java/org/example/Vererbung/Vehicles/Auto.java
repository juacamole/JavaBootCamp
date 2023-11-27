package org.example.Vererbung.Vehicles;

public class Auto extends Fahrzeug{

    private int TürenAnzahl;
    private int RäderAnzahl;
    private int PferdeStärke;

    public static void AutoAuskunft(String Hersteller, String Modell, int Baujahr, int TürenAnzahl, int RäderAnzahl, int PferdeStärke){

        System.out.println("The "+ Hersteller + " Engineers knew exactly what their objective was. to make the new "+ Modell +" the fastest Car on the Market.");
        System.out.println("They officially launched it in the year " + Baujahr + ". With its " + RäderAnzahl + " Wheels, its "+ TürenAnzahl + " doors and " + PferdeStärke + " PS it will eventually break Records.");

    }

    public int getPferdeStärke() {
        return this.PferdeStärke;
    }

    public int getRäderAnzahl() {
        return this.RäderAnzahl;
    }

    public int getTürenAnzahl() {
        return this.TürenAnzahl;
    }

    public void setPferdeStärke(int pferdeStärke) {
        PferdeStärke = pferdeStärke;
    }

    public void setRäderAnzahl(int rädderAnzahl) {
        RäderAnzahl = rädderAnzahl;
    }

    public void setTürenAnzahl(int türenAnzahl) {
        TürenAnzahl = türenAnzahl;
    }
}
