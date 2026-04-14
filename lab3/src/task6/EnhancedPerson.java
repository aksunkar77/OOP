package task6;

import people.Person;


public class EnhancedPerson extends Person implements Comparable<EnhancedPerson>, Cloneable, Movable {
 
 public EnhancedPerson(String name, int age) {
     super(name, age);
 }

 @Override
 public int compareTo(EnhancedPerson other) {
     return Integer.compare(this.getAge(), other.getAge());
 }

 @Override
 public Object clone() throws CloneNotSupportedException {
     return super.clone();
 }


 @Override
 public void move() {
     System.out.println(getName() + " is walking to work.");
 }

 @Override
 public String getOccupation() {
     return "Enhanced General Person";
 }

 @Override
 public String getID() {
	
	return null;
 }
}
