package arrays;

public class ReverseArray {

	public static int[] reverse(int[] a) {
		int len = a.length-1;
		for(int i=len;i>len/2;i--) {
			int temp = a[i];
			a[i] = a[len-i];
			a[len-i] = temp;
		}
		return a;
	}
	public static void main(String[] args) {
		int[] a = new int[]{1,2,3,4,5,6};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("-----------------------------");
		int[] result = reverse(a);
		for(int i=0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}

}
