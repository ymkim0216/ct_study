package level1;

public class N12930 {
	public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        boolean upper = true;
        String[] tmp = s.split("");
        for(String token : tmp) {
        	if(token.equals(" ")) {sb.append(token);upper = true; continue;}
        	//¦�� : �빮��
        	if(upper) {
        		sb.append(token.toUpperCase());
        		upper = false;
        	}else {//Ȧ��
        		sb.append(token.toLowerCase());
        		upper = true;
        	}
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		System.out.println(solution("helllll o to day~! "));
	}

}
