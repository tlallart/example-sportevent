package org.sportevent.example.entity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.metamodel.Attribute;
import javax.persistence.metamodel.EntityType;

import org.junit.Test;
import static org.junit.Assert.*;

public class SportIntegrationTest {
	
	private final String TABLE_NAME = "Sport";
	
	private final String ID_COLUMN = "id";
	
	private final String NAME_COLUMN = "name";
	
	public void setup() {
		
	}
	
	public void teardown() {
		
	}

	@Test
	public void testModelShouldContainTableSport() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("sportevent");
		EntityManager entityManager = factory.createEntityManager();
		boolean containSport = false;
		boolean sportHaveId = false;
		boolean sportHaveName = false;
		for(EntityType<?> entityType : entityManager.getMetamodel().getEntities()) {
			if (TABLE_NAME.equals(entityType.getName())) {
				containSport = true;
				for(Attribute<? , ?> attr : entityType.getAttributes()) {
					if (ID_COLUMN.equals(attr.getName())) {
						sportHaveId = true;
					}
					if (NAME_COLUMN.equals(attr.getName())) {
						sportHaveName = true;
					}
				}
				break;
			}
		}
		assertTrue(containSport);
		assertTrue(sportHaveId);
		assertTrue(sportHaveName);
	}
	
}
