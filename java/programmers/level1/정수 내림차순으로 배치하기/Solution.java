import java.util.Arrays;

/*
 * 프로그래머스 정수 내림차순으로 배치하기
 * 
 * Level 1
 * 220928
 * tkdalsgks
 */
public class Solution {
    public long solution(long s) {

        String numbers = String.valueOf(s);
        char number[] = numbers.toCharArray();
        
        Arrays.sort(number);
        
        String result = new StringBuilder(new String(number)).reverse().toString();
        
        return Long.parseLong(result);
    }

	public static void main(String[] args) {
		
		Solution s = new Solution();
		int result = 118372;

		System.out.print(s.solution(result));
	}

}
