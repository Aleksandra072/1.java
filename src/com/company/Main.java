package com.company;

public class Main {

    public static void main(String[] args) {
	String imie ="Jan";
    String nazwisko = "Kowalski";

    if((args.length == 2) && (args[0].equals(imie)) && (args[1].equals(nazwisko))){
        System.out.println("Tu siedzi właściciel");
    }else if (args.length == 2){
        System.out.println("Przy komputerze siedzi " + args[0] + ' ' + args[1]);
    }else{
        System.out.println("Proszę podać dokładnie dwa parametry");
    }
}
}
