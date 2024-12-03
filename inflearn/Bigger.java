package inflearn;
import java.util.*;
public class Bigger {
	public String solution(String str,int cnt) {
		//앞의 수 보다 큰수만 출력. i-i+1?
		String answer = "";
		String[] tmp = str.split(" ");
		int[] array = new int[cnt];
		for(int i=0;i<cnt;i++) {
			array[i] = Integer.valueOf(tmp[i]);
			if(i==0) {
				answer += array[i] +" ";
			}else {
				if(array[i]>array[i-1]) 
					answer += array[i] +" ";
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Bigger b = new Bigger();
		Scanner sc = new Scanner(System.in);
		int cnt = Integer.valueOf(sc.nextLine());
		String str = sc.nextLine();
		System.out.println(b.solution(str, cnt));
	}

}
