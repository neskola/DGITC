package fi.game.data.db;

import static org.junit.Assert.*;

import org.junit.Test;

public class DBServiceTest {

	@Test
	public void testList() {
		DBService dbs = new DBService();
		assertNotNull(dbs);
		dbs.list();
	}

}
