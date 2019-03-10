package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.net.URL;
import java.util.Set;

@NodeEntity
public class PortfolioBudget {

	@Id
	@GeneratedValue
	private Long id;

	private Set<Document> supportingDocumentation;
	private Set<URL> budgetLinks;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<Document> getSupportingDocumentation() {
		return supportingDocumentation;
	}

	public void setSupportingDocumentation(Set<Document> supportingDocumentation) {
		this.supportingDocumentation = supportingDocumentation;
	}

	public Set<URL> getBudgetLinks() {
		return budgetLinks;
	}

	public void setBudgetLinks(Set<URL> budgetLinks) {
		this.budgetLinks = budgetLinks;
	}

}
