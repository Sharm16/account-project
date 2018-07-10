package com.qa.account;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;
import java.io.File;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import org.json.JSONObject;

public class Service {

	private HashMap<Integer, Account> hmap = new HashMap<Integer, Account>();
	
	public void add(int accountNumber, Account a) {
		hmap.put(accountNumber, a);
		
	}

	public void remove(int accountNumber) {
		hmap.remove(accountNumber);

	}

	public Account getHmapAccount(int i) {
		return hmap.get(i);
	}

	public HashMap<Integer, Account> getHmap() {
		return hmap;
	}
	
	public JSONObject json(HashMap<Integer, Account> h) {
		
		return new JSONObject(h);
		
		
	}
	
	public int search(String name) {
		int count =0;
		for (Account a:hmap.values()) {
			if (a.getFirstName().equals(name)) {
				count+=1;
			}
		}
		return count;
	}
	public int search2(String name) {
		
		 return (int) hmap.entrySet()
		.stream()
		.filter(a->a.getValue().getFirstName().equals(name))
		.count();
		
	}
	
//	public void xml(Account account) {
//		try {
//            JAXBContext context = JAXBContext.newInstance(Account.class);
//            Marshaller m = context.createMarshaller();
//
//            m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
//
//       
//            m.marshal(account, new File("test"));
//        } catch (JAXBException e) {
//            e.printStackTrace();
//        }
//    }

}
