package ulaval.glo2003.infra;

import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import dev.morphia.query.filters.Filters;
import ulaval.glo2003.domain.Author;
import ulaval.glo2003.domain.AuthorRepository;
import ulaval.glo2003.domain.Book;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class MongoAuthorRepository implements AuthorRepository {

    private final Datastore datastore;

    public MongoAuthorRepository() {
        MongoClient client = MongoClients.create(System.getenv("MONGO_URL"));
        datastore = Morphia.createDatastore(client, "library");
        datastore.getMapper().mapPackage("ulaval.glo2003");
        datastore.ensureIndexes();
    }

    @Override
    public void save(Author author) {
        AuthorMongoModel model = new AuthorMongoModel();
        model.name = author.getName();
        model.birthdate = author.getBirthdate().format(DateTimeFormatter.ISO_DATE);
        model.book = new BookModel("Un livre");

        datastore.save(model);
    }

    @Override
    public Author getByName(String name) {
        try {
            AuthorMongoModel model = datastore.find(AuthorMongoModel.class)
                    .filter(Filters.eq("_id", name))
                    .iterator()
                    .next();

            return new Author(model.name, LocalDate.parse(model.birthdate));
        } catch (Exception e) {
            throw new RuntimeException("Could not find author");
        }
    }
}
