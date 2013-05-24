package methoden;

import java.util.Scanner;

/**
 * Klasse zur Repraesentation eines Taschenrechners.
 * @author Grootoonk
 * @date 12. Mai 2013
 */
public class rechnung
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
			System.out.println( "5 - Volumen eines Kegels berechnen");
			
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
				// Ergebnis berechnen + Funktion aufrufen
				System.out.println( "Ergebnis: " + addiere(zahl1,zahl2) );
			break;
			
			case 2:
				// Ergebnis berechnen + Funktion aufrufen
				System.out.println( "Ergebnis: " + subtrahiere(zahl1,zahl2) );
			break;
			
			case 3:
				// Ergebnis berechnen + Funktion aufrufen
				System.out.println( "Ergebnis: " + multipliziere(zahl1,zahl2) );
			break;
			
			case 4:
				// Ergebnis berechnen + Funktion aufrufen
				System.out.println( "Ergebnis: " + subtrahiere(zahl1,zahl2) );
			break;
			
			case 5:
				System.out.println("Das Ergebnis ist " + kegel(zahl1, zahl2));
			break;
			
			default:
				System.out.println( "Option nicht bekannt." );
			}	// Ende von switch-case
		} while( auswahl != 0 );	// Ende von do-while
		
		// Scanner schliessen, da Programmende
		scanner.close();
	}	// Ende der main-Methode
	
	
	/**
	 * 1. Wert wird mit dem 2. Wert addiert
	 * @param 1. Wert
	 * @param 2. Wert
	 * @return Ergebnis der Rechnung
	 */
	public static float addiere(double a, double b){
		float ergebnis = (float) (a + b);
		return ergebnis;
	}
	
	/**
	 * 1. Wert wird mit dem 2. Wert subtrahiert
	 * @param 1. Zahl 
	 * @param 2. Zahl
	 * @return Ergebnis der Subtration
	 */
	public static float subtrahiere(double a, double b){
		float ergebnis = (float) (a - b);
		return ergebnis;
	}
	
	/**
	 * 1. Wert wird mit dem 2. Wert multipliziert
	 * @param 1. Zahl
	 * @param 2. Zahl
	 * @return Ergebnis der Multiplikation
	 */
	public static float multipliziere(double a, double b){
		float ergebnis = (float) (a * b);
		return ergebnis;
	}
	
	/**
	 * 1. Zahl wird mit der 2. Zahl dividiert
	 * @param 1. Zahl
	 * @param 2. Zahl
	 * @return Ergebnis der Division
	 */
	public static float dividiere(double a, double b){
		float ergebnis = (float) (a / b);
		return ergebnis;
	}
	
	/**
	 * Der Volumen des Kegels wird berechnet
	 * @param radius
	 * @param hoehe
	 * @return Volumen eines Kegels mit den übergebenen Werten
	 */
	private static float kegel(double radius, double hoehe){
		double pi = 3.14159265358979323846264338327950288419716939937510582097494459;
		float ergebnis = (float) ( 0.33333334 * pi *  (radius * radius)  * hoehe   );
		// System.out.println("Das Volumen eines Kegels mit dem Radius " + radius + " und der Höhe " + hoehe + " beträgt " + ergebnis);
		return ergebnis;
		
	}
	
	/**
	 *  Optionen der Methode einlesen, berechnen und ausgeben
	 * @param 1. Zahl
	 * @param Rechenzeichen als String
	 * @param 2. Zahl
	 * @return Ergebnis der Rechnung
	 */
	private static double rechne(double a, String z, double b){

		
		switch(z){
		case "+" :
			return addiere(a, b);
		case "-" :
			return subtrahiere(a,b);
		case "/":
			dividiere(a,b);
			break;
		case "*":
			multipliziere(a,b);
			break;
		default : 
			System.out.println("Die Eingabe des Rechenzeichens konnte nicht erkannt werden");
		}
		}
	
}	// Ende der Rechner-Klasse
