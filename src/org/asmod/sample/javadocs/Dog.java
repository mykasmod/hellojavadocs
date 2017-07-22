package org.asmod.sample.javadocs;

/**
 * The Dog can make a sound and eat the food.
 * @author me
 *
 */
public class Dog extends Animal {

    @Override
    public String makeSound() {
	return "barks";
    }

    @Override
    public void eat(String food) {
	System.out.println("Dog is eating the " + food);
	
    }

   

}
