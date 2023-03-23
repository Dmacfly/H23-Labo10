package ulaval.glo2003.infra;

import dev.morphia.annotations.Entity;

@Entity
public class BookModel {
    public
    String name;

    public BookModel(String name) {
        this.name = name;
    }
}
