package level1;

public class Watermelon {

	public static void main(String[] args) {
		int n = 5;
		String wm =waterMl(n);
		
	    System.out.println(wm);

	}
    public static String waterMl(int n) {
    	String water = "";
    	int c = 0;
    	for (int i = 0; i < n; i++) {
			if (c == 0) {
				water += "수";
				c++;
			} else {
				water += "박";
				c--;
			}
		}
  
		return water;
    }
}
