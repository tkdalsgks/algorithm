import java.util.Scanner;

/*
 * 프로그래머스 수박수박수박수박수박수?
 * 
 * Level 1
 * 220928
 * tkdalsgks
 */
public class Solution {
    public String solution(int s) {
        
    	String answer = "";

    	for(int i = 0; i < s; i++) {
    		if(i % 2 == 0) {
    			answer += "수";
    		} else {
    			answer += "박";
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
