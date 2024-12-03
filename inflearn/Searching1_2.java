package inflearn;
import java.util.*;
class Point2 implements Comparable<Point2>{
	int x,y;
	Point2(int x,int y){
		this.x= x;
		this.y=y;
	}
	@Override //��ü������ Comparable�� �������̵� ����
	public int compareTo(Point2 o) {
		if(this.x==o.x) return this.y-o.y; 
		return this.x-o.x;
	}
	// compareTo�� �������� �ڵ������� Comparable�� �����ؾ���,,,�ФФФФ�
	// compareTo���� return���� ���� : ��������, ��� : ��������
	// compareTo�� ������ Collections���� �˾Ƽ� sort������
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
