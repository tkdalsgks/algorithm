import java.util.Scanner;

/*
 * 프로그래머스 약수의 합
 * 
 * Level 1
 * 220928
 * tkdalsgks
 */
public class Solution {
    public int solution(int s) {
        
    	int answer = 0;
    	
    	for(int i = 1; i <= s; i++) {
    		if(s % i == 0) {
    			answer += i;
    		}
    	}

        return answer;
    }

	public static void main(String[] args) {
		
		Solution s = new Solution();
		Scanner sc = new Scanner(System.in);
		int result = sc.nextInt();
		
		System.out.print(s.solution(result));
	}

}
