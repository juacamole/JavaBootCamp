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

        Motorrad moto1 = new Motorrad();
        moto1.setPS(15);
        moto1.setRäderanzahl(2);
        moto1.setHubraum(125);
        moto1.setHersteller("KTM");
        moto1.setModell("duke");
        moto1.setBaujahr(2014);
        Motorrad.MotorradAuskunft(moto1.getHersteller(), moto1.getModell(), moto1.getBaujahr(), moto1.getRäderanzahl(), moto1.getPS(), moto1.getHubraum());
    }
}
