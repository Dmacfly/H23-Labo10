package ulaval.glo2003.infra;

import ulaval.glo2003.domain.AuthorRepository;
import ulaval.glo2003.domain.AuthorRepositoryITest;

class MongoAuthorRepositoryITest extends AuthorRepositoryITest {

    @Override
    protected AuthorRepository createRepo() {
        return new MongoAuthorRepository();
    }
}