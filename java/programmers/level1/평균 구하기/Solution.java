/*
 * 프로그래머스 평균 구하기
 * 
 * Level 1
 * 220929
 * tkdalsgks
 */
public class Solution {
    public double solution(int[] arr) {
        
    	double answer = 0;
    	double sum = 0;
    	
    	for(int i = 0; i < arr.length; i++) {
    		sum += arr[i];
    	}
    	
    	answer = sum/arr.length;

        return answer;
    }

	public static void main(String[] args) {
		
		Solution s = new Solution();
		int[] result = {1, 2, 3, 4};
		
		System.out.print(s.solution(result));
	}

}
