package PatoLoko;

public class TestDuck {

	public static void main(String[] args) {
		
		Duck duck1 = new Duck();
		MallardDuck duck2 = new MallardDuck();
		RedHeadDuck duck3 = new RedHeadDuck();
		RubberDuck duck4 = new RubberDuck();
		WoodDuck duck5 = new WoodDuck();
		
		duck1.display();
		duck1.quack();
		duck1.swim();
		duck1.fly();
		System.out.println("");
		
		duck2.display();
		duck2.swim();
		duck2.quack();
		duck2.fly();
		System.out.println("");
		
		duck3.display();
		duck3.swim();
		duck3.quack();
		duck3.fly();
		System.out.println("");

		duck4.display();
		duck4.fly();
		duck4.quack();
		duck4.swim();
		System.out.println("");

		duck5.display();
		duck5.swim();
		duck5.quack();
		duck5.fly();
		System.out.println("");
		
	}
}
