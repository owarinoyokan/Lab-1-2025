package myfirstpackage;

public class MySecondClass {
	private int a;
	private int b;
	
	public MySecondClass(int a, int b) {
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