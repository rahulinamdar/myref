/**
 * 
 */
package com.mantravat.myref.olingo.web;

import javax.persistence.EntityManagerFactory;

import org.apache.olingo.odata2.core.exception.ODataRuntimeException;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAContext;
import org.apache.olingo.odata2.jpa.processor.api.ODataJPAServiceFactory;
import org.apache.olingo.odata2.jpa.processor.api.exception.ODataJPARuntimeException;


/**
 * @author rahul
 *
 */
public class MyrefServiceFactory extends ODataJPAServiceFactory{
	
	/**
	 * The package that contains all the model classes.
	 */
	private static final String PERSISTENCE_UNIT_NAME = "myref";

	@Override
	public ODataJPAContext initializeODataJPAContext() throws ODataJPARuntimeException {
		// TODO Auto-generated method stub
		ODataJPAContext oDataJPAContext = this.getODataJPAContext();
		EntityManagerFactory emf;
		try {
			emf = JpaEntityManagerFactory.getEntityManagerFactory();
			oDataJPAContext.setEntityManagerFactory(emf);
			oDataJPAContext.setPersistenceUnitName(PERSISTENCE_UNIT_NAME);
//			oDataJPAContext.setEntityManagerFactory(JPAEntityManagerFactory.getEntityManagerFactory(PERSISTENCE_UNIT_NAME));
//			oDataJPAContext.setPersistenceUnitName(PERSISTENCE_UNIT_NAME);
			
//			oDataJPAContext.setJPAEdmExtension(new EspmProcessingExtension());
//			oDataJPAContext.setJPAEdmMappingModel("EspmEdmMapping.xml");
			return oDataJPAContext;
		} catch (Exception e) {
			throw new ODataRuntimeException(e);
		}
	}

}
