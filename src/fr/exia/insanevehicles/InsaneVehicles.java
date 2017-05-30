package fr.exia.insanevehicles;

import java.io.IOException;

/**
 * <h1>The Class InsaneVehicles.</h1>
 *
 * @author Jade
 * @version 0.1
 */
public abstract class InsaneVehicles {

    /**
     * The main method.
     *
     * @param args
     *            the arguments
     * @throws IOException
     *             Signals that an I/O exception has occurred.
     */
    public static void main(final String[] args) throws IOException {
        final InsaneVehiclesGames insaneVehiclesGame = new InsaneVehiclesGames();
        insaneVehiclesGame.play();
    }
}