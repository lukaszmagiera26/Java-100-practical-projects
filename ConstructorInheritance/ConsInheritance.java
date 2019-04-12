package ConstructorInheritance;

class student {
	student() {
		System.out.println("This is first sudent constructor");
	}
}

class school extends student {
	school() {
		System.out.println("This is second student constructor");
	}
}

class studentschool extends school {
	studentschool() {
		System.out.println("This is third student constructor");
	}
}

public class ConsInheritance {

	public static void main(String args[]) {
		studentschool ss = new studentschool();
	}
}