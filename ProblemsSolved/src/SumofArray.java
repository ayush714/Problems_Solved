
public class SumofArray {
	public static int SumofArray(int arr[]) {
		int sum =0; 
		for (int i =0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	public static int SumofArrayRecursively(int N, int arr[]) {
		if (N <= 0) {
			return 0;
		} else {
			return SumofArrayRecursively(N - 1, arr) + arr[N - 1];
		}
	}
	public static void main(String[] args) {
		int arr[] = {1,2,3};
		System.out.println(SumofArray(arr));
		int arr1[] = {1,2,3};
		System.out.println(SumofArrayRecursively(2, arr1));
	}

}
