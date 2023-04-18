package level1;
import java.util.*;

public class N86491 {
	static class Square implements Comparable<Square>{
		public int w,h;
		Square(int w,int h){
			this.w=w;
			this.h=h;
		}
		@Override
		public int compareTo(Square s) {
			return s.w-this.w;//가로 순으로 오름차순 정렬
		}
	}
	public static int solution(int[][] sizes) {
        int ans = 0,wMax=0,hMax=0;
        ArrayList<Square> list = new ArrayList<>();
        //긴쪽이 가로가 되도록 입력
        for(int i=0;i<sizes.length;i++) {
        	list.add(new Square(Math.max(sizes[i][0], sizes[i][1]),Math.min(sizes[i][0], sizes[i][1])));
        }
        Collections.sort(list);
        wMax = list.get(0).w;
        for(Square s:list) {
        	if(s.h>hMax) hMax = s.h;
        }
        return hMax*wMax;
    }
	public static void main(String[] args) {
		int[][] sizes = {{3,5},{6,2}};
		System.out.println(solution(sizes));
	}

}
