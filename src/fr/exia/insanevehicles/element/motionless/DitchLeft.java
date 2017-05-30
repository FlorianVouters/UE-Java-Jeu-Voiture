package fr.exia.insanevehicles.element.motionless;

import fr.exia.insanevehicles.element.Permeability;

/**
 * <h1>The Class DitchLeft.</h1>
 *
 * @author Jade
 * @version 0.1
 */
class DitchLeft extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final char SPRITE = '/';

    /**
     * Instantiates a new ditchLeft.
     */
    DitchLeft() {
        super(SPRITE, Permeability.BLOCKING);
    }
}
