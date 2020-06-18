/*Write a java program that generates the minimum and maximum value for each of the Numeric Wrapper classes (Byte, Short, Integer, Long, Float, Double)
Solution:
*/
class Range {
	public static void main(String ar[]) {
		System.out.println("Integer range:");
		System.out.println("min: " + Integer.MIN_VALUE);
		System.out.println("max: " + Integer.MAX_VALUE);

		System.out.println("Double range:");
		System.out.println("min: " + Double.MIN_VALUE);
		System.out.println("max: " + Double.MAX_VALUE);

		System.out.println("Long range:");
		System.out.println("min: " + Long.MIN_VALUE);
		System.out.println("max: " + Long.MAX_VALUE);

		System.out.println("Short range:");
		System.out.println("min: " + Short.MIN_VALUE);
		System.out.println("max: " + Short.MAX_VALUE);

		System.out.println("Byte range:");
		System.out.println("min: " + Byte.MIN_VALUE);
		System.out.println("max: " + Byte.MAX_VALUE);

		System.out.println("Float range:");
		System.out.println("min: " + Float.MIN_VALUE);
		System.out.println("max: " + Float.MAX_VALUE);
	}
	
}
