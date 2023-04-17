package level1;

public class N12926 {
	public static String solution(String s, int n) {
		StringBuilder sb =new StringBuilder();
		char[] arr = s.toCharArray();
		for(char token : arr) {
			if(token>=97&&token<=122){//소문자
				if(token+n>122) {
					sb.append((char)(token+n-26));
				}else {
				sb.append((char)(token+n));}
			}else if(token>=65&&token<=90){//대문자
				if(token+n>90) {
					sb.append((char)(token+n-26));
				}else {
					sb.append((char)(token+n));
				}
			}else {
				sb.append(token);
			}
		}
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(solution("bC",25));

	}

}
