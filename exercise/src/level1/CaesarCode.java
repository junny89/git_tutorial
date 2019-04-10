package level1;

public class CaesarCode {

	public static void main(String[] args) {
		String result = "AB";
		CaesarCode cc = new CaesarCode();
		System.out.println(cc.solution(result, 1));

	}
	/*
	 * "ABC" -> ['A', 'B', 'C']
	 * 
	 *  'Y' (89) + 5 = (94-26) --> 'D' (68) 
	 */
	 public String solution(String s, int n) {
	      // String --> char[]
	      char[] arr = s.toCharArray();
	      for (int i = 0; i < arr.length; i++) {
			if (Character.isAlphabetic(arr[i])) {
				int ch = arr[i] + n;
				if (!Character.isAlphabetic(ch)) {
					ch -= 26;
				}
				arr[i] = (char)ch;
			}
		}
			
	      return new String(arr);
	 }
}
