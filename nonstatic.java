package BasicsOfJava;

public class nonstatic {
	public void sum()
	{
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
		
	}
	public void subtract()
	{
		int a=20;
		int b=10;
		int c= a-b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		nonstatic check = new nonstatic();
		check.sum();
		check.subtract();
	}

}
