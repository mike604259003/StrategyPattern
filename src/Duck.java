
public abstract class Duck {
	
	QuackBehavior quackBehavior;
	FlyBehavior flyBehavior;

	public void perfromQuack() {
		quackBehavior.quack();

	}
	
	public void perfromFly() {
		flyBehavior.fly();
	}
	abstract public void swim() ;
	
    abstract public void display();
	
    public void setFlyBehavior(FlyBehavior fb) {
    	flyBehavior = fb;
    }
    
    public void setQuackBehavior(QuackBehavior qb) {
    	quackBehavior = qb;
    }
}

