package level1;
import java.util.*;
public class N86051 {
	//0~9 없는 숫자들 더해서 return
	public static int solution(int[] numbers) {
		int ans = 0;
		int[] arr=new int[10];
		for(int i=0;i<numbers.length;i++) {
			arr[numbers[i]]=1;
		}
		for(int i=0;i<10;i++) {
			if(arr[i]==0) ans+=i;
		}
        
        return ans;
    } 
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,6,7,8,0};
		System.out.println(solution(arr));

	}

}
