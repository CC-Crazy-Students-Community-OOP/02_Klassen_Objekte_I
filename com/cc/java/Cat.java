package com.cc.java;

public class Cat {
    public String name;
    public String color;
    public int age;
    
    public Cat( String name, String color, int age ) {                      // erstelle eine Konstruktor, immer genannt wie die Klasse ohne return oder void
        this.name = name;
        this.color = color;
        this.age = age;

    }

    public String tellYourName() { return this.name; }                      // man kann mit return den Wert weitergeben an einen output
    public String tellYourColor() { return this.color; }
    public void tellYourAge() { App.output( this.age ); }                   // man kann mit void, also ohne return den Wert direkt als Ausgabe

    // public void tellYourAdress() {                                       // wenn hier kein public oder private deklariert, dann nimmt er immer die art der Klasse
    //     // System.out.println( "watch from inside: " + this );           // this ist eine Instanzvariable und ist an ein Objekt gebunden
    //     App.output( "watch from inside: " + this );                      // this sieht hier obhne static, dass aus einem Objekt gearbeitet wird, daher ergibt this hier ein Output

    //     // App app = new App();
    //     // app.test1();                                                  // ausgabe ohne static aus App, also aufruf aus dem Objekt app
    //     // App.test2();                                                  // statis ausgabe aus App, also aufruf aus der Klasse App

    // }
}
