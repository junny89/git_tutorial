package level1;

import java.util.Arrays;

public class SelectSort {

	public static void main(String[] args) {
		int[] a = {-10, 3, -2, 1, -7, 10};
		//System.out.println(findMinIndex(a, 5));
		int[] sortedArray = selectSort(a);
		System.out.println(Arrays.toString(sortedArray));

	}
    public static int[] selectSort(int[] arr) {
    	int[] sorted = new int[arr.length];
    	System.arraycopy(arr, 0, sorted, 0, arr.length);
    	
    	// 선택정렬 수행 
        for (int i = 0; i < arr.length-1; i++) {
			// 선택정렬 단계별 수행
        	// 1.위치 결정 - 위치는 [i]
        	// 2.최소값을 결정
        	// i에서 배열의 끝까지 중에 최소값의 인덱스
        	int index = findMinIndex(sorted, i);
        	if (i != index) {
        		// i번째와 findMinIndex함수가 리턴한 인덱스의 값 교체
        		int temp = sorted[i];
        		sorted[i] = sorted[index];
        		sorted[index] = temp;
        	}
        
		}
    	
    	return sorted;
    }
    // 주어진 배열에서 index부터 끝까지의 값들 중
    // 최소값을 가지고 있는 인덱스를 리턴
    public static int findMinIndex(int[] arr, int index) {  
    	int min = index;
    	for (int i = index; i < arr.length; i++) {
			if (arr[min] > arr[i]) {
				min = i;
			}
		}
    	return min;
    }
}
