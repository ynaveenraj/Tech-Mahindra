import java.util.Arrays;

public class LargeSmallDifference {
	
	public static int findLargeSmallDifference(int n, int[] arr) {
		int max = Arrays.stream(arr).max().getAsInt();
		int min = Arrays.stream(arr).min().getAsInt();
		return max - min;
	}
	
	public static void main(String[] args) {
		int n = 5;
		int[] arr = {10, 11, 7, 12, 14};
		System.out.println(findLargeSmallDifference(n, arr));
	}

}
