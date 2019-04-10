package level1;

import java.util.Arrays;

public class HateSNum {

	public static void main(String[] args) {
		int[] abc = {1, 1, 5, 0, 0, 4, 4, 3};
		int[] b = bcd(abc);
		System.out.println(Arrays.toString(b));
	}
	
    public static int[] bcd(int[] abc) {
    	int[] ac;
    	int count = 1;
    	
    	for (int i = 1; i < abc.length; i++) {
			if (abc[i-1] != abc[i]) {
				count++;
			}
		}
    	//System.out.println(count);
    	ac = new int[count];
    	
    	count = 1;
    	ac[0] = abc[0];
    	
    	for (int i = 1; i < abc.length; i++) {
	        if (abc[i-1] != abc[i]) {
				ac[count] = abc[i];
				count++;
			}
		}
    	return ac;
    }
}
