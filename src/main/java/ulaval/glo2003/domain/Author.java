package ulaval.glo2003.domain;

import java.time.LocalDate;

public class Author {
    private final String name;
    private final LocalDate birthdate;

    public Author(String name, LocalDate birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }
}
