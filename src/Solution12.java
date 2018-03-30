
public class Solution12 {
	public static void main(String[] argh) {
		foodFactory myFoods = new foodFactory();
		Food food1 = myFoods.getFood("Fastfood");
		Food food2 = myFoods.getFood("Fruits");
		System.out.println("My name is: " + food1.getClass().getName());
		System.out.println("My name is: " + food2.getClass().getName());
		System.out.println("Our superclass is: " + food1.getClass().getSuperclass().getName());
		food1.serveFood();
		food2.serveFood();
	}
}

// Write your code here
class foodFactory extends Solution12 {
	Food getFood(String type) {
		if (type.equalsIgnoreCase("Fastfood")) {
			return new Fastfood();
		} else
			return new Fruits();
	}
}

class Food extends Solution12 {
	void serveFood() {
		System.out.println("I'm serving Food");
	}
}

class Fastfood extends Food {
	void serveFood() {
		System.out.println("I'm serving Fastfood");
	}
}

class Fruits extends Food {
	void serveFood() {
		System.out.println("I'm serving Fruits");
	}

}
