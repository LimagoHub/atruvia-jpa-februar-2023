package org.example.entities;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Category.class)
public abstract class Category_ {

	public static volatile SingularAttribute<Category, String> description;
	public static volatile SingularAttribute<Category, Integer> id;
	public static volatile SingularAttribute<Category, String> categoryName;
	public static volatile SingularAttribute<Category, byte[]> picture;

	public static final String DESCRIPTION = "description";
	public static final String ID = "id";
	public static final String CATEGORY_NAME = "categoryName";
	public static final String PICTURE = "picture";

}

