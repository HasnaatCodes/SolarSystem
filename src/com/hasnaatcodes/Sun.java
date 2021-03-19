package com.hasnaatcodes;

/**
* Class for the sun
* This class is an extension of the PointInSpace class
* This means that the variables are inherited and therefore no need to recreate the same variables
* The method moons takes in the parameters provided for it's respective element
* I used super to call the variables from the parent class (PointInSpace) to create the object.
*/

public class Sun extends PointInSpace
{
	public Sun(double distance, double angle, double diameter, String colour, double speed)
	{
		super (distance, angle, diameter, colour, speed);
	}
}