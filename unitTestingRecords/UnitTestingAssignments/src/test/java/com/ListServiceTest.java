package com;
import static org.junit.Assert.*;
import org.junit.Test;
public class ListServiceTest {
	@Test
	public void testGetListSize() {
		 ListService service = new ListService();
		 int result = service.getListSize();
		 assertEquals(3, result);
	}
}