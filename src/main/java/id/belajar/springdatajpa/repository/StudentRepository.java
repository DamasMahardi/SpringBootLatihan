package id.belajar.springdatajpa.repository;

import id.belajar.springdatajpa.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository  extends JpaRepository<Student, Long> {

}
