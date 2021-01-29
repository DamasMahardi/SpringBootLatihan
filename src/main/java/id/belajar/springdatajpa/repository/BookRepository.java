package id.belajar.springdatajpa.repository;

import id.belajar.springdatajpa.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findAllByWriter(String writer);
    List<Book> findAll();
    Book findByIsbn(String isbn);
    Book findByTitle(String title);

    @Query(
            nativeQuery = true,
            value = "select * from book"

    )
    List<Book> findAllQueryNative();

    @Query(
            nativeQuery = true,
            value = "select * from book where writer=?1"

    )
    List<Book> findAllByWriterQueryNative(String writer);





}
