package level1;

import java.util.Arrays;

public class MockTest {

	public static void main(String[] args) {
		int[] answer = {1, 4, 1, 5, 3, 2, 2};
		
		MockTest mock = new MockTest();	
		int[] test = mock.solution(answer);
		System.out.println(Arrays.toString(test));
		
	}
	public int[] solution(int[] answers) {
		
		int[][] persons = { {1, 2, 3, 4, 5},
			         	    {2, 1, 2, 3, 2, 4, 2, 5},
			         	    {3, 3, 1, 1, 2, 2, 4, 4, 5, 5} };
		
		int[] sc = new int[persons.length];
		
		for (int i = 0; i < answers.length; i++) {
			if (persons[0][i % 5] == answers[i]) {
				sc[0] += 1;
			} 
			if (persons[1][i % 8] == answers[i]) {
				sc[1] += 1;
			}
			if (persons[2][i % 10] == answers[i]) {
				sc[2] += 1;
			}
		}
		
		int maxSc = sc[0];
		int index = 0;
		
		for (int i = 0; i < sc.length; i++) {
			if (maxSc < sc[i]) {
				maxSc = sc[i];
				index = i;
			}
		}
		
		int count = 0;
		
		for (int i = 0; i < sc.length; i++) {
			if (sc[index]== sc[i]) {
			count++;
		
	
			}
		}
        return sc;
	}
	public int[][] makeExams(int length) {
		
		int[][] patterns = { {1, 2, 3, 4, 5},
         	                {2, 1, 2, 3, 2, 4, 2, 5},
         	                {3, 3, 1, 1, 2, 2, 4, 4, 5, 5} };
	    int[][] stAns = new int[3][length];
	   
	    for (int i = 0; i < stAns.length; i++) {
			int patternIdx = 0;
	    	for (int j = 0; j < stAns[i].length; j++) {
				stAns[i][j] = patterns[i][patternIdx];
				patternIdx++;
			}
		}
		return stAns;
	}
}
