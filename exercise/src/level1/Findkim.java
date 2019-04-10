package level1;

public class Findkim {

	
	public static void main(String[] args) {
		String[] k = {"fghf","jane","KIM","seo"};
		String result = kimmy(k);
		System.out.println(result);

	}
	//
    public static String kimmy(String[] k) {
        String kim;
    	for (int i = 0; i < k.length; i++) {
			if (k[i].equalsIgnoreCase("kim")) {
				kim =("김서방은"+ i +"에 있다");
				return kim;
			} 
    } 
    	return null;
 }
}