package inflearn;
import java.util.*;
class Point2 implements Comparable<Point2>{
	int x,y;
	Point2(int x,int y){
		this.x= x;
		this.y=y;
	}
	@Override //자체적으로 Comparable을 오버라이드 해줌
	public int compareTo(Point2 o) {
		if(this.x==o.x) return this.y-o.y; 
		return this.x-o.x;
	}
	// compareTo가 나왔으면 자동적으로 Comparable을 생각해야지,,,ㅠㅠㅠㅠㅠ
	// compareTo에서 return값이 음수 : 오름차순, 양수 : 내림차순
	// compareTo가 있으면 Collections에서 알아서 sort가능임
}
public class Searching1_2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Point2> list = new ArrayList<>();
		for(int i=0;i<n;i++) {
			Point2 p = new Point2(sc.nextInt(),sc.nextInt());
			list.add(p);
		}
		Collections.sort(list);
		for(Point2 o: list) {
			System.out.println(o.x+" "+o.y);
		}
	}

}
