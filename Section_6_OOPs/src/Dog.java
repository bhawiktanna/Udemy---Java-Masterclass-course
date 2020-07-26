
public class Dog extends Animal{

	
	
	private int eyes, legs, tail, teeth;
	private String coat;
	
	
	public Dog(int size, int weight, String name,int eyes, int legs,int tail,int teeth,String coat) {
		super(1, 1, size, weight, name);
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
		
	}
	
	public void chew() {
		System.out.println("Dog.chew() called ");
	}
	
	@Override
	public void eat() {
		System.out.println("Dog.eat() called");
		super.eat();
	}
	
	public void walk() {
		System.out.println("Dog.walk()");
		super.move(5);
	}
	public void run() {
		System.out.println("Dog.run()");
		super.move(10);
	}
	
}
