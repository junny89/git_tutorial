package level1;

import java.util.Arrays;

public class WhoFailedPlayer {

	public static void main(String[] args) {
	    String[] ppt = {"leo", "park", "jeon", "seo", "moon"};
	    String[] cpt = {"park", "leo", "jeon", "seo", "moon"};	
	    
	    String name = wfp(ppt, cpt);
	    System.out.println("미완주 선수: " + name);

	}
	// 완주하지 못한 선스의 이름을 찾는 메소드
	// 입력: 참가자의 이름배열, 완주자의 이름배열
	// 리턴: 완주하지 못한 선수이름
    public static String wfp(String[] ppt, String[] cpt) {
    	String answer = "";
    	boolean a = false;
    	for (int i = 0; i < ppt.length; i++) {
    		a = true;
    		for (int j = 0; j < cpt.length; j++) {
				if (ppt[i].equals(cpt[j])) {
					cpt[j] = null;
					a = false;
					break;
				}  
					
			}
				if (a) {
					answer += ppt[i];
				}
			}
		return answer;
	
    	
    }
}
