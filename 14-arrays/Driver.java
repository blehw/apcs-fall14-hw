public class Driver {
    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	Arraystuff at = new Arraystuff(10);
	System.out.println(as);
	System.out.println();
	System.out.println(at);
	System.out.println(as.find(75));
	System.out.println(as.maxVal());
	System.out.println(as.freq(75));
	System.out.println(at.mode());
    }
}
