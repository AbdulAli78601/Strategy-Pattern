package Animals;

public class Wolf implements Animal {
	@Override
	public void display(){
		System.out.println("Wolf Displayed");
		
	}
	@Override
	public void eat(){
		System.out.println("Wolf eats");
	}
	@Override
	public void move(){
		System.out.println("Wolf Moves");
	}


}
