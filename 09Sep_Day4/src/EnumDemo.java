
public enum EnumDemo {
	MONDAY, tuesday
}

enum Sum {
	;
	public int value;
}

class Anand {
	// EnumDemo demo=EnumDemo.MONDAY;
	void printEnum() {
		EnumDemo[] arr = EnumDemo.values();
		for (EnumDemo b1 : arr) {
			System.out.println(b1);
		}
	}

}