class Solution {
    public void nextPermutation(int[] nums) {
        Permutation(nums);
    }
    public static void Permutation(int[] arr) {
        int l = arr.length;
		int p = -1;
		for (int i = l - 2; i >= 0; i--) {
			if (arr[i] < arr[i + 1]) {
				p = i;
				break;
			}
		}
		if (p == -1) {
			Reverse(arr, 0, l - 1);
			return;
		}
		int q = -1;
		for (int i = l - 1; i > p; i--) {
			if (arr[i] > arr[p]) {
				q = i;
				break;
			}
		}
		int temp = arr[p];
		arr[p] = arr[q];
		arr[q] = temp;
		Reverse(arr, p + 1, l - 1);

	}

	public static void Reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}
	}
    
   
}