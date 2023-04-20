package level1;

import java.util.*;

public class N17681 {
	public static String[] solution(int n, int[] arr1, int[] arr2) {
		StringBuilder sb;
		String[] answer = new String[n];
		for (int i = 0; i < n; i++) {
			sb = new StringBuilder();
			//String num1= fix(Integer.toBinaryString(arr1[i]),n);
			//String num2= fix(Integer.toBinaryString(arr2[i]),n);
			String ans = fix(Integer.toBinaryString(arr1[i]|arr2[i]),n);
//			for(int j=0;j<n;j++) {
//				if(num1.charAt(j)=='1') sb.append("#");
//				else if(num2.charAt(j)=='1') sb.append("#");
//				else sb.append(" ");
//			}
			ans = ans.replaceAll("1", "#");
			ans = ans.replaceAll("0", " ");
			answer[i] = ans;
		}
		return answer;
	}
	public static String fix(String num,int n) {
		StringBuilder sb = new StringBuilder();
		if(num.length()<n) {
			for(int i=0;i<n-num.length();i++) {
				sb.append(0);
			}
			sb.append(num);
			return sb.toString();
		}else return num;
	}

	public static void main(String[] args) {
		int[] arr1= {9, 20, 28, 18, 11};
		int[] arr2= {30, 1, 21, 17, 28};
		for(String s:solution(5,arr1,arr2)) {
			System.out.println(s);
		}
	}

}
