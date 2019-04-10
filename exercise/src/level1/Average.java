package level1;

public class Average {

	public static void main(String[] args) {
		int[] num = {1,	2, 3, 4};
		double av = aver(num);
		System.out.println(av);

	}
    public static double aver(int[] num) {
    	int sum = 0;
    	double avg = 0;
        for (int i = 0; i < num.length; i++) {
			sum += num[i];
	
			avg = (double) sum / num.length;
	
		}
    	
    	return avg;
    }
}
