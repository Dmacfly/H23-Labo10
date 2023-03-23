package ulaval.glo2003.domain;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static com.google.common.truth.Truth.assertThat;

public abstract class AuthorRepositoryITest {

    protected AuthorRepository repository;

    @BeforeEach
    public void setUp() {
        repository = createRepo();
    }

    @Test
    void canSaveAnAuthor() {
        String name = "John";
        Author author = new Author(name, LocalDate.now());
        repository.save(author);

        Author foundAuthor = repository.getByName(name);

        assertThat(foundAuthor).isEqualTo(author);
    }

    abstract protected AuthorRepository createRepo();
}
