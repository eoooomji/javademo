package java009_inheritance.part07;

public class SuperClass {
	int x, y, z;

	public SuperClass() { // 10
		System.out.println("**** x, y, z에 값채우기 ****"); // 11
	} // end SuperClass() // 12

	public SuperClass(int k) { // 8
		this(); // 9
		this.x = k;  // 13
		System.out.println(k + "을 넘겨받은 생성자"); // 14
	} // end SuperClass(int k) // 15

	public SuperClass(int a, int b) { // 6
		this(a); // 7
		this.y = b; // 16
		System.out.println(a + "  " + b + "  을 넘겨받은 생성자"); // 17
	} // end SuperClass(int a, int b) // 18

	public SuperClass(int a, int b, int c) { // 4
		this(a, b); // 5
		z = c; // 18
		System.out.println(a + "  " + b + "  " + c + "  을 넘겨받은 생성자"); // 20
	} // end SuperClass(int a, int b, int c) // 21

	public void display() { // 23
		System.out.printf("%d %d %d \n", x, y, z); // 24
	} // 25
} // end class
