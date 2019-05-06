package service;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class StoreService implements IStoreService {

	private AtomicInteger seq = new AtomicInteger();
	Map<String, String> objMap = new HashMap<String, String>();
	public String storeString(String storeString) {
		Map<String, String> objMap = new HashMap<String, String>();
		int nextVal = seq.incrementAndGet();
		objMap.put(Integer.toString(nextVal), storeString);
		System.out.println(nextVal);
		System.out.println(objMap);
		return objMap.toString();
	}
}
