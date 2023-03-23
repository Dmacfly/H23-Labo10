package ulaval.glo2003.infra;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;

@Entity("authors")
public class AuthorMongoModel {
    @Id
    public String name;
    public String birthdate;
    public BookModel book;
}
