package level1;
import java.util.*;
public class N82612 {
	public long solution(int price, int money, int count) {
        long sum=0;
        for(int i=1;i<=count;i++) {
        	sum+=i*price;
        }
        if(sum<=money) return 0;
        return sum-money;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
