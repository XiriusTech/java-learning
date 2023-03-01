package tech.xirius.tutorial.filter.services.filter.builders;

import java.util.Arrays;
import java.util.List;

import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;

import com.google.auto.service.AutoService;

import tech.xirius.filter.filtering.Filter;
import tech.xirius.filter.filtering.LessThanFilter;
import tech.xirius.filter.jpa.QueryBuilderProcessor;
import tech.xirius.filter.jpa.builders.QueryBuilder;
import tech.xirius.tutorial.filter.services.filter.StartLikeFilter;

/**
 * {@link QueryBuilder} for the {@link LessThanFilter}
 */
@AutoService(QueryBuilder.class)
public class StartLikeQueryBuilder implements QueryBuilder {
    @Override
    public <T extends Comparable<? super T>> List<Predicate> createPredicates(
            QueryBuilderProcessor processor, Expression<T> x, Filter filter) {
        if (filter instanceof StartLikeFilter) {
            String likeValue = ((StartLikeFilter) filter).getValue();
            return Arrays.asList(processor.getCriteriaBuilder().like(x.as(String.class),
                    likeValue + "%"));
        }
        return null;
    }
}
