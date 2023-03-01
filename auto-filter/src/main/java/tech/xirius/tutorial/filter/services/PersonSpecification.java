package tech.xirius.tutorial.filter.services;

import org.springframework.data.jpa.domain.Specification;

import tech.xirius.filter.jpa.QueryBuilderProcessor;
import tech.xirius.tutorial.filter.entities.Person;
import tech.xirius.tutorial.filter.entities.PersonFilter;
import tech.xirius.tutorial.filter.entities.Person_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class PersonSpecification implements Specification<Person> {

    /**
     * Default Serial Version UID
     */
    private static final long serialVersionUID = 1L;
    private final PersonFilter filter;

    public PersonSpecification(PersonFilter filter) {
        super();
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(Root<Person> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> listP = new ArrayList<>();

        QueryBuilderProcessor processor = new QueryBuilderProcessor(criteriaBuilder);

        listP.addAll(processor.createPredicates(root.get(Person_.id), filter.getId()));
        listP.addAll(processor.createPredicates(root.get(Person_.age), filter.getAge()));
        listP.addAll(processor.createPredicates(root.get(Person_.myGender), filter.getMyGender()));
        listP.addAll(processor.createPredicates(root.get(Person_.name), filter.getName()));
        listP.addAll(processor.createPredicates(root.get(Person_.salary), filter.getSalary()));
        // listP.addAll(processor.createPredicates(root.get(Person_.score), filter.getScore()));
        
        return criteriaBuilder.and(listP.toArray(new Predicate[0]));
    }

}
