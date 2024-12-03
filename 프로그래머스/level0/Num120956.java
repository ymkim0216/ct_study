package level0;
import java.util.*;
public class Num120956 {
	 public int solution(String[] babbling) {
		 int ans=0;
		 for(int i=0;i<babbling.length;i++) {
			 //"aya", "ye", "woo", "ma"
			 String tmp = babbling[i];
			 tmp=tmp.replaceFirst("aya", "1");
			 tmp=tmp.replaceFirst("ye", "1");
			 tmp=tmp.replaceFirst("woo", "1");
			 tmp=tmp.replaceFirst("ma", "1");
			 tmp=tmp.replaceAll("1", "");
			 if(tmp.equals("")) ans++;
			 System.out.println(babbling[i]+":"+ tmp);
		 }
		 return ans;
	 }
	
	public static void main(String[] args) {
		String[] arr= {"aya", "yee", "u", "maa", "wyeoo"};
		Num120956 n = new Num120956();
		System.out.println(n.solution(arr));
		
	}

}
