package com.example.recipes.domain;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class CategoryTest {
	
	Category category;
	
	@Before
	public void setUp() {
		category = new Category();
	}

	@Test
	public void testGetId() {
		Long idValue = 41L;
		category.setId(idValue);
		
		assertEquals(idValue, category.getId());
	}

}
