package artistry.models.train;

import java.util.Date;
import java.util.List;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import artistry.enums.DocumentStatus;
import artistry.enums.License;
import artistry.models.person.Person;

/**
 * Generic document (for things that could be strings, but want more structure
 * 
 * @author paul
 *
 */

@NodeEntity
public class Document {

	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	private Date creationDate;
	private String documentBody;
	private String version;
	private Person primaryAuthor;
	private List<Person> additionalAuthors;
	private DocumentStatus status;
	private List<Date> revisionDates;
	private License license;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Date getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}
	public String getDocumentBody() {
		return documentBody;
	}
	public void setDocumentBody(String documentBody) {
		this.documentBody = documentBody;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Person getPrimaryAuthor() {
		return primaryAuthor;
	}
	public void setPrimaryAuthor(Person primaryAuthor) {
		this.primaryAuthor = primaryAuthor;
	}
	public List<Person> getAdditionalAuthors() {
		return additionalAuthors;
	}
	public void setAdditionalAuthors(List<Person> additionalAuthors) {
		this.additionalAuthors = additionalAuthors;
	}
	public DocumentStatus getStatus() {
		return status;
	}
	public void setStatus(DocumentStatus status) {
		this.status = status;
	}
	public List<Date> getRevisionDates() {
		return revisionDates;
	}
	public void setRevisionDates(List<Date> revisionDates) {
		this.revisionDates = revisionDates;
	}
	public License getLicense() {
		return license;
	}
	public void setLicense(License license) {
		this.license = license;
	}
}
