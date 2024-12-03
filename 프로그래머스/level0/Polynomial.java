package level0;
import java.util.*;
public class Polynomial {
	 public String solution(String polynomial) {
		 String ans = "";
		 int a=0,b=0;
		 for(String s : polynomial.split(" ")) {
			 if(s.contains("x")) {
				 if(s.charAt(0)!='x') {
					 String tmp = s.replaceAll("x","");
					 a+=Integer.valueOf(tmp);
				 }else a+=1;
			 }else {
				 if(!s.contains("+")) {
				 b+=Integer.valueOf(s);
				 }
			 }
		 }
		 if(a==1) {
			 if(b==0) {return "x";}
			 else {
				 return "x + "+b;
			 }
		 }
		 if(a==0) {ans = b+"";}
		 else if(b==0) { ans = a+"x";}
		 else {ans = a+"x + "+b;}
		 return ans;
	 }
	 public static void main(String[] args) {
		Polynomial p = new Polynomial();
		Scanner sc = new Scanner(System.in);
		String poly = sc.nextLine();
		System.out.println(p.solution(poly));
	 }

}
