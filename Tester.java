package practiceday6;
import java.util.Arrays;
public class Tester {
	public static void main(String[] args) {
		long[] empPhone= {9889756321L,7896541258L};
		Employee emp=new Employee("Arun",empPhone,"LA788333DG",1101);
		Register<Employee> empRegister=new Register<>();
		String empRegId=empRegister.generateRegisterId(9);
		System.out.println("==========Employee Details==========\n");
		System.out.println("Registration Id: "+empRegId);
		empRegister.display(emp);
		System.out.println("\n");
		
		long[] empPhone2= {9090493455L,9898941258L};
		Employee emp2=new Employee("Andrew",empPhone2,2199,"SJLDD176J",1114);
		Register<Employee> empRegister2=new Register<>();
		String empRegId2=empRegister2.generateRegisterId(5);
		System.out.println("==========Employee Details==========\n");
		System.out.println("Registration Id: "+empRegId2);
		empRegister2.display(emp2);
		System.out.println("\n");
		
		long[] empPhone3= {8090493455L,8998941258L};
		Employee emp3=new Employee("Rose",empPhone3,2777,837427,1010);
		Register<Employee> empRegister3=new Register<>();
		String empRegId3=empRegister3.generateRegisterId(7);
		System.out.println("==========Employee Details==========\n");
		System.out.println("Registration Id: "+empRegId3);
		empRegister3.display(emp3);
		System.out.println("\n");
		
		long[] stuPhone1= {8090493455L,8998941258L};
		Student stu1=new Student("Aniket",stuPhone1,"ASD1344");
		Register<Student> stuRegister1=new Register<>();
		String stuRegId1=stuRegister1.generateRegisterId(4);
		System.out.println("==========Student Details==========\n");
		System.out.println("Registration Id: "+stuRegId1);
		stuRegister1.display(stu1);
		System.out.println("\n");
		
		long[] stuPhone2= {9030493455L,7098941258L};
		Student stu2=new Student("Joseph",stuPhone1,2210,"DUPPS2781J");
		Register<Student> stuRegister2=new Register<>();
		String stuRegId2=stuRegister2.generateRegisterId(10);
		System.out.println("==========Student Details==========\n");
		System.out.println("Registration Id: "+stuRegId2);
		stuRegister2.display(stu2);
		System.out.println("\n");
		
		long[] stuPhone3= {8090493455L,8998941258L};
		Student stu3=new Student("Albert",stuPhone3,7168,293049);
		Register<Student> stuRegister3=new Register<>();
		String stuRegId3=stuRegister3.generateRegisterId(8);
		System.out.println("==========Student Details==========\n");
		System.out.println("Registration Id: "+stuRegId3);
		stuRegister3.display(stu3);
		System.out.println("\n");
	}

}
