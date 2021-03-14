package com.company;

public class Person {
    private String name;
    private int age;
    private String mail;

    public Person() {
        this.name = name;
        this.age = age;
        this.mail = mail;
    }

    public Person(String name, int varsta, String mail){
        this.name=name;
        this.age=age;
        this.mail=mail;
    }


    public void setName(String name){this.name=name;    }
    public void setAge(int age){this.age=age;}
    public void  setMail(String mail){this.mail=mail; }
    public String getName(){return this.name;}
    public int getAge(){return this.age;}
    public String getMail(){return this.mail;}
    public void printPerson(){
        System.out.println("Persoana se numeste "+this.name+" , are "+this.getAge()+" ani si are adresa de email: "+this.getMail());


    }
}
