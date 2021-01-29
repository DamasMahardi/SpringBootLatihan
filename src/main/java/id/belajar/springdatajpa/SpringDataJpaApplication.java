package id.belajar.springdatajpa;

import id.belajar.springdatajpa.entity.BookCategory;
import id.belajar.springdatajpa.entity.Course;
import id.belajar.springdatajpa.entity.Student;
import id.belajar.springdatajpa.repository.BookCategoryRepository;
import id.belajar.springdatajpa.repository.BookRepository;
import id.belajar.springdatajpa.repository.CourseRepository;
import id.belajar.springdatajpa.repository.StudentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import id.belajar.springdatajpa.entity.Book;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

	private final Logger LOG= LoggerFactory.getLogger(SpringDataJpaApplication.class);
	@Autowired
	private BookRepository bookRepository;

	@Autowired
	private BookCategoryRepository bookCategoryRepository;

	@Autowired
	private StudentRepository studentRepository;

	@Autowired
	private CourseRepository courseRepository;


	public static void main(String[] args) {
		SpringApplication.run(SpringDataJpaApplication.class, args);


	}

	@Override
	public void run(String... args) throws Exception {

//		Book book1= new Book();
//		book1.setTitle("Belajar Spring Boot");
//		book1.setWriter("Mahardi damas");
//		book1.setIsbn("IS-78787");
//
//		Book book2= new Book();
//		book2.setTitle("Belajar Spring Boot 2");
//		book2.setWriter("Damas Mahardi");
//		book2.setIsbn("IS-e232");
//
//		bookRepository.save(book1);
//		bookRepository.save(book2);
//
//
//		LOG.info("Berhasil Menyimpan"+book1);
//		LOG.info("Berhasil Menyimpan"+book2);

//		List<Book> books=bookRepository.findAll();
//		LOG.info("Books"+books);

//		final String writer="Damas Mahardi";

//		List<Book> books= bookRepository.findAllByWriter(writer);
//		LOG.info("Books berdasarkan writter"+books);
//
//		List<Book> books = bookRepository.findAllQueryNative();
//		LOG.info("Books tes"+books);
//
//		final String writer= "Damas Mahardi";
//		List<Book> books= bookRepository.findAllByWriterQueryNative(writer);
//
//		LOG.info("Books"+books);

////		//create book categori
//		BookCategory bookCategory = bookCategoryRepository.save(new
//				BookCategory("Programming", new Book("Java 1","Damas Mahardi","SEI92002"), new
//				Book("Java 2","Damas Mahardi","UEOEI829")));

//		LOG.info("BookCategory :"+bookCategory);


		//many to many
		Student student = new Student("Damas Mahardi", 15);
		studentRepository.save(student);

		//Cousere
		Course course1= new Course("Sprimg boot", 12,1500);
		Course course2=new Course("Hibernate", 13, 4000);
		Course course3= new Course("Jpa", 15, 14000);

		courseRepository.saveAll(Arrays.asList(course1,course2,course3));
		student.getCourses().addAll(Arrays.asList(course1,course2,course3));
		studentRepository.save(student);




	}
}
