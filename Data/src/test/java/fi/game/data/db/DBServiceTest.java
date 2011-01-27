package fi.game.data.db;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import fi.game.data.schemas.Entity;
import fi.game.data.schemas.Texture;

public class DBServiceTest {
	
	private DBService dbService;
	
	@Before
	public void init() {
		this.dbService = new DBService(); 
	}

	@Test
	public void testGetObjects() {
		List<?> textures = this.dbService.getObjects(Texture.class);
		assertNotNull(textures);
		assertEquals(9, textures.size());

		List<?> entities = this.dbService.getObjects(Entity.class);
		assertNotNull(entities);
		assertEquals(13, entities.size());

	}

	
}
