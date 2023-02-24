package org.example.entities;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrderDetailId.class)
public abstract class OrderDetailId_ {

	public static volatile SingularAttribute<OrderDetailId, Integer> productID;
	public static volatile SingularAttribute<OrderDetailId, Integer> orderID;

	public static final String PRODUCT_ID = "productID";
	public static final String ORDER_ID = "orderID";

}

