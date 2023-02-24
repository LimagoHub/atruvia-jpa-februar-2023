package org.example.entities;

import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Customer.class)
public abstract class Customer_ {

	public static volatile SingularAttribute<Customer, String> country;
	public static volatile SingularAttribute<Customer, String> contactTitle;
	public static volatile SingularAttribute<Customer, String> address;
	public static volatile SingularAttribute<Customer, String> city;
	public static volatile SingularAttribute<Customer, String> phone;
	public static volatile SingularAttribute<Customer, String> contactName;
	public static volatile SingularAttribute<Customer, String> companyName;
	public static volatile SingularAttribute<Customer, String> postalCode;
	public static volatile ListAttribute<Customer, Order> orders;
	public static volatile SingularAttribute<Customer, String> id;
	public static volatile SingularAttribute<Customer, String> region;
	public static volatile SingularAttribute<Customer, String> fax;

	public static final String COUNTRY = "country";
	public static final String CONTACT_TITLE = "contactTitle";
	public static final String ADDRESS = "address";
	public static final String CITY = "city";
	public static final String PHONE = "phone";
	public static final String CONTACT_NAME = "contactName";
	public static final String COMPANY_NAME = "companyName";
	public static final String POSTAL_CODE = "postalCode";
	public static final String ORDERS = "orders";
	public static final String ID = "id";
	public static final String REGION = "region";
	public static final String FAX = "fax";

}

