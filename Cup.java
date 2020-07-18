package kitchen;

import liquids.Juice;

public class Cup {
	
	private Juice content;

	// HW constructor + not null
	
	// Constructor
	public Cup() {}
	public Cup(Juice content) {
		this.content = content;
	}

	// Setter + Getter
	public Juice getContent() {
		return content;
	}
	
// Protect content
	public void setContent(Juice content) {
		if(content != null)
		this.content = content;
		else System.out.println("Wrong content. Try again");
	}
	
	public void addContent(Juice content) {
		Juice accumulator = new Juice(content.getVolume() + this.content.getVolume());
		this.content = accumulator;
	}

}
