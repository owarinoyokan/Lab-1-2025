class MyFirstClass {
	static void main(String[] s) {
		MySecondClass o = new MySecondClass(10, 10);
		int i, j;
		for (i = 1; i <= 8; i++) {
			for(j = 1; j <= 8; j++) {
				o.setA(i);
				o.setB(j);
				System.out.print(o.multiAB());
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
class MySecondClass {
	private int a;
	private int b;
	
	MySecondClass(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public void setA(int val) {
		this.a = val;
	}
	
	public int getA() {
		return a;
	}
	
	public void setB(int val) {
		this.b = val;
	}
	
	public int getB() {
		return b;
	}
	
	public int multiAB() {
		return a*b;
	}
}