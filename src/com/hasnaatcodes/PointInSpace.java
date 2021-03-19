package com.hasnaatcodes;

/**
* I have created instance variables here which will be used to create the objects
* These will determine where on the screen will the object be and whether it is moving or not depending on the initialisation.
*/

public class PointInSpace
{
	private double distance;
	private double angle;
	private double diameter;
	private String colour;
	private double speed;
	private double move;
	
	/**
	* In this constructor we are initialising all the variables to whatever value is passed in using the parameter.
	*/
	public PointInSpace(double distance, double angle, double diameter, String colour, double speed)
	{
		this.distance = distance;
		this.angle = angle;
		this.diameter = diameter;
		this.colour = colour;
		this.speed = speed;
	}
	
	/**
	* Creating methods which return variables when called in other classes as the variables have been encapsulated.
	*/
	public double move()
	{
		angle += speed;
		return angle;
	}
	
	public double getDistance()
	{
		return distance;
	}
	
	public double getAngle()
	{
		return angle;
	}
	
	public double getDiameter()
	{
		return diameter;
	}
	
	public String getColour()
	{
		return colour;
	}
	
	public double getSpeed()
	{
		return speed;
	}
}



