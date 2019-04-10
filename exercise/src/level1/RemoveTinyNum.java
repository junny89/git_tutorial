package level1;

import java.util.Arrays;

public class RemoveTinyNum {

	public static void main(String[] args) {
		int[] arr = {10, 12};
		RemoveTinyNum rtn = new RemoveTinyNum();
		System.out.println(Arrays.toString(rtn.solution(arr)));

	}
	public int[] solution(int[] arr) {
		if (arr.length == 1) {
			   return new int[] {-1};
			}	
		int min = arr[0];
		for (int i = 0; i < arr.length; i++) {
			if (min > arr[i]) {
				min = arr[i];
			}
		}
		int[] result = new int[arr.length-1];
		
		int rIdx = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != min) {
				result[rIdx] = arr[i];
				rIdx++;
		}
	}
	    return result;
	}
}    
