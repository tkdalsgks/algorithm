/*
 * 프로그래머스 하샤드 수
 * 
 * Level 1
 * 220929
 * tkdalsgks
 */
public class Solution {
    public boolean solution(int x) {
        
    	boolean answer = true;
    	
    	String[] number = String.valueOf(x).split("");
    	
    	int result = 0;
    	for(String num : number) {
    		result += Integer.parseInt(num);
    	}
    	
    	if(x % result == 0) {
    		answer = true;
    	} else {
    		answer = false;	
    	}

        return answer;
    }

	public static void main(String[] args) {
		
		Solution s = new Solution();
		int result = 10;
		
		System.out.print(s.solution(result));
	}

}
