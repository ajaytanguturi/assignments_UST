package com;
import static org.junit.Assert.*;
import org.junit.Test;
public class FileServiceTest {
	FileService service = new FileService();
	@Test
	public void testIsCsvFile() {
		 boolean result = service.isCsvFile("data.csv");
		 assertTrue(result);
	}
}