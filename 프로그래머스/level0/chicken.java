package level0;

public class chicken {
	
	public static int solution(int chicken) {
		int answer = 0;
		//rest를 더하는 이유 ? 어짜피 마지막 수는 남은 수로 빠지기 때문에 그냥 전체 치킨값으로 넘김
		//따로 저장안해둬도 됨. 10개가 넘어가면 자동으로 치킨값으로 계산되기 때문.
        while (chicken >= 10) {
            int newChick = chicken / 10;
            int restChick = chicken % 10;
            chicken = newChick + restChick;
            answer += newChick;
        }

        return answer;
    }

}
