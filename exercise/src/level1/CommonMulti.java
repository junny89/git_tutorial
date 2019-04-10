package level1;

import java.util.Arrays;

public class CommonMulti {

	public static void main(String[] args) {
		int[] result = findCommon(13, 15);
		System.out.println("최대공약수: " + result[0]);
		System.out.println("최소공배수: " + result[1]);
        //System.out.println(findMaxGd(10, 15));
	    
	}
    // 두수의 최대공약수와 최소공배수를 배열로 리턴
	// 입력: 두 자연수
	// 리턴: int[]
	public static int[] findCommon(int m, int n) {
		//최대공약수
		int[] result = new int[2];
		
		result[0] = findMaxGd(m, n);
		result[1] = findgod(m, n);
		
		
		//최소공배수
		int gbb;
		if (m > n) {
			gbb = n;
		} else
			gbb = m;
		
		while (true) {
			if (m % gbb == 0 && n % gbb == 0) {
				break;
			}
			gbb++;
		}
			System.out.println(gbb);
		return null;
	}
	
	public static int findMaxGd(int m, int n) {
		int[] arr1 = findGB(m);
		int[] arr2 = findGB(n);
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		for (int i = arr1.length; i >= 0; i--) {
			for (int j = arr2.length; j >= 0; j--) {
				if (arr1[i] == arr2[i]) {
					return arr1[i];
				}
			}
		}
		return -1;
	}
	// 공약수
	public static int[] findGB(int num) {
		int count = 0;
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
			   count++;
			}
		}
		int idx = 0;
		int[] gb = new int[count];
		for (int i = 0; i <= num; i++) {
			if (num % i == 0) {
				gb[idx] = i;
				idx++;
			}
		}
		return gb;
	}
	public static int findgod(int m, int n) {
	    int k1 = 1;
	    int k2 = 1;
		int num1 = m * k1;
	    int num2 = n * k2;
		while (true) {
			if (num1 == num2) {
				return num1;
			}
			if (num1 < num2) {
				k1++;
				num1 = m * k1;
			} else {
				k2++;
				num2 = n * k2;
			} 
		}
	}
	//public static int findgbb(int m, int n) {
	//	int result = m * n / findMaxGd(m, n);
	}

