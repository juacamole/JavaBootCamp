package org.example.Vererbung.Vehicles;

public class FahrzeugMain {
    public static void main(String[] args){

        Auto auto1 = new Auto();
        auto1.setTürenAnzahl(3);
        auto1.setPferdeStärke(200);
        auto1.setRäderAnzahl(4);
        auto1.setBaujahr(1982);
        auto1.setHersteller("toyota");
        auto1.setModell("supra");
        Auto.AutoAuskunft(auto1.getHersteller(), auto1.getModell(), auto1.getBaujahr(), auto1.getTürenAnzahl(), auto1.getRäderAnzahl(), auto1.getPferdeStärke());
    }
}
