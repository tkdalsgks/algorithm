/*
 * 프로그래머스 나머지가 1이 되는 수 찾기
 * 
 * Level 1
 * 220930
 * tkdalsgks
 */
public class Solution {
    public int solution(int n) {
        
    	int answer = 0;
    	
    	for(int i = 1; i < n; i++) {
    		if(n % i == 1) {
    			return i;
    		}
    	}

        return answer;
    }

	public static void main(String[] args) {
		
		Solution s = new Solution();
		int result = 10;
		
		System.out.print(s.solution(result));
	}

}
