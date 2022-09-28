/*
 * 프로그래머스 최댓값과 최솟값
 * 
 * Level 2
 * 220928
 * tkdalsgks
 */
public class Solution {
    public String solution(String s) {
        
    	String answer = "";
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        String number[] = s.split(" ");
        for(int i = 0; i < number.length; i++) {
            int result = Integer.parseInt(number[i]);

            min = Math.min(min, result);
            max = Math.max(max, result);
        }

        answer = min + " " + max;
        return answer;
    }

	public static void main(String[] args) {
		
		Solution s = new Solution();
		String result = "1 2 3 4";

		System.out.print(s.solution(result));
	}

}
