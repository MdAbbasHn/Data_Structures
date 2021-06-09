package arrays;

public class MinMaxArray {

	public static int[] minMaxArray(int[] a) {
		int min,max;
		min = max = a[0];
		for(int i=0;i<a.length;i++) {
			max = Math.max(a[i],max);
			min = Math.min(a[i],min);
		}
		return new int[] {min,max};
	}
	public static void main(String[] args) {
		int[] a = new int[] {55,12,78,45,1,120,90,5,23};
		int[] res = minMaxArray(a);
		System.out.println("Min: "+res[0]);
		System.out.println("Max: "+res[1]);
	}

}
