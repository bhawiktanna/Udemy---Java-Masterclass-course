
public class Animal {
	private int brain,body,size,weight;
	private String name;
	
	public Animal(int brain, int body, int size, int weight, String name) {
		super();
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
		this.name = name;
	}
	
	public void eat() {
		System.out.println("eat()");
	}
	
	public void walk() {
		
	}
	public void move(int speed) {
		System.out.println("Animal is moving at"+speed+"speed");
	}

	public int getBrain() {
		return brain;
	}

	public void setBrain(int brain) {
		this.brain = brain;
	}

	public int getBody() {
		return body;
	}

	public void setBody(int body) {
		this.body = body;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
