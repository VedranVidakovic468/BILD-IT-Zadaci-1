package zadaci_18_02_2016;

/*
 * (The Colorable interface) Design an interface named Colorable with a void method named howToColor(). 
 * Every class of a colorable object must imple- ment the Colorable interface.
 *  Design a class named Square that extends GeometricObject and implements Colorable.
 *   Implement howToColor to display the message Color all four sides.
Draw a UML diagram that involves Colorable, Square, and GeometricObject. 
Write a test program that creates an array of five GeometricObjects.
 For each object in the array, display its area and invoke its howToColor method if it is colorable.
 */
public interface Colorable
{
	//void method how to color
	void howToColor();
}
