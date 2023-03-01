package inflearn;

import java.util.*;

public class AllAnagram2 {
	public static int solution(String a,String b) {
		int cnt=0;
		HashMap<Character,Integer> am = new HashMap<>();
		HashMap<Character,Integer> bm = new HashMap<>();
		int l = b.length()-1;
		for(int i=0;i<l;i++) {
			am.put(a.charAt(i),am.getOrDefault(a.charAt(i), 0)+1);
		}
		for(char c : b.toCharArray()) {
			bm.put(c, bm.getOrDefault(c, 0)+1);
		}
		int lt = 0;
		for(int rt = l ;rt<a.length();rt++) {
			am.put(a.charAt(rt), am.getOrDefault(a.charAt(rt),0)+1);
			if(am.equals(bm)) cnt++;
			am.put(a.charAt(lt), am.get(a.charAt(lt))-1);
			if(am.get(a.charAt(lt))==0) am.remove(a.charAt(lt));
			lt++;
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
