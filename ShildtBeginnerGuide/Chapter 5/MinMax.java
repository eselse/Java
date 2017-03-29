// Нахождение минимального и максимального значений в массиве
class MinMax {
	public static void main(String args[]) {
		int nums[] = new int[10];
		int min, max;

		nums[0] = 99;
		nums[1] = -10;
		nums[2] = 100123;
		nums[3] = 123;
		nums[4] = -12312;
		nums[5] = 2142;
		nums[6] = 234;
		nums[7] = 287;
		nums[8] = -923487;
		nums[9] = 12734;

		min = max = nums[0];

		for(int i = 1; i < 10; i++) {
			if(nums[i] < min) min = nums[i];
			if(nums[i] > max) max = nums[i];
		}
		System.out.println("min & max: " + min + " " + max);
	}
}