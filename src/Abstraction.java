/* Abstraction: is hiding the implementation of any method, it has signatures only
 * In other words user will have the information on what the object does instead of how it does it.
 */

abstract class Human {
	public void brethe(){
		System.out.println("All human brethes! I don't think there are different ways of brething.");
	}
	
	/* yes different people can eat, different kinds of food, so no implementation here
	 * abstract keyword is used for abstraction, child class will have to implement this if not that is abstract itself
	 */
	public abstract void eat();
}

abstract class Asian extends Human {
	public void complexion() {
		System.out.println("We Asians are not that fair like White people. :P ");
	}
	
	/* Asian class also doesn't want to implement it, hence abstract itself
	 * child class will implement this method
	 */
	public abstract void eat();
}

class Me extends Asian {
	/* Here I am implementing the parent class's method eat */
	public void eat() {
		System.out.println("Yes I eat. I love Indian food most.");
	}
}

class MyGirlfriend extends Asian {
	/* Me and MyGirlFriend both are derived from Asian, and both have different eating style hence different implementation at child class level */
	public void eat() {
		System.out.println("Yes yes she also eats. But she likes non indian food most, u know Pasta.  ;)");
	}
}

public class Abstraction{
	public static void main(String[] args) {
		Human me = new Me();
		Human gf = new MyGirlfriend();
		
		me.brethe();
		gf.brethe();
		me.eat();
		gf.eat();
		
		/* We can't use complexion method as Human class doesn't have that method 
		 * So, we have to either instantiate an object of type Asian or Me or MyGirlfriend
		 * */
		Me debo = new Me();
		debo.complexion();
	}
}

/* Few Points: 
 *  We could use interface instead of abstract class, but in that case we had to implement brethe() method in Asian class.
 *  And using abstract class, we can directly use the implementation of brethe() method of Parent, interface can't have an implementation of any method
 */
