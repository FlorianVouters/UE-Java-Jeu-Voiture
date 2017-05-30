package fr.exia.insanevehicles.element.motionless;

import fr.exia.insanevehicles.element.Permeability;

/**
 * <h1>The Class Tree.</h1>
 *
 * @author Jade
 * @version 0.1
 */
class Tree extends MotionlessElement {

    /** The Constant SPRITE. */
    private static final char SPRITE = '^';

    /**
     * Instantiates a new tree.
     */
    Tree() {
        super(SPRITE, Permeability.BLOCKING);
    }
}