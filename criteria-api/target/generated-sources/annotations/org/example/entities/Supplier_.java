package org.example.entities;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Supplier.class)
public abstract class Supplier_ {

	public static volatile SingularAttribute<Supplier, String> country;
	public static volatile SingularAttribute<Supplier, String> contactTitle;
	public static volatile SingularAttribute<Supplier, String> address;
	public static volatile SingularAttribute<Supplier, String> city;
	public static volatile SingularAttribute<Supplier, String> phone;
	public static volatile SingularAttribute<Supplier, String> contactName;
	public static volatile SingularAttribute<Supplier, String> companyName;
	public static volatile SingularAttribute<Supplier, String> postalCode;
	public static volatile SingularAttribute<Supplier, Integer> id;
	public static volatile SingularAttribute<Supplier, String> region;
	public static volatile SingularAttribute<Supplier, String> fax;
	public static volatile SingularAttribute<Supplier, String> homePage;

	public static final String COUNTRY = "country";
	public static final String CONTACT_TITLE = "contactTitle";
	public static final String ADDRESS = "address";
	public static final String CITY = "city";
	public static final String PHONE = "phone";
	public static final String CONTACT_NAME = "contactName";
	public static final String COMPANY_NAME = "companyName";
	public static final String POSTAL_CODE = "postalCode";
	public static final String ID = "id";
	public static final String REGION = "region";
	public static final String FAX = "fax";
	public static final String HOME_PAGE = "homePage";

}

