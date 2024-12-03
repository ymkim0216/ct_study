package inflearn;
import java.util.*;
public class Changeword {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		String out = in.nextLine();
		String[] a = new String[n];
		for(int i=0;i<n;i++) {
			a[i] = in.nextLine();
			StringBuilder sb = new StringBuilder(a[i]);
			sb.reverse();
			a[i] = sb.toString();
		}
		for(int i=0;i<n;i++) {
			System.out.println(a[i]);
		}
	}

}
