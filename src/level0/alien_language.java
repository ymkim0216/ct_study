package level0;

import java.util.Arrays;

public class alien_language {

	public static void main(String[] args) {
		String [] a= {"z", "d", "x"};
		String [] b= {"def", "dww", "dzx", "loveaw"};
		System.out.println(solution(a,b));
	}
	public static int solution(String[] spell, String[] dic) {
		//spell�� �ִ� �ܾ�� ������ �ܾ �ִٸ� 1 �ƴϸ� 2 return
        int answer = 2;
        String [] s_clone = spell.clone();
        Arrays.sort(s_clone);
        String all = String.join("", s_clone);
        for(int i=0;i<dic.length;i++) {
        	char[] temp = dic[i].toCharArray();
        	Arrays.sort(temp);
        	if(all.length()==temp.length&&all.equals(String.valueOf(temp))) {
        		answer =1;
        	}
        }
        return answer;
    }

}
