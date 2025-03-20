package lab_10.webProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebProjectApplication {

	public static void main(String[] args) {
		//		SpringApplication.run(DemoApplication.class, args);
		Person person = PersonFactory.createDefaultPerson();
		System.out.println("Name: " + person.getName() + ", Age: " + person.getAge() + ", Address: " + person.getAddress());

		Student student = new Student();
		student.setName("Asilbek");
		student.setAge(19);
		student.setAddress("Sevinch Street");
		student.setStudentId("230067");
		System.out.println("Student Name: " + student.getName() + ", Student ID: " + student.getStudentId());

		GenericContainer<Student> stringContainer = new GenericContainer<Student>();
		stringContainer.setItem(student);
		System.out.println("Generic Container Item: " + stringContainer.getItem().getName());

//		Test
		String activeProfile = System.getenv("SPRING_PROFILES_ACTIVE");
		System.out.println("Active Spring Profile: " + (activeProfile != null ? activeProfile : "default"));
	}

}
