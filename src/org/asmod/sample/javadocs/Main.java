/**
 * 
 */
package org.asmod.sample.javadocs;

/**
 * @author me
 * An entry point of the application.
 */
public class Main {

    /**
     * 
     * Creates new instance of Cat and Dog. 
     * Prints the sounds they can make, and Prints the food they eat.
     * @param args An array of String arguments you can pass to your application.
     */
    public static void main(String[] args) {
	Cat cat = new Cat();
	System.out.println("Cat " + cat.makeSound());
	cat.eat("Fish");
	
	Dog dog = new Dog();
	System.out.println("Dog " + dog.makeSound());
	dog.eat("Bones");
    }

}
