package ExceptionHandlingUsingFinally;

public class ExceptionHandling {

	public String FinallyBlock() {
		try {
			System.out.println("test");
			return "Return from try block";
			
		} finally {
			System.out.println("Return from finally block after return statement");
		}
	}

	public static void main(String args[]) {
		System.out.println(new ExceptionHandling().FinallyBlock());
	}

}
