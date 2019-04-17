package SortObjectList;

import java.util.*;

public class Employee implements Comparable<Employee> {

	private String name;
	private String occupation;
	private int salary;

	public Employee(String firstname, String job, int value) {
		super();
		this.name = firstname;
		this.occupation = job;
		this.salary = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String toString() {
		return "Name of employee is: " + name + " Occupation is: " + occupation + " Salary is:" + salary;
	}

	@Override
	public int compareTo(Employee comparemydata) {

		int compareValue = ((Employee) comparemydata).getSalary();

		return this.salary - compareValue;
	}

	public static void main(String args[]) {

		Employee employee1 = new Employee("Hello1", "Programmer1", 1000);
		Employee employee2 = new Employee("Hello2", "Programmer2", 7000);
		Employee employee3 = new Employee("Hello3", "Programme3", 6000);
		Employee employee4 = new Employee("Hello4", "Programmer4", 4000);
		Employee employee5 = new Employee("Hello5", "Programmer5", 8000);

		List<Employee> employee = new ArrayList();

		employee.add(employee1);
		employee.add(employee2);
		employee.add(employee3);
		employee.add(employee4);
		employee.add(employee5);

		System.out.println("Objects before sorting: ");
		for (Employee empl : employee) {
			System.out.println(empl);
		}

		System.out.println("\n");

		Collections.sort(employee);

		System.out.println("Objects after sorting: ");
		for (Employee empl : employee) {
			System.out.println(empl);
		}
	}

}
