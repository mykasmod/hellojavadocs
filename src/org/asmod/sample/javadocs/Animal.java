package org.asmod.sample.javadocs;
/**
 * Can eat the food and do all other {@link Behavior}
 * @author me
 *
 */
public abstract class Animal implements Behavior {
    /**
     * Can eat the food.
     * @param food The food for the Animal to eat
     */
    public abstract void eat(String food);

}
