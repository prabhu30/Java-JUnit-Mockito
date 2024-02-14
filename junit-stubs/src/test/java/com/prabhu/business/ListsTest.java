package com.prabhu.business;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.Test;

public class ListsTest {

	@Test
	public void mockLists() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(2);
		assertEquals(2, mockList.size());
	}
	
	@Test
	public void mockLists_ReturnMultipleValues() {
		List mockList = mock(List.class);
		when(mockList.size()).thenReturn(2).thenReturn(5);
		
		assertEquals(2, mockList.size());
		assertEquals(5, mockList.size());
	}

	@Test
	public void mockLists_ReturnEmptyValues() {
		List mockList = mock(List.class);
		when(mockList.get(0)).thenReturn("prabhu");
		
		assertEquals(null, mockList.get(28));	// by default, mock returns null
	}
}
