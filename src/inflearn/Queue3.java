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
			Person tmp = q.poll();//�� �� ���� ��� �̾ƿ�
			for(Person p:q) {//������� �켱���� ��
				if(p.priority>tmp.priority) {//������ ū �� ������
					q.offer(tmp);//�� �ڷ� ����(���� �����ϱ� ���ؼ�)
					tmp = null;// poll�Ȱ� �ٽ� �־����ϱ� null
					break;//for�� ����
				}
			}
			if(tmp!=null) { //������ ū�� ������ null�ε� �ƴϸ� ���� ���� ū��
				cnt++; //���� ���� 
				if(tmp.id==m) return cnt; //���� �ٵ� m��°�� cnt return 
			} //���⼭ poll���ϴ� ���� : �̹� ù ���忡�� poll�� �߱⶧����. peek�̾����� poll�� �ؾ߰���?
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
