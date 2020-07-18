package main;

import fruits.Orange;
import kitchen.Blender;
import kitchen.Cup;

public class Application {

	public static void main(String[] args) {
		
		Orange smallOrange = new Orange(50); // Hw1: 10gr ...1000 gramm zawita limit
		Orange mediumOrange = new Orange(100);
		Orange bigOrange = new Orange(200);
		
		Blender cheapBlender = new Blender("F1rts");
		
		Cup bigCup = new Cup();
		bigCup.setContent( cheapBlender.makeJuice(smallOrange) );
		Cup mediumCup = new Cup();
		mediumCup.setContent( cheapBlender.makeJuice(mediumOrange) );
		Cup justCup = new Cup();
		justCup.setContent( cheapBlender.makeJuice(bigOrange) );
		
		
		System.out.println( "We have " + bigCup.getContent().getVolume() + " mll of juice" );
		System.out.println( "We have " + mediumCup.getContent().getVolume() + " mll of juice" );
		System.out.println( "We have " + justCup.getContent().getVolume() + " mll of juice" );
		
		System.out.println()
		;
		System.out.print( "We have total mll of juice " );
		System.out.print( smallOrange.getWeight() + mediumOrange.getWeight() + bigOrange.getWeight());
		
		
		

	}

}
