package co.edu.compound;

public class ClassExam {
	public static void main(String[] args) {
		String name = "홍길동";
		int age = 28;

		String[] names = { "홍길동", "박민수", "김익수" };
		int[] scores = { 80, 85, 79 };
		int[] ages = { 19, 20, 19 };

		Student s1 = new Student(); // new 초기화
		s1.name = "홍길동";
		s1.age = 19;
		s1.score = 90;
		s1.height = 178.2;

		Student s2 = new Student();
		s2.name = "박민수";
		s2.age = 20;
		s2.score = 85;
		s2.height = 145.2;

		Student s3 = new Student();
		s3.name = "김익수";
		s3.age = 19;
		s3.score = 79;
		System.out.println(s3.name);
		s3.height = 166.2;

		Student[] students = { s1, s2, s3 };
		
		for(int i = 0; i < students.length; i++) {
			System.out.println(students[i].height);
			if(students[i].name.equals("김익수")) {
				System.out.println("나이: "+ students[i].age);
			}
		}
		
		//
		Car c1 = new Car("소나타", 220); // 힙메모리에 인스턴스 생성
		
		c1.price = 3000000;
		System.out.println("\n최고속도: " + c1.maxSpeed + "km/h");
		c1.weight = 321.5;
		c1.width = 23.3;
		c1.setSpeed(56);
		c1.showSpeed();
		c1.start();
		c1.run();
		c1.stop();
		
		
		Car c2 = new Car(); // 힙메모리에 인스턴스 생성
		c2.model = "K5";
		c2.price = 234995;
		c2.maxSpeed = 320;
		c2.weight = 356.5;
		c2.width = 34.2;
		c2.speed = 40;
		c2.start();
		c2.run();
		c2.stop();
		c2.showSpeed();
		
		
		

	}

}
