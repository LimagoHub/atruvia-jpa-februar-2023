package org.example.entities;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Employee.class)
public abstract class Employee_ {

	public static volatile SingularAttribute<Employee, String> lastName;
	public static volatile SingularAttribute<Employee, String> country;
	public static volatile SingularAttribute<Employee, String> extension;
	public static volatile SingularAttribute<Employee, String> address;
	public static volatile SingularAttribute<Employee, String> notes;
	public static volatile SingularAttribute<Employee, String> city;
	public static volatile SingularAttribute<Employee, String> photoPath;
	public static volatile SingularAttribute<Employee, String> postalCode;
	public static volatile SingularAttribute<Employee, String> homePhone;
	public static volatile SingularAttribute<Employee, byte[]> photo;
	public static volatile SingularAttribute<Employee, Employee> reportsTo;
	public static volatile SingularAttribute<Employee, String> title;
	public static volatile SingularAttribute<Employee, String> titleOfCourtesy;
	public static volatile SingularAttribute<Employee, Double> salary;
	public static volatile SingularAttribute<Employee, String> firstName;
	public static volatile SingularAttribute<Employee, Integer> id;
	public static volatile SingularAttribute<Employee, String> region;

	public static final String LAST_NAME = "lastName";
	public static final String COUNTRY = "country";
	public static final String EXTENSION = "extension";
	public static final String ADDRESS = "address";
	public static final String NOTES = "notes";
	public static final String CITY = "city";
	public static final String PHOTO_PATH = "photoPath";
	public static final String POSTAL_CODE = "postalCode";
	public static final String HOME_PHONE = "homePhone";
	public static final String PHOTO = "photo";
	public static final String REPORTS_TO = "reportsTo";
	public static final String TITLE = "title";
	public static final String TITLE_OF_COURTESY = "titleOfCourtesy";
	public static final String SALARY = "salary";
	public static final String FIRST_NAME = "firstName";
	public static final String ID = "id";
	public static final String REGION = "region";

}

