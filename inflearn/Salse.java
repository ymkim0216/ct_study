package inflearn;

import java.util.*;

public class Salse {
	public static ArrayList<Integer> solution(int n,int k,int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i=0;i<k-1;i++) {
			map.put(arr[i], map.getOrDefault(arr[i],0)+1);
		}
		int lt=0;
		for(int rt = k-1;rt<n;rt++) {
			map.put(arr[rt], map.getOrDefault(arr[rt],0)+1);
			list.add(map.size());
			if(map.get(arr[lt])>1) {
				map.put(arr[lt], map.get(arr[lt])-1);
			}else {
				map.remove(arr[lt]);
			}
			lt++;
		}
		return list;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i:solution(n,k,arr)) {
			System.out.print(i+" ");
		}
	}

}
