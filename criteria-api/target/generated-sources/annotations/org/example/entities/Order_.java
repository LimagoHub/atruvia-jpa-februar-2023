package org.example.entities;

import jakarta.persistence.metamodel.SetAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.math.BigDecimal;
import java.time.Instant;
import javax.annotation.processing.Generated;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Order.class)
public abstract class Order_ {

	public static volatile SingularAttribute<Order, String> shipCity;
	public static volatile SingularAttribute<Order, BigDecimal> freight;
	public static volatile SingularAttribute<Order, Instant> requiredDate;
	public static volatile SingularAttribute<Order, Employee> employeeID;
	public static volatile SingularAttribute<Order, String> shipName;
	public static volatile SingularAttribute<Order, String> shipPostalCode;
	public static volatile SingularAttribute<Order, String> shipCountry;
	public static volatile SingularAttribute<Order, String> shipAddress;
	public static volatile SetAttribute<Order, OrderDetail> orderDetails;
	public static volatile SingularAttribute<Order, Shipper> shipVia;
	public static volatile SingularAttribute<Order, Customer> customerID;
	public static volatile SingularAttribute<Order, Integer> id;
	public static volatile SingularAttribute<Order, Instant> orderDate;
	public static volatile SingularAttribute<Order, Instant> shippedDate;
	public static volatile SingularAttribute<Order, String> shipRegion;

	public static final String SHIP_CITY = "shipCity";
	public static final String FREIGHT = "freight";
	public static final String REQUIRED_DATE = "requiredDate";
	public static final String EMPLOYEE_ID = "employeeID";
	public static final String SHIP_NAME = "shipName";
	public static final String SHIP_POSTAL_CODE = "shipPostalCode";
	public static final String SHIP_COUNTRY = "shipCountry";
	public static final String SHIP_ADDRESS = "shipAddress";
	public static final String ORDER_DETAILS = "orderDetails";
	public static final String SHIP_VIA = "shipVia";
	public static final String CUSTOMER_ID = "customerID";
	public static final String ID = "id";
	public static final String ORDER_DATE = "orderDate";
	public static final String SHIPPED_DATE = "shippedDate";
	public static final String SHIP_REGION = "shipRegion";

}

