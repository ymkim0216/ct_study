package level0;

public class chicken {
	
	public static int solution(int chicken) {
		int answer = 0;
		//rest�� ���ϴ� ���� ? ��¥�� ������ ���� ���� ���� ������ ������ �׳� ��ü ġŲ������ �ѱ�
		//���� ������صֵ� ��. 10���� �Ѿ�� �ڵ����� ġŲ������ ���Ǳ� ����.
        while (chicken >= 10) {
            int newChick = chicken / 10;
            int restChick = chicken % 10;
            chicken = newChick + restChick;
            answer += newChick;
        }

        return answer;
    }

}
