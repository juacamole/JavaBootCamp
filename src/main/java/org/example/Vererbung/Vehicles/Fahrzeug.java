package org.example.Vererbung.Vehicles;

public class Fahrzeug {

    private String Hersteller;

    private String Modell;
    private int Baujahr;

    public int getBaujahr() {
        return Baujahr;
    }

    public String getHersteller() {
        return Hersteller;
    }

    public String getModell() {
        return Modell;
    }

    public void setBaujahr(int baujahr) {
        Baujahr = baujahr;
    }

    public void setHersteller(String hersteller) {
        Hersteller = hersteller;
    }

    public void setModell(String modell) {
        Modell = modell;
    }

}
