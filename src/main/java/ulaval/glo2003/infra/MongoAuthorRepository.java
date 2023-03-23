package ulaval.glo2003.infra;

import ulaval.glo2003.domain.Author;
import ulaval.glo2003.domain.AuthorRepository;

public class MongoAuthorRepository implements AuthorRepository {
    @Override
    public void save(Author author) {

    }

    @Override
    public Author getByName(String name) {
        return null;
    }
}
