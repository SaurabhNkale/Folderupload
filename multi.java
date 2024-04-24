package BasicsOfJava;

public class multi {
	public static void check () {
		int a =1;
		int b= 2;
		int c= a*b;
		System.out.println(c);
	}
	
	public void div() {
		int a =4;
		int b= 2;
		int c =a/b;
		System.out.println(c);
	}
	
	public static void main(String[] args) {
		
		multi divide = new multi();
		divide.div();
		
		int a = 2;
		int b =3;
		int c= a*b;
		System.out.println(c);
		multi.check();
		
	
	}

}
