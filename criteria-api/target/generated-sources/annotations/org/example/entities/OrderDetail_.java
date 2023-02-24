package org.example.entities;

import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(OrderDetail.class)
public abstract class OrderDetail_ {

	public static volatile SingularAttribute<OrderDetail, BigDecimal> unitPrice;
	public static volatile SingularAttribute<OrderDetail, Integer> quantity;
	public static volatile SingularAttribute<OrderDetail, Product> productID;
	public static volatile SingularAttribute<OrderDetail, Order> orderID;
	public static volatile SingularAttribute<OrderDetail, BigDecimal> discount;
	public static volatile SingularAttribute<OrderDetail, OrderDetailId> id;

	public static final String UNIT_PRICE = "unitPrice";
	public static final String QUANTITY = "quantity";
	public static final String PRODUCT_ID = "productID";
	public static final String ORDER_ID = "orderID";
	public static final String DISCOUNT = "discount";
	public static final String ID = "id";

}

