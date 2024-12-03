package level2;

public class N12951 {
	public String solution(String s) {
	        s = s.toLowerCase();
	        StringBuilder sb = new StringBuilder();
	        int n = 0;
	        boolean flag =false;
	        while(n<s.length()) {
	        	char c = s.charAt(n);
	        	if(c==' ') flag = false;
	        	else {
	        		if(!flag) { //첫 문자면
	        			flag = true;
	        			if(c>='a'&&c<='z') {//문자면
	        				c -= 32;
	        			}
	        		}
	        	}
	        	sb.append(c);
	        	n++;
	        }
	        return sb.toString();
	    }

	public static void main(String[] args) {
		String a = "32the lastWeek";
		N12951 T = new N12951();
		System.out.println(T.solution(a)+",");

	}

}
