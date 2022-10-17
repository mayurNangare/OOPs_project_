import java.util.Scanner;
import java.util.Arrays;

public class SumOfIndices {
	
	public static String findIndices(int arr[],int target) {
		int temp[] = new int[2]; 
		for(int i=0;i<=arr.length;i++) {
			for(int j=i+1;j<=arr.length-1;j++) {
				if((arr[i]+arr[j])==target) {
					temp[0]=i;
					temp[1]=j;
					return Arrays.toString(temp);
				}
			}
		}
		return Arrays.toString(temp);	
	}
	
	public static void main(String[] args) {
		
		//case 1 -
		int sortedArray[] = {2,7,11,15};
		int target = 9;
		
//		//case 2 -
//		int sortedArray[] = {2,4,6};
//		int target = 6;
//		
//		//case 3 - 
//		int sortedArray[] = {4,4};
//		int target = 8;
		
		//case custom --
		
//		int sortedArray[] = {1,5,6,7,9};
//		int target = 11;
		System.out.println("Array: "+Arrays.toString(sortedArray)+ " Target: "+target+" output: " +findIndices(sortedArray, target));
		
		
	}

}
