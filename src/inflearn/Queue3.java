package inflearn;
import java.util.*;
public class Queue3 {
	public static int solution(int n,int m,int[] arr) {
		int cnt=0;
		Queue<Person> q = new LinkedList<>();
		for(int i=0;i<n;i++) {
			q.offer(new Person(i,arr[i]));
		}
		while(!q.isEmpty()) {
			Person tmp = q.poll();//맨 위 값을 잠시 뽑아옴
			for(Person p:q) {//순차대로 우선순위 비교
				if(p.priority>tmp.priority) {//나보다 큰 값 있으면
					q.offer(tmp);//맨 뒤로 보냄(순서 유지하기 위해서)
					tmp = null;// poll된걸 다시 넣었으니까 null
					break;//for문 종료
				}
			}
			if(tmp!=null) { //나보다 큰게 있으면 null인데 아니면 내가 제일 큰값
				cnt++; //순서 증가 
				if(tmp.id==m) return cnt; //내가 근데 m번째면 cnt return 
			} //여기서 poll안하는 이유 : 이미 첫 문장에서 poll을 했기때문임. peek이었으면 poll을 해야겠지?
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println(solution(n,m,arr));
	}

}
class Person{
	int id;
	int priority;
	Person(int id,int priority){
		this.id =id;
		this.priority=priority;
	}
	
}
