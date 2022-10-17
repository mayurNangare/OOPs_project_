import java.util.Arrays;
public class LargestNumberFromArray {
	
	public static String largestNumber(int[] nums) {
		int n = nums.length;
		String[] s = new String[n];
		for (int i=0;i<n;i++) { 
			s[i]=String.valueOf(nums[i]);
		}	
		Arrays.sort(s,(a,b)-> (b + a).compareTo(a+b));
		
		StringBuilder sb = new StringBuilder();
		for(String str:s) {
			sb.append(str);
		}
		String result = sb.toString();
		return result.startsWith("0")?"0":result;
		
	}
	
	public static void main(String[] args) {
//		int array[] = {11, 2};
		int array[] = {2, 30, 56};
		System.out.println(largestNumber(array));
	}
	
}
