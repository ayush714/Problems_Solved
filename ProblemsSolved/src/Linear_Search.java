
public class Linear_Search {
	public static int Linear(int N, int arr[], int X) { 
		/*
		 It takes N --> Size of the array 
		 		  arr[] -->  array
		 		  X --> Element to find
		 
		 It returns the index of the element and if 
		 the element in not present it returns -1. 
		 */
		for (int i = 0; i <= N; i++) { 
			if (arr[i] == X) { 
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int N = 3;
		int arr[] = {1,2,3}; 
		int X = 3; 
		System.out.println(Linear(N, arr, X));
	}

}
