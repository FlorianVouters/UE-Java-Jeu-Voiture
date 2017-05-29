package fr.exia.insanevehicles;

public class Utilis {

    /**
     * @param delay en millisecondes
     */
    public static void sleep (long delay) {
    	try {
			Thread.sleep(delay);
		} 
    	catch (InterruptedException e) {
			System.exit(0);
		}
    }

	public static void clearConsole() {
		int repeat = 10;
		while (repeat-- > 0) System.out.println();	
	}
	
}
