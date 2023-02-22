package inflearn;
import java.util.*;
public class StringCompress {
	public String solution(String str) {
		char[] clone = str.toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<clone.length;i++) {
			int count =0;
			for(int j=i;j<str.length();j++) {
				if(clone[i]==clone[j]) {
					count++;
				}else {
					if(count==1) {
						sb.append(clone[i]);
					}else {
						sb.append(clone[i]+String.valueOf(count));
					}
					i+=count-1;
					break;
				}
				if(j==str.length()-1) { //끝순서라면 안들어가니까
					if(count==1) {
						sb.append(clone[i]);
					}else {
						sb.append(clone[i]+String.valueOf(count));
					}
					i+=count-1;
				}
			}
		}
		return sb.toString();
	}
	public static void main(String[] args) {
		StringCompress cp = new StringCompress();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(cp.solution(str));
		
	}

}
