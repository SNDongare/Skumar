package reinsurance.qa.utils;

import java.io.IOException;
import java.util.Map;
import java.util.Map.Entry;

import org.testng.annotations.Test;

public class ReadExcekHashMap {
	
	@Test
	public void Test1() {
		
		try {
			Map<String, String> testData = ExcelUtility.getMapTestData();
			
			
			for(Entry<String, String> map:testData.entrySet()) {
				
				System.out.println("Key = " +map.getKey()+" , Value = " +map.getValue());
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
