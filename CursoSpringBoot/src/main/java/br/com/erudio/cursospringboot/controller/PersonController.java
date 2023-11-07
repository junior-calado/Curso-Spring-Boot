package br.com.erudio.cursospringboot.controller;

import java.util.List;

import br.com.erudio.cursospringboot.model.Person;
import br.com.erudio.cursospringboot.services.PersonServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonServices service;

    @GetMapping
    public List<Person> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Person findById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

    @PostMapping
    public Person create(@RequestBody Person person) {
        return service.create(person);
    }

    @PutMapping
    public Person update(@RequestBody Person person) {
        return service.update(person);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        service.delete(id);
        return ResponseEntity.ok().build();
    }

}