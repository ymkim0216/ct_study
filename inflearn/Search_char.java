package inflearn;
import java.util.Scanner;
public class Search_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String a = in.nextLine().toUpperCase();
		char b = in.nextLine().toUpperCase().charAt(0);
		int count =0;
		for(int i=0;i<a.length();i++) {
			if(a.charAt(i)==b) {
				count++;
			}
		}
	    System.out.println(count);
	    return ;
	}

}
