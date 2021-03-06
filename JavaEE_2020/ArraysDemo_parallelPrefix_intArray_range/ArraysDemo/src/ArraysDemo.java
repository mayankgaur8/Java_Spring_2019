import java.util.Arrays;
import java.util.function.IntBinaryOperator;

public class ArraysDemo
{
	// Performs addition
	static int compute(int x, int y)
	{
		int sum = x + y;
		return sum;
	}

	public static void main(String[] args)
	{
		int[] intArray = { 10, 20, 30, 500, 1000 };

		IntBinaryOperator intBinaryOperator = (x, y) -> compute(x, y);

		Arrays.parallelPrefix(intArray, 0, 3, intBinaryOperator);

		Arrays.stream(intArray).forEach(e -> System.out.print(e + "   "));
	}

}
