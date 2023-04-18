package level1;
import java.util.*;
public class N42840 {
	//1 : 1,2,3,4,5 - 5
	//2 : 2,1,2,3,2,4,2,5 - 8
	//3 : 3,3,1,1,2,2,4,4,5,5 - 10
	public int[] solution(int[] answers) {
        int[] answer;
        int cnt1=0, cnt2=0, cnt3=0;
        int[] one = {1,2,3,4,5};
        int[] two = {2,1,2,3,2,4,2,5};
        int[] three = {3,3,1,1,2,2,4,4,5,5};
        for(int i=0;i<answers.length;i++) {
        	if(one[i%5]==answers[i]) cnt1++;
        	if(two[i%8]==answers[i]) cnt2++;
        	if(three[i%10]==answers[i]) cnt3++;
        }
        int max = Math.max(cnt1, cnt2);
        max = Math.max(max, cnt3);
        //max°ª 
        ArrayList<Integer> list =new ArrayList<>();
        if(max==cnt1) {  list.add(1);  }
        if(max==cnt2) {  list.add(2);  }
        if(max==cnt3) {  list.add(3);  }
        
        return list.stream().mapToInt(i->i).toArray();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
