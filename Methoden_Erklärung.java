package methoden;

public class test {

  /**
	 * @author Stefan
	 * @category Methods
	 */
	public static void main(String[] args) {
		
		// so im Programm einfach verwendbar :
		System.out.println(addiere(6,2));
		
		// Oder noch besser und in einer Variable abgespeichert :
		int lösung;
		lösung = addiere(6, 2);
		
		/**
		 * Hier im Beispiel ist 6 "zahl1"
		 * 					und 7 "zahl2"
		 * 
		 * Also sieht das bei der Methode dann so aus :
		 * 
		 * addiere( Integer 6, Integer 2)
		 * int ergebnis [ Die Variable `ergebnis´ ist nur für die Methode ! ] = 6 + 2;
		 * 
		 * return 6; 
		 */

		 // In unserer Variable wird also jetzt für "lösung" die return-Variable gesetzt, also 6
		System.out.println(lösung);
	}
	
	
	/**
	 * public static void INT <- Das bedeutet, dass das Ergebnis der Methode als Integer zurückgegeben wird ( bzw muss es auch so deklariert werden  [int ergebnis] )
	 *  -> addiere(int zahl1, int zahl2)   zahl1 und zahl2 sind einfach festgelegte Variablen für die Methode. 
	 *  									Das jeweilige "int" davor bedeutet, dass der Wert, der dort aufgerufen wird ein Integer ist.
	 * 
	 * @param Erste Zahl als Integer
	 * @param Zweite Zahl als Integer
	 * @return Das Ergebnis der Addition
	 */
	public static int addiere(int zahl1, int zahl2){
		int ergebnis = zahl1 + zahl2;
		return ergebnis;
	}

}
