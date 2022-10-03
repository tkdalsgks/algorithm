/*
 * 프로그래머스 이상한 문자 만들기
 * 
 * Level 1
 * 220930
 * tkdalsgks
 */
public class Solution {
    public String solution(String x) {
        
    	String answer = "";
    	String[] result = x.split("");
    	
    	int index = 0;
    	for(int i = 0; i < result.length; i++) {
    		if(result[i].equals(" ")) {
    			index = 0;
    		} else { 
    			if(index % 2 == 0) {
					result[i] = result[i].toUpperCase();
					index++;
    			} else {
					result[i] = result[i].toLowerCase();
					index++;
    			}
    		}
    		answer += result[i];
    	}

        return answer;
    }

	public static void main(String[] args) {
		
		Solution s = new Solution();
		String result = "try hello world";
		
		System.out.print(s.solution(result));
	}

}
