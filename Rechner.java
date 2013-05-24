package methoden;

import java.util.Scanner;

/**
 * Klasse zur Repraesentation eines Taschenrechners.
 * @author Grootoonk
 * @date 12. Mai 2013
 */
public class Rechner
{
  /**
	 * Hauptmethode
	 * @param args Kommandozeilenparameter
	 */
	public static void main( String[] args )
	{
		// Variablen anlegen
		double zahl1, zahl2, ergebnis;
		int    auswahl;
		
		// Scanner zum Einlesen anlegen
		Scanner scanner = new Scanner( System.in );
		
		do {
			// Programmoptionen anzeigen
			System.out.println( "Bitte waehlen Sie eine Option:" );
			System.out.println( "0 - Beenden" );
			System.out.println( "1 - Addieren" );
			System.out.println( "2 - Subthrahieren" );
			System.out.println( "3 - Multiplizieren" );
			System.out.println( "4 - Dividieren" );
			
			// Einlesen der gewuenschten Funktion
			System.out.print( "Ihre Eingabe: " );
			auswahl = scanner.nextInt();
			
			// Einlesen beider Operanden (Zahlen)
			System.out.print( "Eingabe Wert 1: ");
			zahl1 = scanner.nextDouble();
			System.out.print( "Eingabe Wert 2: ");
			zahl2 = scanner.nextDouble();
			
			// Funktion bearbeiten
			switch( auswahl ) {
			case 0:
				System.out.println( "Beende Programm." );
			break;
			
			case 1:
				// Ergebnis berechnen
				ergebnis = zahl1 + zahl2;
				
				// Ergebnis ausgeben
				System.out.println( "Ergebnis: " + ergebnis );
			break;
			
			case 2:
				// Ergebnis berechnen und ausgeben
				ergebnis = zahl1 - zahl2;
				
				// Ergebnis ausgeben
				System.out.println( "Ergebnis: " + ergebnis );
			break;
			
			case 3:
				// Ergebnis berechnen und ausgeben
				ergebnis = zahl1 * zahl2;

				// Ergebnis ausgeben
				System.out.println( "Ergebnis: " + ergebnis );
			break;
			
			case 4:
				// Ergebnis berechnen, bzw. Fehler ausgeben, wenn zahl2 = 0
				if( zahl2 != 0 ) {
					// Ergebnis berechnen
					ergebnis = zahl1 / zahl2;

					// Ergebnis ausgeben
					System.out.println( "Ergebnis: " + ergebnis );
				} else {
					System.out.println( "Teilen durch Null ist nicht möglich!" );
				}
			break;
			
			default:
				System.out.println( "Option nicht bekannt." );
			}	// Ende von switch-case
		} while( auswahl != 0 );	// Ende von do-while
		
		// Scanner schliessen, da Programmende
		scanner.close();
	}	// Ende der main-Methode
}	// Ende der Rechner-Klasse


///////////////////////////////////////////////////////////////////////////////////////////////////////////////
AUFGABEN : 

I)   Lade dir die Datei Rechner.java in deine Entwicklungsumgebung.

II)  Schaue dir den Quellcode in seiner grundlegenden Funktion an.
     - Was macht das Programm?
     - Welche Funktionen hat es?
    
III) Führe das Programm aus und teste es mit beliebigen Zahlenwerten.

=====================================================================

1.) Schreibe eine Methode, die
    a) zwei Zahlen addiert,
    b) und das Ergebnis zurückgibt.
    - Nutze die Methode im Programm.
    
2.) Schreibe eine Methode, die
    a) zwei Zahlen subtrahiert
    b) und das Ergebnis zurückgibt.
    - Nutze die Methode im Programm.
    
3.) Schreibe eine Methode, die
    a) zwei Zahlen multipliziert
    b) und das Ergebnis zurückgibt.
    - Nutze die Methode im Programm.
    
4.) Schreibe eine Methode, die
    a) zwei Zahlen dividiert
    b) und das Ergebnis zurückgibt.
    - Nutze die Methode im Programm.
    
5.) Schreibe eine Methode, die
    a) die Optionen des Programms auf der Konsole ausgibt,
    b) eine Option von der Konsole einließt und
    c) den Wert zurückgibt.
    - Nutze die Methode im Programm.
    
6.) Schreibe eine Methode, die eine beliebige Funktion erfüllt. (Bspw. Umfang eines Kreises berechnen, oder Quersumme usw.)
    - Die Methode soll über mindestens einen formalen Parameter verfügen.
    - Ein Rückgabewert ist nicht unbedingt erforderlich.

Erweiterung des Rechners, um:
1.) Eine Methode <Rückgabe-Typ> rechne ( <Typ1> zahl1, <Operator-Typ> operator, <Typ2> zahl2 )
    Benutzung: double ergebnis = rechne( 55, "*", 2 ); // ergebnis = 110

2.) 3 Methoden aus der Klasse java.lang.Math (siehe Java-API Version 7)
