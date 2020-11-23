
public class TotalDistance {
	
	public static int findTotalDistance(int n, int[] arr) {
		int total = 0;
		for(int i = 0; i < arr.length-1; i++)
			total += Math.abs(arr[i]-arr[i+1]);
		return total;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr = {10, 11, 7, 12, 14};
		System.out.println(findTotalDistance(n, arr));
	}

}
