package br.com.erudio.cursospringboot.repositories;

import br.com.erudio.cursospringboot.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PersonRepository extends JpaRepository<Person, Long> {
}
