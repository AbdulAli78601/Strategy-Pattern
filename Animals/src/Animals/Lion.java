package Animals;

public class Lion implements Animal {
	@Override
	public void display(){
		System.out.println("Lion Displayed");
	}
	@Override
	public void eat(){
		System.out.println("Lion eats");
	}
	@Override
	public void move(){
		System.out.println("Lion moves");
	}


}
