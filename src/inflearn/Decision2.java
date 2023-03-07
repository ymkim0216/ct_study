package inflearn;
import java.util.*;
public class Decision2 {
	public static int count(int mid,int[] arr) {
		int cnt=1,ep=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]-ep>=mid) {
				cnt++;
				ep=arr[i];
			}
		}
		return cnt;
	}
	public static int solution(int m,int[] arr) {
		int ans =0;
		Arrays.sort(arr);
		int rt = Arrays.stream(arr).max().getAsInt();
		int lt= 1;
		int mid=0;//각 문제마다 유효범위를 어떻게 지정하는지가 중요
		while(lt<=rt) {
			mid=(lt+rt)/2;
			if(count(mid,arr)>=m) { //count가 m을 넘는다는 의미는 내가 임의로 간격을 조절해서 3으로 
				ans = mid;//만들수 있다는 의미 == 유효하다는 의미임.
				lt = mid+1;//최댓값을 구하니까 유효한 mid 이후를 구한다.
			}else rt= mid-1; 
		}
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int m= sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {	arr[i]=sc.nextInt();}
		System.out.println(solution(m,arr));
	}

}
