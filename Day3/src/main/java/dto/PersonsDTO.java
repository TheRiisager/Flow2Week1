package dto;

import java.util.ArrayList;
import java.util.List;

public class PersonsDTO {

    private List<PersonDTO> persons;

    public PersonsDTO() {
        this.persons = new ArrayList<>();
    }

    public List<PersonDTO> getPersons() {
        return persons;
    }

    public void setPersons(List<PersonDTO> persons) {
        this.persons = persons;
    }
}
