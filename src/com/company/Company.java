package com.company;

public class Company {
    public static void main (String [] args){
    Employee przemek = new Employee();
    przemek.firstName = "Przemysław";
    przemek.lastName = "Chmielewski";
    przemek.yearOfBirth = 1991;
    przemek.experience  = " 15 miesięcy";
    System.out.println("Imię: "+ przemek.firstName +"\n"+"Nazwisko: "+przemek.lastName +"\n"+"Rok urodzenia: "+przemek.yearOfBirth +"\n"+"Staż pracy: "+przemek.experience+"\n");

    Employee klaudia = new Employee();
    klaudia.firstName = "Klaudia";
        klaudia.lastName = "Grad";
        klaudia.yearOfBirth = 1992;
        klaudia.experience  = " 30 miesięcy";
    System.out.println("Imię: "+ klaudia.firstName +"\n"+"Nazwisko: "+klaudia.lastName +"\n"+"Rok urodzenia: "+klaudia.yearOfBirth +"\n"+"Staż pracy: "+klaudia.experience+"\n");

    Employee milena = new Employee();
        milena.firstName = "Milena";
        milena.lastName = "Chmielewska";
        milena.yearOfBirth = 1993;
        milena.experience  = " 3 miesiące";
    System.out.println("Imię: "+ milena.firstName +"\n"+"Nazwisko: "+milena.lastName +"\n"+"Rok urodzenia: "+milena.yearOfBirth +"\n"+"Staż pracy: "+milena.experience+"\n");

    }
}
