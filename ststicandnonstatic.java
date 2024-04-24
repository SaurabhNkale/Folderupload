package BasicsOfJava;

public class ststicandnonstatic {
	
	public static void animal() {
		int dog= 10;
		System.out.println(dog);
	}
	public void car() {
		int bmw = 5;
		System.out.println(bmw);
	}
	public static void main(String[] args) {
	 ststicandnonstatic.animal();
	 
	 ststicandnonstatic myobj = new ststicandnonstatic();
	 myobj.car();
	}

}
