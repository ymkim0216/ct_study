package level1;

public class N12922 {
	public String solution(int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++) {
        	if(i%2==0) sb.append("¼ö");
        	else sb.append("¹Ú");
        }
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
