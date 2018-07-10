package test;

import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

import com.qa.account.Account;
import com.qa.account.Service;

public class test {

	Service s = new Service();

	@Test
	public void accountTest() {

		Account account = new Account("Sharm", "Sunthar", 109);

		s.add(109, account);

		assertEquals(account, s.getHmapAccount(109));

	}

	@Test
	public void removeTest() {

		Account account = new Account("Sharm", "Sunthar", 109);
		Account account2 = new Account("Sharm2", "Sunthar", 110);

		s.add(109, account);
		s.add(110, account2);

		assertEquals(account, s.getHmapAccount(109));
		assertEquals(account2, s.getHmapAccount(110));
		s.remove(109);
		assertEquals(1, s.getHmap().size());
		s.remove(110);
		assertEquals(true, s.getHmap().isEmpty());
	}

	@Test
	public void getHmapTest() {

		Account account = new Account("Sharm", "Sunthar", 109);

		s.add(109, account);
		assertEquals(account, s.getHmapAccount(109));
		assertEquals(null, s.getHmapAccount(110));

		s.remove(109);
		assertEquals(null, s.getHmapAccount(109));
	}

	@Test
	public void searchTest() {

		Account account = new Account("Sharm", "Sunthar", 109);
		Account account1 = new Account("Sharm", "Sunthar", 112);
		Account account2 = new Account("Sharm", "Sunthar", 111);
		Account account3 = new Account("Shar2", "Sunthar", 110);

		s.add(109, account1);
		s.add(110, account2);
		s.add(111, account3);
		s.add(112, account);

		assertEquals(3, s.search2("Sharm"));

	}

	// @Test
	// @Ignore
	// public void xmlTest() {
	// Account account = new Account("Sharm", "Sunthar", 109);
	// s.xml(account);
	// }

}
