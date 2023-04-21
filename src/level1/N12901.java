package level1;
import java.util.*;
public class N12901 {
	String[] day = {"THU","FRI","SAT","SUN","MON","TUE","WED"};
	int[] month= {31,29,31,30,31,30,31,31,30,31,30,31};
	public String solution(int a, int b) {
		//a월 b일
		//총날짜 %7 =1 : 금
		int daysum=0;
		for(int i=0;i<a-1;i++) {
			daysum+=month[i];
		}
		daysum+=b;
        return day[daysum%7];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
