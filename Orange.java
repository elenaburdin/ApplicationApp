package fruits;

// Concrete class
public class Orange {
	
	private int weight; // gramms
	
	// Constructors
	public Orange() {}
	public Orange(int weight) {
		setWeight(weight);
	}

	// Setter + Getter
	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		if( weight >= 10 && weight <= 1000 ) 
		this.weight = weight;
		else {
			System.out.println("Wrong weight");
		}
	}

}


