package level1;
import java.util.*;
public class N42748 {
	public static int[] solution(int[] array, int[][] commands) {
		//i부터 j까지 자른 k번째 수
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<commands.length;i++) {
        	list.add(search(array,commands[i]));
        }
        return list.stream().mapToInt(i->i).toArray();
    }
	public static int search(int[] array,int[] command) {
		int size = command[1]-command[0]+1;
		int[] arr = new int[size];
		arr=Arrays.copyOfRange(array, command[0]-1, command[1]);
		Arrays.sort(arr);
		return arr[command[2]-1];
	}
	public static void main(String[] args) {
		int[] array= {1, 5, 2, 6, 3, 7, 4};
		int[][] commands= {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] ans = solution(array,commands);
		for(int i:ans) {
			System.out.println(i);
		}

	}

}
