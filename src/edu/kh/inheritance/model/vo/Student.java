package edu.kh.inheritance.model.vo;

public class Student extends Person {
				//  확장한다 부모 클래스를 
	// => Student 클래스에 Person 클래스 내용을 연장한다.
	// == Student 클래스에 Person 클래스 내용(필드, 메서드)을 추가하여 확장한다.
	
	//**** 상속 ****
	//extends : 확장하다, 연장하다... 
	
	
	/*
	private String name;
	private int age;
	private String nationality;
	*/
	private int grade; 	// 학년
	private int classRoom;  // 반
	
	
	public Student() {
		
		/* Student() 객체 생성 시, 내부에 상속받은 Person객체를 생성하기 위한
		 * Person 생성자 호출 코드 필요함!! 
		 */
		
		//  super : 상위 
		// super == Person (Student를 기준으로!) 
		super(); // super() 생성자 
		// 부모의 생성자를 호출하는 코드로 반드시, 자식생성자 '최상단'에 작성되어야 함! 
		// ==> 부모의 생성자 실행(필드 초기화 + 특정기능 수행)  상위의 그분!! 이라고 부름 
		
		// * super() 생성자 때문에
		// 자식 객체 내부에 부모 객체가 생성된다. 
		
		// * super() 생성자 미작성시
		// 컴파일러가 컴파일 단계에서 자동으로 추가해줌. 	
		
	}
	
	public Student(String name, int age, String nationality, int grade, int classRoom) {
		/*
		this.name = name;
		this.age = age;
		this.nationality = nationality;
		*/
		
		// this.name = name;
		// 왜? 부모의 필드에 private 접근 제한자가 있어서
		// 아무리 물려받은 자식이라도 다른 객체이기 때문에 직접접근 불가

		/* 1) 간접 접근 방법 사용 가능
		setName(name);
		setAge(age);
		setNationality(nationality);
		
		// 부모의 setter를 이용할 수 있지만, 비효율적이다.
		*/
	
		// 2) super를 이용해 부모의 매개변수 생성자 호출
		super(name, age, nationality); // 부모의 생성자 중, 매개변수 생성자 호출 
		
		
		this.grade = grade;
		this.classRoom = classRoom;
		
	}

	
	
	// 메소드
	// getter, setter 
	/*
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	 */
	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getClassRoom() {
		return classRoom;
	}

	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
	
	
	@Override
	public String toString() {
		
		return super.toString() + " / " + grade + " / " + classRoom;
			// 부모꺼 가져옴            
	}
	
	
	
	
	
	
	
	
	
	
}
