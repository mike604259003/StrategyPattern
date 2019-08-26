
public class DonaldDuck extends Duck {
	
	public DonaldDuck() {
		quackBehavior = new MuteQuack();
		flyBehavior = new FlyNoWay();
		
	}
	@Override
	public void display() {
		System.out.println("I'm a real Donald Duck najaaaa");

	}
	
	public void swim() {
		System.out.println("I'm swimming free style");
	}

}
