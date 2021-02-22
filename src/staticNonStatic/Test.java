package staticNonStatic;

import java.util.stream.Stream;

public class Test {
	
	int x;
	{
		System.out.println(
				"non static block is associated with object, so it will be "
				+ "invoked everytime object is created");
	}
	static {
		Test t1 = new Test();
		t1.x=2;
		System.out.println("Static Block..."+t1.x);
	}

	public Test() {
		// TODO Auto-generated constructor stub
		System.out.println("inside constructor");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Main Method");
		new Test();
		
		/*
		 * If we dont create default constructor, JVM will create one for us
		 * But if we have parameterized constructor, then default constructor will not 
		 * be made automatically
		 */
		Test t = new Test();
		System.out.println(t.x);
		
		String key = "Sumit";
		
		switch (key) {
		case "SumIT":
			System.out.println("1 case");
			break;
		case "Sumit":
			System.out.println("2 case");
					
		case "Sumit11":
			System.out.println("3 case");
			break;
		default:
			System.out.println("No match");
			break;
		}
	}

}
