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

    public LocalDate getBirthdate() {
        return birthdate;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Author)) {
            return false;
        }

        Author other = (Author) object;

        return name.equals(other.name) && birthdate.equals(other.birthdate);
    }
}
