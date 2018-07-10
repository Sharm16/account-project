package test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.qa.account.Account;
import com.qa.account.Service;

public class test {

	@Test
	public void accountTest() {

		Service s = new Service();
		Account account = new Account("Sharm", "Sunthar", 109);

		s.add(109, account);

		assertEquals(account, s.getHmapAccount(109));

	}

	@Test
	public void removeTest() {

		Service s = new Service();
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
		Service s = new Service();
		Account account = new Account("Sharm", "Sunthar", 109);

		s.add(109, account);
		assertEquals(account, s.getHmapAccount(109));
		assertEquals(null, s.getHmapAccount(110));

		s.remove(109);
		assertEquals(null, s.getHmapAccount(109));
	}

}
