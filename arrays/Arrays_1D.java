package arrays;
import java.util.Random;
public class Arrays_1D {

	public static void main(String[] args) {
		Random random = new Random();
		int[] arr;
		arr = new int[10];//Size is 10 but index starts from 0 and ends on 9
		//int[] arr = new int[10];
		//int arr[] = new int[10];
		//int []arr = new int[10];
		//int[] arr = {12,3,45,32,98,7};
		for(int i=0;i<arr.length;i++) {
			arr[i] = random.nextInt(30);
		}
		for(int j=0;j<arr.length;j++) {
			System.out.println("arr["+j+"]= "+arr[j]);
		}
		System.out.println("First: "+arr[0]);
		System.out.println("Last: "+arr[9]);
		System.out.println(arr[10]);
	}

}
/*
 Features of Arrays:
    1.) All elements of an array are of the same type.(including objects of a particular class)
    2.) Elements of an array are accessed using an index value. Each array element has a unique associated index value.
    3.) The length of the array is the number of elements in the array.(accessed using arrayname.length)
    4.) The size of the array is the size of all the elements in the array. This can be expressed mathematically as Length * Element_Size where Length is the number of elements in the array and Element_Size is the memory size of an individual element.
    5.) A name for the array object.
 
 Applications of Arrays:
 	
    1.) Used in mathematical problems like matrices etc.
    2.) They are used in the implementation of other data structures like linked lists etc.
    3.) Database records are usually implemented as arrays.
    4.) Used in lookup tables by computer.
    5.) It effectively executes memory addressing logic wherein indices act as addresses to the one-dimensional array of memory.

 Advantages of Arrays:
    
    1.) A convenient way to store large amounts of similar data.
    2.) It is used to represent multiple items of similar nature using a single name.
    3.) It allows us to store data in multi-dimensional arrays. ( We will learn about them in a later section.)
    4.) It is used to create other data structures like heaps, linked lists, etc.
    5.) You need not access elements sequentially, random access is allowed.
    6.) Since elements are stored in consecutive blocks hence they are useful to use in iterations.
    7.) Since the size of the array is known during compile-time, there is no chance of memory runout for arrays.

 Disadvantages of Arrays:
 	1.) Since it is a static data structure that is has a fixed size we should know or determine array size at compile time itself. No modifications can be done to array size during runtime.
    2.) Inserting and deleting elements from an array is a tedious task, as it would involve shifting of some or all the elements of the array which would also involve managing memory space for it as well.
    3.) No element can be appended after the end of an array.
    4.) Since we declare array at compile time itself with a particular size, it is possible that a lot of memory space might get wasted if only some address space is used and occupied.
    5.) Operations like insertion, deletion are time-consuming tasks on arrays.

*/
