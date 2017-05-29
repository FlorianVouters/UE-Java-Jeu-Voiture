package fr.exia.insanevehicles.element.motionless;

import fr.exia.insanevehicles.element.Element;

/**
 * <h1>A factory for creating MotionlessElements objects.</h1>
 *
 * @author Jade
 * @version 0.1
 */
public abstract class MotionlessElementsFactory {

    /** The Constant DITCH. */
    private static final Ditch    DITCH    = new Ditch();
    private static final DitchRight DITCH_RIGHT = new DitchRight();
    private static final DitchLeft DITCH_LEFT = new DitchLeft();

    /** The Constant MACADAM. */
    private static final Macadam  MACADAM  = new Macadam();

    /** The Constant OBSTACLE. */
    private static final Obstacle OBSTACLE = new Obstacle();
    
    private static final Median MEDIAN = new Median();

    /**
     * Creates a new ditch object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createDitch() {
        return DITCH;
    }

    /**
     * Creates a new macadam object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createMacadam() {
        return MACADAM;
    }

    /**
     * Creates a new obstacle object.
     *
     * @return the motionless element
     */
    public static MotionlessElement createObstacle() {
        return OBSTACLE;
    }


	public static Element create(char c) {
		// TODO Implémenter la fonction
		switch (c) {
		case '|' : return createDitch();
		case 'X' : return createObstacle();
		case ' ' : return createMacadam();
		case '^' : return createMedian();
		case '/' : return createDitchRight();
		case '\\' : return createDitchLeft();
		}
		throw new IllegalArgumentException("Invalid Caracter" + c);
	}

	private static Element createDitchLeft() {
		// TODO Auto-generated method stub
		return DITCH_LEFT;
	}

	private static Element createDitchRight() {
		// TODO Auto-generated method stub
		return DITCH_RIGHT;
	}

	private static Element createMedian() {
		return MEDIAN;
	}
}
