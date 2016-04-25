package Animals;

public class Cat implements Animal,Pets {
@Override
	public void display(){
	System.out.println("Cat Displayed");
	
}
@Override
public void eat(){
	System.out.println("Cat eats");
}
@Override
public void move(){
	System.out.println("Cat Moves");
}
@Override
public void Friendly(){
	System.out.println("Cat is Friendly");
}
@Override
public void Play(){
	System.out.println("Cat can Play");
}

}
