package com.prabhu.business;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

import com.prabhu.data.api.TodoService;
import com.prabhu.data.api.TodoServiceStub;

public class TodoBusinessImplStubTest {

	@Test
	public void testRetrieveTodosRelatedToSpring_usingAStub() {
		TodoService todoService = new TodoServiceStub();
		
		TodoBusinessImpl todoBusinessImpl = new TodoBusinessImpl(todoService);
		List<String> todos = todoBusinessImpl.retrieveTodosRelatedToSpring("user");
		
		assertEquals(1, todos.size());
	}
}
