package tech.xirius.tutorial.filter.entities;

import tech.xirius.filter.filtering.Filter;

public class Person2Filter implements Filter {

    private PersonFilter person = null;

    public void setPerson(PersonFilter value) {
        this.person = value;
    }

    public PersonFilter getPerson() {
        return this.person;
    }


}