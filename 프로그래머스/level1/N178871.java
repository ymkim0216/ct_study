package level1;
import java.util.*;
public class N178871 {
	public static String[] solution(String[] players, String[] callings) {
		Map<String,Integer> map = new HashMap<>();//이름 당 순위 저장
		Map<Integer,String> rmap = new TreeMap<>();//rank당 이름 저장.
		
        for(int i=0;i<players.length;i++) {
        	map.put(players[i],i+1);
        	rmap.put(i+1, players[i]);
        }
        for(int i=0;i<callings.length;i++) {
        	int rank = map.get(callings[i]);
        	String a = rmap.get(rank-1);
        	rmap.replace(rank-1, callings[i]);
        	rmap.replace(rank, a);
        	map.replace(callings[i], rank-1);
        	map.replace(a,rank);
        }
        return rmap.values().toArray(String[]::new);
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] a = {"mumu", "soe", "poe", "kai", "mine"};
		String[] b = {"kai", "kai", "mine", "mine"};
		String[] ans = solution(a,b);
		System.out.println(Arrays.toString(ans));
		
	}

}
