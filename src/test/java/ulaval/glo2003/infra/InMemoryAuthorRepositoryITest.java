package ulaval.glo2003.infra;


import ulaval.glo2003.domain.AuthorRepository;
import ulaval.glo2003.domain.AuthorRepositoryITest;

class InMemoryAuthorRepositoryITest extends AuthorRepositoryITest {

    @Override
    protected AuthorRepository createRepo() {
        return new InMemoryAuthorRepository();
    }
}