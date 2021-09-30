package com.digitalinnovationone.personApi.service;

import com.digitalinnovationone.personApi.dto.response.MessageResponseDTO;
import com.digitalinnovationone.personApi.entity.Person;
import com.digitalinnovationone.personApi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class PersonService {

    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    public MessageResponseDTO createPerson(Person person) {
        Person savedPerson = personRepository.save(person);
        return MessageResponseDTO
                .builder()
                .message("Created person with Id " +  savedPerson.getId())
                .build();
    }
}
