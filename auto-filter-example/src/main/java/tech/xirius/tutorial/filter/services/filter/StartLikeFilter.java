package tech.xirius.tutorial.filter.services.filter;

import lombok.Getter;
import lombok.Setter;
import tech.xirius.filter.filtering.SingleFilter;

/**
 * Custom SingleFilter that is used to create a LIKE "my_query%" to
 * match with the beginning of the words in a database (e.g. "col" would match with "color").
 * This filter need a custom QueryBuilder to be able to be processed
 */
@Getter
@Setter
public class StartLikeFilter implements SingleFilter<String> {
    private String value;
}
