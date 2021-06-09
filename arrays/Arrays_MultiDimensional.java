package arrays;
import java.util.Random;
public class Arrays_MultiDimensional {

	public static void main(String[] args) {
		Random random = new Random();
		int[][] arr = new int[5][10];//Total 10*20 = 200 elements
		//int[][] arr = {{1,2,3},{3,4},{5}}
		arr[0][1] = 9;
		for(int i=0;i<5;i++) {
			//[0][j],[0][j+1]......[0][j+n]
			for(int j=0;j<10;j++) {
				//[i][0],[i][1],[i][2]......
				arr[i][j] = random.nextInt(200);
				System.out.println("arr["+i+"]["+j+"]= "+arr[i][j]);
			}
		}
		int[][][] array3 = { { {1,2,3},{4,5} },{ {5,6},{6,8,9} } };
		System.out.println(array3[1][0][1]);
		
	}

}
