package level1;

public class Year2016 {

	public static void main(String[] args) {
		Year2016 wDay = new Year2016();
		String day = wDay.solution(3, 5); 
	    System.out.println(day);

	}
    // 2016년 무슨요일인지?
	// 입력: a(month), b(day)
	// 리턴: 무슨요일("SAT") String
	public String solution(int a, int b) {
		int week = 0;
		int month = a;
		int date= b;
		
        int[] md = {31,29,31,30,31,30,31,31,30,31,30,31};
		String[] dayOW = {"SUN","MON","TUE","WED","THURS","FRI","SAT"};
		
		for (int i = 0; i < month-1; i++) {
			week += md[i];
		}
	     week += date;
		
	     
		return dayOW[(week+4) % 7];
	     
	  // String day;
	   //  int dayRemainder = week % 7;
	  //   switch (dayRemainder) {
		//case 0:
		//	day = "MON";
		//	break;
		//case 1:
		//	day = "TUE";

		//default:
		//	break;
		//}
	}
}
