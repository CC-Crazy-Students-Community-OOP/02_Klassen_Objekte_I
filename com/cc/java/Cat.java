package com.cc.java;

public class Cat {
    private String name;
    private String color;
    private int age;
    
    public Cat( String name, String color, int age ) {                      // erstelle eine Konstruktor, immer genannt wie die Klasse ohne return oder void
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public String getName() { return name; }
    public void setName( String name ) { this.name = name; }

    public String getColor() { return color; }
    public void setColor( String color ) { this.color = color; }

    public int getAge() { return age; }
    public void setAge( int age ) { this.age = age; }

    // used getter and setter


    // Übungen selbst geschrieben
        // public void changeName( String name ) {                                 // da private vars, darf man nur mit der Funktion den Namen ändern
        //     this.name = name;
        // }

        // public String tellYourName() { return this.name; }                      // man kann mit return den Wert weitergeben an einen output
        // public String tellYourColor() { return this.color; }
        // public void tellYourAge() { App.output( this.age ); }                   // man kann mit void, also ohne return den Wert direkt als Ausgabe

        // public void tellYourAdress() {                                       // wenn hier kein public oder private deklariert, dann nimmt er immer die art der Klasse
        //     // System.out.println( "watch from inside: " + this );           // this ist eine Instanzvariable und ist an ein Objekt gebunden
        //     App.output( "watch from inside: " + this );                      // this sieht hier obhne static, dass aus einem Objekt gearbeitet wird, daher ergibt this hier ein Output

        //     // App app = new App();
        //     // app.test1();                                                  // ausgabe ohne static aus App, also aufruf aus dem Objekt app
        //     // App.test2();                                                  // statis ausgabe aus App, also aufruf aus der Klasse App

        // }
}
