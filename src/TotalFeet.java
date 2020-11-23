
public class TotalFeet {
	
	public static int findTotalFeet(int n, int[] arr) {
		int sum = 0;
		for(int i : arr) {
			if(!(i/12 < 1))
				sum += (i/12);
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 5;
		int[] arr = {18, 11, 27, 12, 14};
		System.out.println(findTotalFeet(n, arr));
	}

}
