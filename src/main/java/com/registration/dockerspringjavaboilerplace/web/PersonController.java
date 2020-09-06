package com.registration.dockerspringjavaboilerplace.web;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.registration.dockerspringjavaboilerplace.models.Person;
import com.registration.dockerspringjavaboilerplace.repository.PersonRepository;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/rest/person")
public class PersonController {
	
	
	@Autowired
	PersonRepository personRepository;
	
	@GetMapping
	public List<Person> getAll() {
		return (List<Person>) personRepository.findAll();
	}
	
	@GetMapping("{id}")
	public Optional<Person> getById(@PathVariable(value="id") long id) {
		return personRepository.findById(id);
	}
	
	@PostMapping
	public Person savePerson(@RequestBody Person person) {
		return personRepository.save(person);
	}
	
	@DeleteMapping
	public void deletePerson(@RequestBody Person person) {
		personRepository.delete(person);
	}
	
	@PutMapping
	public Person editPerson(@RequestBody Person person) {
		return personRepository.save(person);
	}


}
