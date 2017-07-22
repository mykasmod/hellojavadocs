package org.asmod.sample.javadocs;
/**
 * Eats the food and do all other {@link Behavior}
 * @author me
 *
 */
public abstract class Animal implements Behavior {
    /**
     * Can eat the food. The food should be of type String. 
     * @param food The food for the Animal to eat
     */
    public abstract void eat(String food);

}
