package com.cc.java;

public class App {                                                          // Klasse
    public static void main( String[] args ) {                              // main method calls the method output

        Cat cat = new Cat();                                                // ertselle ein Objekt / Instanz

        // output( cat.name );
        // output( cat.color );
        // output( String.valueOf( cat.age ) );

        cat.name = "Beauty";
        cat.color = "schwarz";
        cat.age = 3;


        output( cat.tellYourName() );                                       // kann mir als output hier ausgegeben werden
        output( cat.tellYourColor() );
        cat.tellYourAge();                                                  // kann mir als output von aussen ausgegeben werden

        output("----------------------");

        Cat cat2 = new Cat();                                                // ertselle ein Objekt / Instanz

        // output( cat2.name );
        // output( cat2.color );
        // output( String.valueOf( cat2.age ) );

        cat2.name = "Susi";
        cat2.color = "braun";
        cat2.age = 7;


        output( cat2.tellYourName() );                                       // kann mir als output hier ausgegeben werden
        output( cat2.tellYourColor() );
        cat2.tellYourAge();                                                  // kann mir als output von aussen ausgegeben werden

        output("----------------------");

        // Beispiele als Übung
            // output("----------------------");
            // output( "Die zahl lautet: " + 2 );                           // Erstes Beispiel: kombiniere zahlen mit einem String
            // output( 2 );                                                 // Oder deklariere eine Methode für einen INT Output, sihe unten
            // output( String.valueOf( 2 ) );                               // Oder deklariert typeof string
            // output( Integer.toString( 2 ) );                             // Oder konvertiert int zu string
            // output("----------------------");
            // output( "watch from outside to Cat: " + cat );
            // output("----------------------");
            // Cat cat1= new Cat();                                         // cat = Rreferenzvariable (enthält die Adresse)
            // output( "watch from outside to Cat: " + cat1 );
            // output("----------------------");
            // // cat.tellYourAdress();                                     // entweder per neu definiertes Objekt
            // cat.tellYourAdress();                                        // oder per Klasse direkt, dann muss die Klasse aber auch static sein
            // tellYourAdress();
    }

    // public static void tellYourAdress(){                                 // Methoden sind Funktionen in einer Klasse
    //     System.out.println( "Hey" );
    // }


    public static void output( String outputStr ) {                         // Methoden können als String deklariert werden
        System.out.println( outputStr );
    }
    public static void output( int outputInt ) {                           // methods are function in classes, methods also has to be declard as int                 
        System.out.println( outputInt );
    }
    public static void output( float outputStr ) {                          // methods are function in classes, methods also has to be declard as float
        System.out.println( outputStr );
    }

    // public void test1() { System.out.println( "WER1" ); }                // methods zum Testen in Klasse Cat
    // public static void test2() { System.out.println( "WER2" ); }         // methods zum Testen in Klasse Cat
}
