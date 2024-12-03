package level1;

import java.util.*;

public class N77484 {
	public static int[] solution(int[] lottos, int[] win_nums) {
		int[] answer = new int[2];
		int zero = 0, cnt = 0, p1 = 0, p2 = 0;

		int[] l = lottos.clone();
		int[] w = win_nums.clone();
		// 정렬해서 한번 탐색으로 끝내도록 한다.
		Arrays.sort(l);
		Arrays.sort(w);
		while (p1 < 6&&p2<6) {
			if (l[p1] == 0) {
				zero++;
				p1++;
			} else if (l[p1] == w[p2]) {
				cnt++;
				p1++;
				p2++;
			} else if (l[p1] > w[p2]) {
				p2++;
			} else {
				p1++;
			}
		}
		// 최고 & 최소 등수
		if(cnt+zero==0) answer[0]=6;
		else {answer[0] = 7 - (cnt + zero);}
		if (cnt == 0)
			answer[1] = 6;
		else {
			answer[1] = 7 - cnt;
		}
		return answer;
	}

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6 };
		int[] b = { 7, 8, 9, 10, 11, 12 };
		System.out.println(Arrays.toString(solution(a, b)));
	}

}
