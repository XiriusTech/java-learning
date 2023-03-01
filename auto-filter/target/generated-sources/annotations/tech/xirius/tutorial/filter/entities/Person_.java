package tech.xirius.tutorial.filter.entities;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Person.class)
public abstract class Person_ {

	public static volatile SingularAttribute<Person, Double> score;
	public static volatile SingularAttribute<Person, Gender> myGender;
	public static volatile SingularAttribute<Person, String> name;
	public static volatile SingularAttribute<Person, Long> id;
	public static volatile SingularAttribute<Person, BigDecimal> salary;
	public static volatile SingularAttribute<Person, Integer> age;

	public static final String SCORE = "score";
	public static final String MY_GENDER = "myGender";
	public static final String NAME = "name";
	public static final String ID = "id";
	public static final String SALARY = "salary";
	public static final String AGE = "age";

}

