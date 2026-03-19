package pr3.animal.model;

public class Cat extends Animal{
   public Cat (String name, int age ) {
	   super (name, age);
	   
   }

   @Override
   public void makeSound() {
	// TODO Auto-generated method stub
	System.out.println("meow");  }
}
