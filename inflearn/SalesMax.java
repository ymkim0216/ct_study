package inflearn;
import java.util.*;
public class SalesMax {
	public static String solution(int n,int k,int[] arr) {
		String answer ="";
		HashMap<Integer,Integer> map = new HashMap<>();
		// 매출의 종류 => HashMap & Sliding Window
		int lt=0;
		for(int rt = 0;rt<=(n-k);rt++) {
			while(lt-rt<k&&lt<n) {
				map.put(arr[lt], map.getOrDefault(arr[lt],0)+1);
				lt++;
			}
			answer += map.size()+" ";
			if(map.get(arr[rt])>1) {
				map.put(arr[rt], map.get(arr[rt])-1);
			}else {
				map.remove(arr[rt]);
			}
		}
		return answer;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(solution(n,k,arr));
	}

}
