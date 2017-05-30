package fr.exia.insanevehicles.element.motionless;

import fr.exia.insanevehicles.element.Element;
import fr.exia.insanevehicles.element.Permeability;

/**
 * <h1>The Class MotionlessElement.</h1>
 *
 * @author Jade
 * @version 0.1
 */
abstract class MotionlessElement extends Element {

    /**
     * Instantiates a new motionless element.
     *
     * @param sprite
     *            the sprite
     * @param permeability
     *            the permeability
     */
    MotionlessElement(final char sprite, final Permeability permeability) {
        super(sprite, permeability);
    }

}
