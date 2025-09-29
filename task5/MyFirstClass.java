import myfirstpackage.*;

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