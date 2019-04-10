package level1;

public class HidePNum {

	public static void main(String[] args) {
		String pn = "010-2344-1352";
		
		String a = solution(pn);
		
		System.out.println(a);

	}
    public static String solution(String pn) { 
    	String hpn = "";
    	// *Character.isDigit*
    	for (int i = 0; i < pn.length() - 4; i++) {
    		hpn += "*";
    	}
    	hpn += pn.substring(pn.length() - 4, pn.length());
    	
    	return hpn;
    }
}
