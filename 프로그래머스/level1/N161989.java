package level1;
import java.util.*;
import java.util.stream.Collectors;
public class N161989 {
	//Ǯ�� 1.
	public static int solution(int n, int m, int[] section) {
		//n : ��ü �� ����, m : �ѷ� ����, section : ĥ�ؾ��� ����
		int[] s = new int[n+1];
		int cnt=0;
		List<Integer> list = Arrays.stream(section).boxed().collect(Collectors.toList());
		boolean flag = false;
		while(list.size()>0) {
			flag = false;
			int max = Collections.max(list);
			list.remove((Integer)max);
			int tmp = max-m>=0? max-m:0;
			for(int i=max;i>tmp;i--) {
				if(s[i]==1) {flag =true; break;}
				s[i]=1;
			}
			if(flag) continue;
			cnt++;
			
		}
        return cnt;
    }
	//Ǯ�� 2
	public static int solution2(int n, int m, int[] section) {
		//n : ��ü �� ����, m : �ѷ� ����, section : ĥ�ؾ��� ����
		int[] s = new int[n+1];
		int cnt=0;
		for(int i:section) {
			s[i]=1;
		}
		int st=1;
		for(int i=st;i<=n;i++) {
			if(s[i]==1) {//ĥ�ؾ��� �����̸�, m��ŭ ĥ�ϰ� ���� ����Ʈ �Ű���
				i+=m;
				cnt++;
			}
		}
        return cnt;
    }
	public static void main(String[] args) {
		int[] s = {2, 3, 6};
		int m = 2;
		int  n= 8;
		System.out.println(solution2(n,m,s));

	}

}
