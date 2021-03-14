package com.company;

import com.sun.nio.sctp.PeerAddressChangeNotification;

public class Main {

    public static void main(String[] args) {
        /* Ex1: Scrie o clasa denumita "Persoana " care contine 3 caracteristici(campuri) specifice si care are un constructor
        default(gol) si unul care initializeaza campurile clasei.Atribuie o valoare fiecarui camp din clasa si afisaseaza rezultatul
        intr-un format pe intelesul oricui.
        Ex 2: Modifica codul tau de la ex 1 prin adaugarea de specificatori de acces (public, privat, sau protected unde e cazul ) si
        folosirea metodelor getter si setter apoi afiseaza rezultatul printr-o metoda printPersoana() din clasa Person.
         EX2: */

        Person newPerson=new Person();
        newPerson.printPerson();
        newPerson.setName("Raluca");
        newPerson.setAge(15);
        newPerson.setMail("ralu@gmail.com");
        System.out.println("Persoana1 se numeste "+newPerson.getName()+" , are "+newPerson.getAge()+" ani si are adresa de email: "+newPerson.getMail());


          Person anotherPerson=new Person("Calin", 34 , "calin@gmail.com");
          anotherPerson.printPerson();
    }
}