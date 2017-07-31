package com.mantravat.myref.jpa.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-07-25T00:46:26.003+0530")
@StaticMetamodel(Product.class)
public class Product_ extends EntityAudit_ {
	public static volatile SingularAttribute<Product, String> productId;
	public static volatile SingularAttribute<Product, String> productImage;
	public static volatile SingularAttribute<Product, String> productDescription;
	public static volatile ListAttribute<Product, ProductPrice> price;
}
