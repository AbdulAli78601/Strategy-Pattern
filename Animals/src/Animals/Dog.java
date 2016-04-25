package Animals;

public class Dog implements Animal,Pets {
	@Override
	public void display(){
		System.out.println("Dog Displayed");
		
	}
	@Override
	public void eat(){
		System.out.println("Dog eat");
	}
	@Override
	public void move(){
		System.out.println("Dog move");
	}
	@Override
	public void Friendly(){
		System.out.println("Dog is friendly");
	}
	@Override
	public void Play(){
		System.out.println("Dog can play");
	}


}
