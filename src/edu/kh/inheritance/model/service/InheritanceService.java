package edu.kh.inheritance.model.service;

import java.util.Scanner;

import edu.kh.inheritance.model.vo.Employee;
import edu.kh.inheritance.model.vo.Person;
import edu.kh.inheritance.model.vo.Student;

public class InheritanceService {

	
	// 상속 확인 예제
	public void ex1() {
		// Person을 상속받은 Student가 Person필드, 메소드를 
		// 사용할 수 있는가?
		
		Person p = new Person();
		
//		p.name ="홍길동"; // private 때문에 직접접근불가( 에러발생 )
		
		p.setName("홍길동");
		p.setAge(25);
		p.setNationality("대한민국");
		
		System.out.println(p.getName());
		System.out.println(p.getAge());
		System.out.println(p.getNationality());
		
		System.out.println("-".repeat(20));
		
		// Student 객체 생성
		Student std = new Student();
		
		// Student만의 고유한 필드 
		std.setGrade(4);
		std.setClassRoom(5);
		
		// Person 클래스로 부터 상속받은 필드
		std.setName("고길동"); // Student에 없음. 상속받았으므로 setter 사용할 수 있음.
		std.setAge(19);
		std.setNationality("대한민국");
		
		// Student가 Person의 메소드 뿐 아니라 필드도 상속 받았는지 확인 
		System.out.println(std.getName());
		System.out.println(std.getAge());
		System.out.println(std.getNationality());
		System.out.println(std.getGrade());
		System.out.println(std.getClassRoom());
		
		System.out.println("-".repeat(20));
		
		// Employee 객체 생성
		Employee emp = new Employee();
		
		// Employee만의 고유한 필드
		emp.setCompany("KH정보교육원");
		
		// Person 클래스로부터 상속받은 메소드
		emp.setName("유은서");
		emp.setAge(20);
		emp.setNationality("대한민국");
		
		System.out.println(emp.getName());
		System.out.println(emp.getAge());
		System.out.println(emp.getNationality());
		System.out.println(emp.getCompany());
		
		
		//추가된 breath() 메서드 상속 확인하기 
		p.breath();
		std.breath();
		emp.breath();
		
		// 상속의 특징 : 코드 추가 및 수정에 용이하다.
		// => 부모에게 정의하면, 상속받은 자식들은 모두 부모의 것을 그대로 받아서 쓸 수 있음! 
		
		
	}
	
	
	// super() 생성자 사용방법
	public void ex2() {
		
		// Student 매개변수 5개짜리 생성자 이용해서 함.
	Student std = new Student("김철수", 17, "한국",1,3);
		
	System.out.println(std.getName());
	System.out.println(std.getAge());
	System.out.println(std.getNationality());
	System.out.println(std.getGrade());
	System.out.println(std.getClassRoom());
		
		
		
		
	}

	
	// 오버라이딩 확인 예제
	public void ex3() {
		
		Student std = new Student();
		
		Employee emp = new Employee();
		
		std.move(); // Person에 있는거 가져다가 씀.
		
		emp.move(); // 재정의한 (Employee)거 가져다가 씀.
		
	}


	public void ex4() {
		// 모든 클래스는 Object의 클래스의 후손임.
		//  == 모든 클래스의 최상위 부모는 Object
		
		Person p = new Person(); // Object를 상속받은 Person 객체 생성
		
		Student std = new Student(); // Person을 상속받은 Student 객체 생성 
		
		// Object - Person - Student  
		
		System.out.println(p.hashCode());
		System.out.println(std.hashCode());
		// Person이 Object에서 물려받은 hashCode()를 Student가 또 물려받아 사용 
		// ???????????????????????????????????????????????????????????????????????? 
		
		String str = "abc";
		Scanner sc = new Scanner(System.in);
		
		System.out.println(str.hashCode());
		// Object-String 
		System.out.println(sc.hashCode());
		// Object-Scanner 
		
		
		
	}


	public void ex5() {
		//toString을 제일 오버라이딩에 많이 사용함.
		
		Person p = new Person("김철수",17,"한국");
		
		System.out.println(p.toString());
		// Object(X) - Person 
		
		System.out.println(p); // toString을 바로 불러옴. 
		// print 구문 수행 시, 참조 변수명을 작성하면, 
		// 자동으로 toString()메소드를 호출해서 출력함.
		
		System.out.println("-".repeat(20));
		
		Student std = new Student("이백점",18 , " 미국", 2, 6);
		
		System.out.println(std.toString());

		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

