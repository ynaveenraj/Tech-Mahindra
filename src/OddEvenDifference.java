
public class OddEvenDifference {
	
	public static int findOddEvenDifference(int n, int[] arr) {
		int oddSum = 0, evenSum = 0;
		for(int i = 0; i < n; i++) {
			if(arr[i]%2 == 0)
				evenSum += arr[i];
			else
				oddSum += arr[i];
		}
		return oddSum - evenSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr = {10, 11, 7, 12, 14};
		System.out.println(findOddEvenDifference(n, arr));
	}

}
