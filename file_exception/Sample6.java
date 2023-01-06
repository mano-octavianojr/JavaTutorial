package file_exception;

public class Sample6 {

	
	// There are some instances that you might get an error while executing your code.
	// Thus, better if you put try-catch all the time.
	public static void main(String[] args) {
		
		int[] array = new int[3]; // only 3 elements
		
		array[1000] = 3;   // we are trying to put value in 999th.
		                   // check the error.
		
	}
	
}
