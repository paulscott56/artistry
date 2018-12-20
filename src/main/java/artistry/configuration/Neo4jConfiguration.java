package artistry.configuration;

import org.neo4j.ogm.session.SessionFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.repository.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.transaction.Neo4jTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableNeo4jRepositories(basePackages = "artistry.repositories")
@EnableTransactionManagement
public class Neo4jConfiguration {

	@Value("${spring.data.neo4j.uri}")
	private String uri;

	@Value("${spring.data.neo4j.username}")
	private String dbuser;

	@Value("${spring.data.neo4j.password}")
	private String dbpass;

	@Bean
	public SessionFactory sessionFactory() {
		// with domain entity base package(s)
		return new SessionFactory(configuration(), "artistry.models");
	}

	@Bean
	public org.neo4j.ogm.config.Configuration configuration() {
		org.neo4j.ogm.config.Configuration configuration = new org.neo4j.ogm.config.Configuration.Builder()
				.uri("bolt://" + uri).credentials(dbuser, dbpass).build();
		return configuration;
	}

	@Bean
	public Neo4jTransactionManager transactionManager() {
		return new Neo4jTransactionManager(sessionFactory());
	}

}