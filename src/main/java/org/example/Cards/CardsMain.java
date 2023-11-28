package org.example.Cards;

public class CardsMain {
    public static void main(String[] args){
        char chosen = randomCardChooser();
        System.out.println(chosen);



    }
    public static char randomCardChooser(){

        String cards = "12345678";

        return cards.charAt((int)(Math.random()*8));

    }

}
