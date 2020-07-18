package kitchen;

import fruits.Orange;
import liquids.Juice;

public class Blender {
	
	private String brand;

	// Constructor
	public Blender() {}
	public Blender(String brand) {
		setBrand(brand); 
	}

	// Setter + Getter
	public String getBrand() {
		return brand;
	}
	
	// protect brand
	public void setBrand(String brand) {
		if( brand != null && brand != ("") )
		this.brand = brand;
		else System.out.println( "Wrong brand. PLease insert a brand name" );// HW2 not "", not null zawita
	} 
	
	/**
	 * Returns a new object of Juice type taking an Orange object
	 * @param orange - an object that represents a fruit
	 * @return - an object of juice type
	 */	
	
	public Juice makeJuice(Orange orange) {
		Juice juice = new Juice(orange.getWeight());
		return juice;
	}

}


