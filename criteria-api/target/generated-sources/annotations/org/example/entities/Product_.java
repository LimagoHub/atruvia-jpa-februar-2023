package org.example.entities;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Product.class)
public abstract class Product_ {

	public static volatile SingularAttribute<Product, BigDecimal> unitPrice;
	public static volatile SingularAttribute<Product, Integer> unitsInStock;
	public static volatile SingularAttribute<Product, Integer> reorderLevel;
	public static volatile SingularAttribute<Product, Supplier> supplierID;
	public static volatile SingularAttribute<Product, Integer> id;
	public static volatile SingularAttribute<Product, String> quantityPerUnit;
	public static volatile SingularAttribute<Product, Boolean> discontinued;
	public static volatile SingularAttribute<Product, String> productName;
	public static volatile SingularAttribute<Product, Category> categoryID;
	public static volatile SingularAttribute<Product, Integer> unitsOnOrder;

	public static final String UNIT_PRICE = "unitPrice";
	public static final String UNITS_IN_STOCK = "unitsInStock";
	public static final String REORDER_LEVEL = "reorderLevel";
	public static final String SUPPLIER_ID = "supplierID";
	public static final String ID = "id";
	public static final String QUANTITY_PER_UNIT = "quantityPerUnit";
	public static final String DISCONTINUED = "discontinued";
	public static final String PRODUCT_NAME = "productName";
	public static final String CATEGORY_ID = "categoryID";
	public static final String UNITS_ON_ORDER = "unitsOnOrder";

}

