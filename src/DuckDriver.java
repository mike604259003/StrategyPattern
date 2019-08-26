
public class DuckDriver {

	

	public static void main(String[] args) {
		Duck dduck = new DonaldDuck();
		dduck.perfromFly();
		dduck.perfromQuack();
		dduck.swim();
		dduck.display();
		dduck.setFlyBehavior(new FlyWithWing());
		dduck.perfromFly();
		dduck.setFlyBehavior(new FlyWithRocket());
		dduck.perfromFly();
		
		
		System.out.println("-----------------------------------------------------------");
		Duck mduck = new MallardDuck();
		mduck.perfromFly();
		mduck.perfromQuack();
		mduck.swim();
		mduck.display();
	}

}
