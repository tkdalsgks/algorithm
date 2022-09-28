/*
 * 프로그래머스 문자열 내 p와 y의 개수
 * 
 * Level 1
 * 220928
 * tkdalsgks
 */
public class Solution {
    public Boolean solution(String s) {
        
    	Boolean answer = true;

    	String result[] = s.toUpperCase().split("");
    	int p = 0;
    	int y = 0;
    	
    	for(int i = 0; i < result.length; i++) {
    		if(result[i].equals("P")) {
    			p++;
    		} else if(result[i].equals("Y")) {
    			y++;
    		}
    	}
    	
    	if(p != y) {
    		answer = false;
    	}

        return answer;
    }

	public static void main(String[] args) {
		
		Solution s = new Solution();
		String result = "pPoooyY";
		
		System.out.print(s.solution(result));
	}

}
