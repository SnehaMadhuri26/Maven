
public class regExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   System.out.println("&at".matches("[^f]at"));
	        System.out.println("@at".matches("[^A-Fa-z]at"));
	        System.out.println("cat".matches("cat"));
	        System.out.println("cat".matches("Cat"));
	    System.out.println("clat".matches("cat"));

	}

}
