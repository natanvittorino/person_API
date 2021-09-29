package com.digitalinnovationone.personApi.repository;

import com.digitalinnovationone.personApi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {
}
