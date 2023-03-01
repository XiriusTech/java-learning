package tech.xirius.tutorial.filter.services.specifications;

import org.springframework.data.jpa.domain.Specification;

import tech.xirius.filter.jpa.QueryBuilderProcessor;
import tech.xirius.tutorial.filter.entities.Person_;
import tech.xirius.tutorial.filter.entities.User;
import tech.xirius.tutorial.filter.entities.UserFilter;
import tech.xirius.tutorial.filter.entities.User_;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

public class UserSpecification implements Specification<User> {

    /**
     * Default Serial Version UID
     */
    private static final long serialVersionUID = 1L;
    private final UserFilter filter;

    public UserSpecification(UserFilter filter) {
        super();
        this.filter = filter;
    }

    @Override
    public Predicate toPredicate(Root<User> root, CriteriaQuery<?> query, CriteriaBuilder criteriaBuilder) {
        List<Predicate> listP = new ArrayList<>();

        QueryBuilderProcessor processor = new QueryBuilderProcessor(criteriaBuilder);

        listP.addAll(processor.createPredicates(root.get(User_.id), filter.getId()));
        listP.addAll(processor.createPredicates(root.get(User_.active), filter.getActive()));
        listP.addAll(processor.createPredicates(root.get(User_.strikes), filter.getStrikes()));
        listP.addAll(processor.createPredicates(root.get(User_.username), filter.getUsername()));

        if (filter.getRealPerson() != null) {
            listP.addAll(processor.createPredicates(root.get(User_.realPerson).get(Person_.id),
                    filter.getRealPerson().getId()));
            listP.addAll(processor.createPredicates(root.get(User_.realPerson).get(Person_.personRegion),
                    filter.getRealPerson().getPersonRegion()));
        }

        return criteriaBuilder.and(listP.toArray(new Predicate[0]));
    }

}
