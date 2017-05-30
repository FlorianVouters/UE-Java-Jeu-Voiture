package fr.exia.insanevehicles.element.motionless;

import fr.exia.insanevehicles.element.Permeability;

/**
 * <h1>The Class DitchRight.</h1>
 *
 * @author Jade
 * @version 0.1
 */
class DitchRight extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final char SPRITE = '\\';

    /**
     * Instantiates a new ditchRight.
     */
    DitchRight() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
