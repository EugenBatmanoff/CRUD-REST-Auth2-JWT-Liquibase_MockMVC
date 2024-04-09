package com.eugen.crudrestapp;

import com.eugen.crudrestapp.model.Book;
import com.eugen.crudrestapp.repository.BookRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.security.test.context.support.WithMockUser;

import static org.assertj.core.api.Assertions.assertThat;

@DataJpaTest
public class BookRepositoryTest {

    @Autowired
    private TestEntityManager entityManager;

    @Autowired
    private BookRepository bookRepository;

    @Test
    @WithMockUser
    public void whenFindByTitle_thenReturnBook() {

        Book book = new Book(null, "Test Book", "Test Author");
        entityManager.persistAndFlush(book);


        Book found = bookRepository.findByTitle(book.getTitle()).orElse(null);


        assertThat(found).isNotNull();
        assertThat(found.getTitle()).isEqualTo(book.getTitle());
    }
}
