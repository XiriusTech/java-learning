package tech.xirius.tutorial.filter.web.rest.v1;

import javax.validation.Valid;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import tech.xirius.tutorial.filter.entities.PersonFilter;
import tech.xirius.tutorial.filter.repository.PersonRepository;
import tech.xirius.tutorial.filter.services.PersonSpecification;
import tech.xirius.tutorial.filter.entities.Person;


@AllArgsConstructor
@RestController
@RequestMapping("/api/v1/person")
@Api(description = "Allows finding persons.", tags = { "Tutorial" })
public class PersonResource {
    private PersonRepository personRepository;

    @GetMapping("")
    @ApiOperation("Test the filter of person entity")
    public Page<Person> findPersons(@Valid PersonFilter filter, Pageable pageable) {
        Specification<Person> spec = new PersonSpecification(filter);
        
        return personRepository.findAll(spec, pageable);
    }
}
