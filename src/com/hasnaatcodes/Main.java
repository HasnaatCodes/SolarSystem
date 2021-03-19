package com.hasnaatcodes;

import java.util.Random;

/**
 * Solar System
 * @author Hasnaat Akhtar
 */

public class Main
{
	public static void main(String[] args)
	{
		//Creating the Solar System window and creating an instance of the Sun class 
		SolarSystem solar = new SolarSystem(700,700);
		Sun sun = new Sun(0, 0, 50, "YELLOW", 0);
		
		
		//Creating instances of the Planet classes for each of the Planet
		Planet Mercury = new Planet(65, 0, 20, "GREY", 5);
		Planet Venus = new Planet(90, 0, 20, "GREEN", 4);
		Planet Earth = new Planet(120, 0, 20, "BLUE", 3);
		Planet Mars = new Planet(150, 0, 20, "RED", 2);	
		Planet Jupiter = new Planet(280, 0, 20, "ORANGE", 2);
		
		
		//Creating instances of the Moon classes for each of the Moon
		Moon EarthMoon = new Moon(15, 30, 5, "WHITE", 4);
		Moon MarsFirstMoon = new Moon(15, 30, 5, "WHITE", 3);
		Moon MarsSecondMoon = new Moon(15, 60, 5, "WHITE", 3);
		
		
		Random randomNumber = new Random();
		
		
		//Using an array to create instances of Moon as Jupiter has multiple
		Moon[] jupiterMoon = new Moon[69];
		for (int i = 0; i < jupiterMoon.length; i++){
			jupiterMoon[i] = new Moon(randomNumber.nextInt(10) + 15, randomNumber.nextInt(100), randomNumber.nextInt(5), "WHITE", 3);
		}
		
		
		//Using an array to create instances of astroidBelts as there are many
		Planet[] astroidBelt = new Planet[500];
		for (int j = 0; j < astroidBelt.length; j++) {
			astroidBelt[j] = new Planet(randomNumber.nextInt(20) + 200, randomNumber.nextInt(500), randomNumber.nextInt(5), "GREY", 3);
		}
		
		
		//A never ending while loop to keep the Solar System displaying itself
		//Also calling the drawSolarObject and drawSolarObjectAbout for each object whilst sending in the parameters.
		while(true)
		{
			solar.drawSolarObject(sun.getDistance(), sun.getAngle(), sun.getDiameter(), sun.getColour());
			solar.drawSolarObject(Mercury.getDistance(), Mercury.move(), Mercury.getDiameter(), Mercury.getColour());
			solar.drawSolarObject(Venus.getDistance(), Venus.move(), Venus.getDiameter(), Venus.getColour());
			solar.drawSolarObject(Earth.getDistance(), Earth.move(), Earth.getDiameter(), Earth.getColour());
			solar.drawSolarObject(Mars.getDistance(), Mars.move(), Mars.getDiameter(), Mars.getColour());
			solar.drawSolarObject(Jupiter.getDistance(), Jupiter.move(), Jupiter.getDiameter(), Jupiter.getColour());
			
			solar.drawSolarObjectAbout(EarthMoon.getDistance(), EarthMoon.getAngle() + EarthMoon.move(), EarthMoon.getDiameter(), EarthMoon.getColour(), Earth.getDistance(), Earth.getAngle());
			solar.drawSolarObjectAbout(MarsFirstMoon.getDistance(), MarsFirstMoon.getAngle() + MarsFirstMoon.move(), MarsFirstMoon.getDiameter(), MarsFirstMoon.getColour(), Mars.getDistance(), Mars.getAngle());
			solar.drawSolarObjectAbout(MarsSecondMoon.getDistance(), MarsSecondMoon.getAngle() + MarsSecondMoon.move(), MarsSecondMoon.getDiameter(), MarsSecondMoon.getColour(), Mars.getDistance(), Mars.getAngle());
			
			
			//Using a for loop to create moon objects of Jupiter 
			for (int x = 0; x < jupiterMoon.length; x++)
			{
				solar.drawSolarObjectAbout(jupiterMoon[x].getDistance(), jupiterMoon[x].getAngle() + jupiterMoon[x].move(), jupiterMoon[x].getDiameter(), jupiterMoon[x].getColour(), Jupiter.getDistance(), Jupiter.getAngle());
			}
			
			
			//Using a for loop to create astroidBelt objects 
			for (int y = 0; y < astroidBelt.length; y++)
			{
				solar.drawSolarObject(astroidBelt[y].getDistance(), astroidBelt[y].move(), astroidBelt[y].getDiameter(), astroidBelt[y].getColour());
			}
			
			solar.finishedDrawing();
			
		}
	}
	
}