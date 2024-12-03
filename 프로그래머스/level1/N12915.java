package level1;
import java.util.*;
public class N12915 {
	static class Word implements Comparable<Word>{
		public String s;
		public int n;
		Word(String s,int n){
			this.s=s;
			this.n=n;
		}
		@Override
		public int compareTo(Word w) {
			if(this.s.charAt(n)==w.s.charAt(n)) {
				int size = this.s.length();
				for(int i=0;i<size;i++) {
					if(this.s.charAt(i)==w.s.charAt(i)) continue;
					else {
						return this.s.charAt(i)-w.s.charAt(i);
					}
				}
			}
			return this.s.charAt(n)-w.s.charAt(n);
		}
	}
	public static String[] solution(String[] strings, int n) {
        ArrayList<Word> list = new ArrayList<>();
        for(String s:strings) {
        	list.add(new Word(s,n));
        }
        Collections.sort(list);
        String[] ans = new String[list.size()];
        for(int i=0;i<ans.length;i++) {
        	ans[i]=list.get(i).s;
        }
        return ans;
    }
	public static void main(String[] args) {
		
	}
}
