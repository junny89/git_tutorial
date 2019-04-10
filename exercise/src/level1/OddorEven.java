package level1;

public class OddorEven {

	public static void main(String[] args) {
		int num = 9;
		String oe = oddEv(num);
		System.out.println(oe);
	}
    public static String oddEv(int num) {
    	String a = "";
    	if (num % 2 == 0) {
			System.out.println("Even");
		} else
			System.out.println("Odd");
    	
    	return a;
    }
    
}
