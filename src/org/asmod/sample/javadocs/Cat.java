package org.asmod.sample.javadocs;
/**  
 * Can make a sound and eat food. 
 * @author me
 * @see Behavior
 */
public class Cat extends Animal {
    /**
     * A Cat can make a sound.
     * @return A word "meows" 
     */
    @Override
    public String makeSound() {
	return "meows";
    }   
    /**
     * A Cat eats the food.
     * @param food The type of food it can eat.
     */
    @Override
    public void eat(String food) {
	System.out.println("Cat is eating the " + food);
    }

   
    
}
