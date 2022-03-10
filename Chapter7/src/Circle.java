/*

Program: TimeConverter.java          Last Date of this Revision: November 4, 2021

Purpose: MOdify the Circle class to include a member method named circumference. 
Author: Mahr Mohammad. 
School: CHHS
Course: Computer Programming 20
 

*/

public class Circle  
{
	private double radius;
	
	 public Circle() 
	 {
		 radius=1;
	 }
	
	 public Circle(double R) 
	 {
		 radius=R;
	 }
	
	 public void setRadius (double newRadius) 
	  {
		 radius =newRadius;
	  }
	
	 public double getRadius () 
	 {
		 return(radius);
	 }
	 
	 public double area()
	 {
		 double rectArea;
		 
		 rectArea = Math.PI * (radius * radius);
		 return (rectArea);
	 }
	 
	 public double circumferenc () 
	 {
		double rectCircumferenc; 
		
		rectCircumferenc = 2* Math.PI * radius;
		return (rectCircumferenc);
		
	 }
	 
	 public String toSting() 
	 {
		 String circleString;
		 
		 circleString = "Circle radius "+radius;
		 return (circleString);
	 }
	 
	 
	 
	 
}
