package level1;

public class N72410 {
	public static String solution(String new_id) {
		/**
		 * 1�ܰ� new_id�� ��� �빮�ڸ� �����Ǵ� �ҹ��ڷ� ġȯ�մϴ�.
		 * 2�ܰ� new_id���� ���ĺ� �ҹ���, ����, ����(-), ����(_), ��ħǥ(.)�� ������ ��� ���ڸ� �����մϴ�.
		 * 3�ܰ� new_id���� ��ħǥ(.)�� 2�� �̻� ���ӵ� �κ��� �ϳ��� ��ħǥ(.)�� ġȯ�մϴ�.
		 * 4�ܰ� new_id���� ��ħǥ(.)�� ó���̳� ���� ��ġ�Ѵٸ� �����մϴ�.
		 * 5�ܰ� new_id�� �� ���ڿ��̶��, new_id�� "a"�� �����մϴ�.
		 * 6�ܰ� new_id�� ���̰� 16�� �̻��̸�, new_id�� ù 15���� ���ڸ� ������ ������ ���ڵ��� ��� �����մϴ�.
		 * ���� ���� �� ��ħǥ(.)�� new_id�� ���� ��ġ�Ѵٸ� ���� ��ġ�� ��ħǥ(.) ���ڸ� �����մϴ�.
		 * 7�ܰ� new_id�� ���̰� 2�� ���϶��, new_id�� ������ ���ڸ� new_id�� ���̰� 3�� �� ������ �ݺ��ؼ� ���� ���Դϴ�.
		 */
        StringBuilder sb = new StringBuilder(new_id);
        String ans = new_id;
        ans = ans.toLowerCase(); //1.
        ans = ans.replaceAll("[^a-z0-9\\-\\_\\.]", "");
        ans = ans.replaceAll("[.]{2,}",".");
        ans = ans.replaceAll("^[.]|[.]$", "");
        if(ans.length()==0) ans = "a";
        else if(ans.length()>=16) {
        	ans = ans.substring(0,15);
        	ans = ans.replaceAll("\\.$", "");
        }
        if(ans.length()<=2) {
        	String last = ans.charAt(ans.length()-1)+"";
        	while(ans.length()!=3) {
        		ans += last;
        	}
        }
        return ans;
    }
	public static void main(String[] args) {
		System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
	}

}
