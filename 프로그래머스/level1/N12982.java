package level1;

import java.util.*;

public class N12982 {
	static int max = 0;
	static int[] visit;

	// 최대 몇개의 부서에 물품 지급? ( 예산보다 작게 지급은 안됨. )
	public static int solution(int[] d, int budget) {
		visit = new int[d.length];
		DFS(0, 0, d, budget, 0);
		return max;
	}

	public static void DFS(int L, int cnt, int[] d, int budget, int sum) {
		if (sum > budget)
			return;
		max = Math.max(max, cnt);
		for (int i = L; i < d.length; i++) {
			DFS(i + 1, cnt + 1, d, budget, sum + d[L]);
			DFS(i + 1, cnt, d, budget, sum);
		}

	}

	public static void main(String[] args) {
		int[] list = { 2,3,4,5,6,9 };
		System.out.println(solution(list, 15));
	}

}
