public class Array {
    public int[] Arraymaker() {
	private int[] intArray;
	private intArray = new int[100];
	private Random rand = new Random();
	for (int i=0;i<100;i=i+1) {
	    int n = rand.nextInt(76)+75;
	    intArray[i] = n;
	}
    }
}
