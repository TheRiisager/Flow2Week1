package interfaces;

import dto.PersonDTO;
import dto.PersonsDTO;

public interface IPersonFacade {

    public PersonDTO addPerson(PersonDTO personDTO);
    public PersonDTO deletePerson(int id);
    public PersonDTO getPerson(int id);
    public PersonsDTO getAllPersons();
    public PersonDTO editPerson(PersonDTO p);


}
