package level1;

import java.util.Arrays;

public class FindKthNum {

	public static void main(String[] args) {
		int[] arr = {1, 5, 2, 6, 3, 7, 4};
		int[][] com = { {2, 5, 3}, 
				        {4, 4, 1}, 
				        {1, 7, 3} };
		
		int[] result = fktNum(arr, com);
		System.out.println(Arrays.toString(result));

	}
    public static int[] fktNum(int[] arr, int[][] ijk) {
    	int[] n = new int[ijk.length];
    	
    	for (int i = 0; i < ijk.length; i++) {
    		int[] fkn = Arrays.copyOfRange(arr, ijk[i][0]-1, ijk[i][1]);
    		Arrays.sort(fkn);
    	    System.out.println(Arrays.toString(fkn));
    	   
           n[i] = fkn[ijk[i][2]-1];
    	}
		
    	return n;
    }
}
