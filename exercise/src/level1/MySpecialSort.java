package level1;

import java.util.Arrays;

public class MySpecialSort {

	public static void main(String[] args) {
		String[] a = {"sun","bed","car"};
	
		MySpecialSort sort = new MySpecialSort();	
		String[] sorted = sort.solution(a, 2);
		System.out.println(Arrays.toString(sorted));
	}
    
	public String[] solution(String[] str, int index) {
		String[] sorted = new String[str.length];
    	System.arraycopy(str, 0, sorted, 0, str.length);
		
    	for (int i = 0; i < sorted.length-1; i++) {
    	    
    		int idx = findMinIndex(sorted, i, index);
    		if (i != idx) {
        		
        		String temp = sorted[i];
        		sorted[i] = sorted[idx];
        		sorted[index] = temp;
        	}
    	  }
    	
    	return sorted;
    }

	private int findMinIndex(String[] str, int start, int strIndex) {
		int minIdx = start;
		for (int i = start; i < str.length; i++) {
			if (str[minIdx].charAt(strIndex) > str[i].charAt(strIndex)) {
				minIdx = i;
			} else if (str[minIdx].charAt(strIndex) == str[i].charAt(strIndex)) {
				if (str[minIdx].compareTo(str[i]) > 0) {
					minIdx = i;
				}
			}
		}	
		return minIdx;
	}
}
