/*Q1) Write a program to create an abstract class named Shape that contains two integers and an empty 
method named printArea(). Provide three classes named Rectangle, Triangle and Circle such that each 
one of the classes extends the class Shape. Each one of the classes contain only the method printArea() 
that prints the area of the given shape. (use method overriding). [10 marks] */

import java.util.*;
abstract class shape
{
   int x,y;
   abstract void area(double x,double y);
}
class Rectangle extends shape
{
	void area(double x,double y)
	{
	    System.out.println("Area of rectangle is :"+(x*y));
	}
}
class Circle extends shape
{
	void area(double x,double y)
	{
	   System.out.println("Area of circle is :"+(3.14*x*x));
	}
}
class Triangle extends shape
{
	void area(double x,double y)
	{
	   System.out.println("Area of triangle is :"+(0.5*x*y));
	}
}
public class Slip22_1
{
  public static void main(String[] args)
  {
	Rectangle r=new Rectangle();
        r.area(2,5);
	Circle c=new Circle();
	c.area(5,5);
	Triangle t=new Triangle();
	t.area(2,5);
  }
}