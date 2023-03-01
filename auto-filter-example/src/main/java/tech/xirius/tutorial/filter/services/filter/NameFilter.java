package tech.xirius.tutorial.filter.services.filter;

import java.util.Arrays;
import java.util.List;

import tech.xirius.filter.filtering.EqualsFilter;
import tech.xirius.filter.filtering.Filter;
import tech.xirius.filter.filtering.IsNullFilter;
import tech.xirius.filter.filtering.MultiFilter;
import tech.xirius.filter.utils.FilterUtils;

/**
 * An example of a custom MultiFilter. This does not need a new QueryBuilder
 * since the default one already supports it, but be sure that the
 * {@link MultiFilter#retrieveSubFilters()} method is properly implemented
 */
public class NameFilter implements MultiFilter<String> {
    private EqualsFilter<String> equals;
    private IsNullFilter isNull;
    private StartLikeFilter startLike;

    public String getEquals() {
        return FilterUtils.getWrapper(equals);
    }

    public void setEquals(String equals) {
        this.equals = FilterUtils.setWrapper(this.equals, equals, () -> new EqualsFilter<>());
    }

    public Boolean getIsNull() {
        return FilterUtils.getWrapper(isNull);
    }

    public void setIsNull(Boolean isNull) {
        this.isNull = FilterUtils.setWrapper(this.isNull, isNull, () -> new IsNullFilter());
    }

    public String getStartLike() {
        return FilterUtils.getWrapper(startLike);
    }

    public void setStartLike(String startLike) {
        this.startLike = FilterUtils.setWrapper(this.startLike, startLike, () -> new StartLikeFilter());
    }

    @Override
    public List<Filter> retrieveSubFilters() {
        return Arrays.asList(equals, isNull, startLike);
    }
}
