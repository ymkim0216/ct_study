package baekjoon;
import java.io.*;
import java.util.*;
public class N10815 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] arr1 = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0;i<n;i++) {
			arr1[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr1);
		int m = Integer.parseInt(br.readLine());
		int[] arr2 = new int[m];
		st = new StringTokenizer(br.readLine());
		for(int i=0;i<m;i++) {
			arr2[i]=search(Integer.parseInt(st.nextToken()),arr1);
		}
		br.close();
		StringBuilder sb = new StringBuilder();
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		for(int i=0;i<m;i++) {
			sb.append(arr2[i]).append(" ");
		}
		bw.write(sb.toString());
		bw.close();
	}
	public static int search(int target,int[] arr) {
		int ans = 0;
		int st = 0,end=arr.length-1,mid;
		while(st<=end) {
			mid = (st+end)/2;
			if(arr[mid]==target) {ans = 1;break;}
			if(arr[mid]>target) {end = mid-1;}
			if(arr[mid]<target) {st=mid+1;}
		}
		return ans;
	}
}
