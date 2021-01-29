package id.belajar.springdatajpa.repository;

import id.belajar.springdatajpa.entity.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookCategoryRepository  extends JpaRepository<BookCategory, Long> {

}
