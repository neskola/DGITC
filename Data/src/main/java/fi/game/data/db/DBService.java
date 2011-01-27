package fi.game.data.db;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import fi.game.data.schemas.Texture;

public class DBService {

	private static final Log LOG = LogFactory.getLog(DBService.class);

	final Session session;

	public DBService() {
		this.session = initHibernate();
	}

	@SuppressWarnings("rawtypes")
	public List<?> getObjects(Class clazz) {
		Transaction tx = session.beginTransaction();
		try {
			Query q = session.createQuery("from " + clazz.getName());
			List<?> list = q.list();
			LOG.info("Query came back with " + list.size() + " results of " 
					+ clazz.getName());
			return list;
		} finally {
			tx = null;
		}
	}
	private Session initHibernate() {

		final Configuration configuration = new Configuration()
				.configure("hibernate-derby.config.xml");
		LOG.info("Connecting hibernate to URL="
				+ configuration.getProperty("hibernate.connection.url")
				+ " as user="
				+ configuration.getProperty("hibernate.connection.username"));
		return configuration.buildSessionFactory().getCurrentSession();
	}
}
