package ulaval.glo2003.infra;

import ulaval.glo2003.domain.Author;
import ulaval.glo2003.domain.AuthorRepository;

import java.util.ArrayList;
import java.util.List;

public class InMemoryAuthorRepository implements AuthorRepository {
    private final List<Author> authors = new ArrayList<>();

    @Override
    public void save(Author author) {
        authors.add(author);
    }

    @Override
    public Author getByName(String name) {
        return authors.stream()
                .filter(author -> author.getName().equals(name))
                .findFirst()
                .orElseThrow();
    }
}
