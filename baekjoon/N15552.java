package baekjoon;
import java.io.*;
import java.util.StringTokenizer;
public class N15552 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for(int i=0;i<n;i++) {
			st=new StringTokenizer(br.readLine());
			int c=Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(c)+"\n");
		}
		br.close();
		bw.close();
	}

}
