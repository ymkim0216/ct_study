package inflearn;

import java.util.*;

public class AllAnagram {
	public static int solution(String a,String b) {
		int cnt=0, k=b.length();
		HashMap<Character,Integer> map = new HashMap<>();
		HashMap<Character,Integer> map2 = new HashMap<>();
		for(int i=0;i<k;i++) {
			map2.put(b.charAt(i),map2.getOrDefault(b.charAt(i),0)+1);
		}
		for(int i=0;i<k-1;i++) {
			map.put(a.charAt(i), map.getOrDefault(a.charAt(i),0)+1);
		} //기본 설정
		int ep =0;
		for(int sp=k-1;sp<a.length();sp++) {
			char c = a.charAt(sp);
			map.put(c, map.getOrDefault(c,0)+1);
			if(map.equals(map2)) cnt++;
			if(map.get(a.charAt(ep))>1) {
				map.put(a.charAt(ep), map.get(a.charAt(ep))-1);
			}else {
				map.remove(a.charAt(ep));
			}
			ep++;
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b= sc.nextLine();
		System.out.println(solution(a,b));
	}

}
