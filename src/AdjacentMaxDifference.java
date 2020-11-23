
public class AdjacentMaxDifference {
	
	public static int findMaxDifference(int n, int[] arr) {
		int diff = Integer.MIN_VALUE;
		for(int i = 0; i < arr.length-1; i++) {
			diff = Math.max(diff, arr[i]-arr[i+1]);
		}
		return diff;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr = {10, 11, 7, 12, 14};
		System.out.println(findMaxDifference(n, arr));
	}

}
