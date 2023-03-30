package ulaval.glo2003;

import org.glassfish.grizzly.http.server.HttpServer;
import org.glassfish.jersey.grizzly2.httpserver.GrizzlyHttpServerFactory;
import org.glassfish.jersey.server.ResourceConfig;
import ulaval.glo2003.domain.Author;
import ulaval.glo2003.domain.AuthorRepository;
import ulaval.glo2003.infra.MongoAuthorRepository;

import java.io.IOException;
import java.net.URI;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) throws IOException {
        ResourceConfig resourceConfig = new ResourceConfig();
        URI uri = URI.create("http://0.0.0.0:8080/");
        AuthorRepository repository = new MongoAuthorRepository();
        Author author = new Author("John", LocalDate.now());
        repository.save(author);

        HttpServer server = GrizzlyHttpServerFactory.createHttpServer(uri, resourceConfig);
        server.start();
    }
}
