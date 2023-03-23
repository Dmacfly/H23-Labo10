package ulaval.glo2003.domain;

public interface AuthorRepository {
    void save(Author author);
    Author getByName(String name);
}
