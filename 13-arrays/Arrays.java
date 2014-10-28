public class Arrays {
    public int[] frontPiece(int[] nums) {
	int[] intArray;
	if (nums.length<2) {
	    return nums;
	} else {
	    intArray = new int[2];
	    for (int i=0;i<2;i=i+1) {
		intArray[i]=nums[i];
	    }
	    return intArray;
	}
    }
    public int sum13(int[] nums) {
	int i=0;
	if (nums.length<1) {
	    return 0;
	} else {
	    for (int c=0;c<nums.length;c=c+1) {
		if (nums[c]==13) {
		    c = c +1;
		} else {
		    i = i + nums[c];
		}
	    }
	}
	return i;
    }
}
