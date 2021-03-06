import java.util.Arrays;

public class _1_ReverseArray
{
	public static void main(String[] args)
	{
		int array[] = { 1, 2, 3 };
		reverseArray(array);
	}

	public static void reverseArray(int[] array)
	{
		// displaying the original array
		System.out.println(Arrays.toString(array));

		// reversing the array
		int start = 0;
		int end = array.length - 1;

		while (start < end)
		{
			int temp = array[start];
			
			//swapping elements 
			array[start] = array[end];
			array[end] = temp;
			System.out.println("Start: " + start + ", End: " + end);
			start++;
			end--;
			
			// displaying the reversed array
			System.out.println(Arrays.toString(array));
		}
	}
}
