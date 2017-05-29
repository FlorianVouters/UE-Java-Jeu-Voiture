package fr.exia.insanevehicles.element.mobile;

/**
 * <h1>A factory for creating MobileElements objects.</h1>
 *
 * @author Jade
 * @version 0.1
 */
public abstract class MobileElementsFactory {

    /** The Constant MYVEHICLE. */
    private static final MyVehicle 	MYVEHICLE 	= new MyVehicle();
    /**
     * Creates a new vehicle object.
     *
     * @return the mobile element
     */
    public static MyVehicle createMyVehicle() {
        return MYVEHICLE;
    }
}
