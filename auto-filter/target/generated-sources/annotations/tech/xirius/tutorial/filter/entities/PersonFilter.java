package tech.xirius.tutorial.filter.entities;

import java.math.BigDecimal;
import tech.xirius.filter.filtering.IsNullFilter;
import tech.xirius.filter.filtering.Filter;
import tech.xirius.filter.filtering.BasicFilter;

public class PersonFilter implements Filter {

    private BasicFilter<Long> id = null;
    private BasicFilter<Integer> age = null;
    private IsNullFilter name = null;
    private BasicFilter<BigDecimal> salary = null;
    private GenderFilter myGender = null;

    public void setId(BasicFilter<Long> value) {
        this.id = value;
    }

    public BasicFilter<Long> getId() {
        return this.id;
    }

    public void setAge(BasicFilter<Integer> value) {
        this.age = value;
    }

    public BasicFilter<Integer> getAge() {
        return this.age;
    }

    public void setName(IsNullFilter value) {
        this.name = value;
    }

    public IsNullFilter getName() {
        return this.name;
    }

    public void setSalary(BasicFilter<BigDecimal> value) {
        this.salary = value;
    }

    public BasicFilter<BigDecimal> getSalary() {
        return this.salary;
    }

    public void setMyGender(GenderFilter value) {
        this.myGender = value;
    }

    public GenderFilter getMyGender() {
        return this.myGender;
    }


    public static class GenderFilter extends BasicFilter<Gender> {
    }
}