/*
 * 프로그래머스 자릿수 더하기
 * 
 * Level 1
 * 220928
 * tkdalsgks
 */
public class Solution {
    public int solution(int s) {
        
    	int answer = 0;

        String number[] = String.valueOf(s).split("");
        
        for(String result : number) {
        	answer += Integer.parseInt(result);
        }
        
        return answer;
    }

	public static void main(String[] args) {
		
		Solution s = new Solution();
		int result = 123;

		System.out.print(s.solution(result));
	}

}
