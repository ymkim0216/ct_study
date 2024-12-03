package inflearn;
import java.util.*;

public class DFS_m1 {
	static boolean flag=false;
	static double total;
	static double sum; //гу
	static String ans="NO";
	public static void solution(double sum,int[] arr,int n) {
		if(flag==true||sum>(total/2)||n>=arr.length) return;
		if(sum==(total/2)) {
			flag = true;
			ans = "YES";
			return;
		}
		sum+=arr[n];
		solution(sum,arr,n+1);
		sum-=arr[n];
		solution(sum,arr,n+1);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		total = Arrays.stream(arr).sum();
		solution(sum,arr,0);
		System.out.println(ans);
	}

}
