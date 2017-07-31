package com.mantravat.myref.jpa.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-07-25T00:46:26.004+0530")
@StaticMetamodel(ProductPrice.class)
public class ProductPrice_ extends EntityAudit_ {
	public static volatile SingularAttribute<ProductPrice, Product> product;
	public static volatile SingularAttribute<ProductPrice, Date> pricingDate;
	public static volatile SingularAttribute<ProductPrice, Double> price;
}
