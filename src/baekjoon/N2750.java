package baekjoon;
import java.io.*;
import java.util.*;
public class N2750 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		br.close();
		//Á¤·Ä
		for(int i=0;i<n;i++) {
			int min=arr[i];
			int pos=i;
			for(int j=i;j<n;j++) {
				if(min>arr[j]) {
					min = arr[j];
					pos=j;
				}
			}
			arr[pos]=arr[i];
			arr[i]=min;
		}
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<n;i++) {
			bw.write(arr[i]+"\n");
		}
		bw.close();
	}

}
