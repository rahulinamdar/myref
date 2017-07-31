package com.mantravat.myref.jpa.model;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2017-07-25T00:46:25.987+0530")
@StaticMetamodel(EntityAudit.class)
public class EntityAudit_ extends BaseEntity_ {
	public static volatile SingularAttribute<EntityAudit, Date> creationTime;
	public static volatile SingularAttribute<EntityAudit, Date> modifiedTime;
	public static volatile SingularAttribute<EntityAudit, String> createdBy;
	public static volatile SingularAttribute<EntityAudit, String> modifiedBy;
}
