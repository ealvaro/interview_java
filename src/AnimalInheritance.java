/*
Declares an abstract class named Animal with the implementations for getIsMammal() and getIsCarnivorous() methods,
 as well as an abstract method named getGreeting().
Creates Dog, Cow, and Duck objects.
Calls the getIsMammal(), getIsCarnivorous(), and getGreeting() methods on each of these respective objects.
See Diagram Animal_Inheritance.png

INPUT
Three classes named Dog, Cow, and Duck that inherit from the Animal class.
No-argument constructors for each class that initialize the instance variables inherited from the superclass.
Each class must implement the getGreeting() method:
For a Dog object, this must return the string ruff.
For a Cow object, this must return the string moo.
For a Duck object, this must return the string quack.
OUTPUT
A dog says 'ruff', is carnivorous, and is a mammal.
A cow says 'moo', is not carnivorous, and is a mammal.
A duck says 'quack', is not carnivorous, and is not a mammal.
 */
abstract class Animal {
	protected boolean isMammal;
	protected boolean isCarnivorous;

	Animal(){};
//	Animal(boolean isA, boolean isC) {
//		this.isMammal = isA;
//		this.isCarnivorous = isC;
//	}
	
	public boolean isMammal() {
		return isMammal;
	}

	public boolean isCarnivorous() {
		return isCarnivorous;
	}
	
	String say() {
		return "A "+ this.getClass().getName().toLowerCase() +" says "+getGreeting()+", is "+ (this.isCarnivorous ? "carnivorous" : "not carnivorous") + ", and is "+ (this.isMammal ? "a mammal" : "not a mammal"); 
	}

	abstract String getGreeting();
	
}

class Dog extends Animal {
	Dog() {
		isMammal = true;
		isCarnivorous = true;
	}

	String getGreeting() {
		return "'ruff'"; 
	}
}

class Cow extends Animal {
	Cow() {
		isMammal = true;
		isCarnivorous = false;
	}

	String getGreeting() {
		return "'moo'"; 
	}
}

class Duck extends Animal {
	Duck() {
		isMammal = false;
		isCarnivorous = false;
	}

	String getGreeting() {
		return "'quack'"; 
	}
}



public class AnimalInheritance {
	
	public static void main (String[] args) {
		Dog d = new Dog();
		Cow c = new Cow();
		Duck du = new Duck();
		System.out.println(d.say());
		System.out.println(c.say());
		System.out.println(du.say());
	}
}
