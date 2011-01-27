package fi.game.data.db;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;

import fi.game.data.schemas.Texture;

public class DBService {

	private static final Log LOG = LogFactory.getLog(DBService.class);

	final Session session;
	
	public DBService() {
		this.session = initHibernate();
	}
	
	@SuppressWarnings("unchecked")
    public void list() {
        Query q = session.createQuery("from " + Texture.class.getName());
		List<Texture> list = q.list();
        LOG.info("Query came back with " + list.size() + " results");
        for (Object row : list) {
            LOG.debug(row.toString());
        }
    }
	
	private Session initHibernate() {
		
        final Configuration configuration = 
        	new Configuration(). configure("hibernate-derby.config.xml");
        LOG.info("Connecting hibernate to URL=" + configuration.getProperty("hibernate.connection.url")
                 + " as user=" + configuration.getProperty("hibernate.connection.username"));
        return configuration.buildSessionFactory().getCurrentSession();
	}
}
