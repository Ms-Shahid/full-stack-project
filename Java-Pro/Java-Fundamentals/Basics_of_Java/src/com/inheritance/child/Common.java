package com.inheritance.child;
import com.inheritance.patent.*;

class B extends Parent_A{
	public void m2() {
		System.out.println("Frm B");
	}
}
class C extends Parent_A{
	public void m1(String name) {
		System.out.println("Frm C");
	}
}
class D extends Parent_A{
	public void m1() {
		System.out.println("Frm D");
	}
}
public class Common {

	public static void main(String[] args) {
		B b = new B();
		C c = new C();
		D d = new D();
		b.m1(); //from Parent_A
		c.m1();
		d.m1();
	}

}
