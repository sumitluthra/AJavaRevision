package staticNonStatic;

public class ThisKeyword {
	int x;

	/*
	 * there are two ways we can use non static members
	 * either by object reference or this keyword
	 * 
	 * this keyword can be used in just non static context
	 */
	public ThisKeyword() {
		// TODO Auto-generated constructor stub
		this(5);
		System.out.println(this);
		
	}
	
	public ThisKeyword(int x2) {
		// TODO Auto-generated constructor stub
		System.out.println("param cons-"+this);

	}

	static {
		//cannot use in static context (COMPILATION ERROR)
		//System.out.println(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		new ThisKeyword();
		new ThisKeyword();
	}

}
