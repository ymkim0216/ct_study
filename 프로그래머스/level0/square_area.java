package level0;

public class square_area {

	public static int solution(int[][] dots) {
		//max, min를 구해서 해야함.
		int xmax=dots[0][0],xmin=dots[0][0],ymax=dots[0][1],ymin=dots[0][1];
		for(int i=0;i<dots.length;i++) {
			for(int j=0;j<dots[i].length;j++) {
				if(j%2==0) { //x좌표일때
					xmax = xmax>dots[i][j] ? xmax:dots[i][j];
					xmin = xmin<dots[i][j]?xmin:dots[i][j];
				}else { //y좌표일때
					ymax = ymax>dots[i][j] ? ymax:dots[i][j];
					ymin = ymin<dots[i][j]? ymin:dots[i][j];
				}
			}
		}
        return (Math.abs(xmax-xmin)*Math.abs(ymax-ymin));
    }

}
