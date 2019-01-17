package artistry.models.train;

import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import artistry.models.person.Person;

@NodeEntity
public class Enterprise {

	@Id
	@GeneratedValue
	private Long id;
	
	private String enterpriseName;
	
	@Relationship(type = "KEY_PERSON", direction = Relationship.OUTGOING)
	private Set<Person> keyPersonnel;
	
	@Relationship(type = "HAS_KPI", direction = Relationship.OUTGOING)
	private Set<KPI> kpis;
	
	private PortfolioBudget portfolioBudget;
	
	@Relationship(type = "HAS_STRATEGIC_THEME", direction = Relationship.OUTGOING)
	private Set<StrategicTheme> strategicThemes;
	
	@Relationship(type = "HAS_QUALITATIVE_DATA", direction = Relationship.OUTGOING)
	private Set<Document> qualitativeData;
	private GuardRails guardRails;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getEnterpriseName() {
		return enterpriseName;
	}
	public void setEnterpriseName(String enterpriseName) {
		this.enterpriseName = enterpriseName;
	}
	public Set<Person> getKeyPersonnel() {
		return keyPersonnel;
	}
	public void setKeyPersonnel(Set<Person> keyPersonnel) {
		this.keyPersonnel = keyPersonnel;
	}
	public Set<KPI> getKpis() {
		return kpis;
	}
	public void setKpis(Set<KPI> kpis) {
		this.kpis = kpis;
	}
	public PortfolioBudget getPortfolioBudget() {
		return portfolioBudget;
	}
	public void setPortfolioBudget(PortfolioBudget portfolioBudget) {
		this.portfolioBudget = portfolioBudget;
	}
	public Set<StrategicTheme> getStrategicThemes() {
		return strategicThemes;
	}
	public void setStrategicThemes(Set<StrategicTheme> strategicThemes) {
		this.strategicThemes = strategicThemes;
	}
	public Set<Document> getQualitativeData() {
		return qualitativeData;
	}
	public void setQualitativeData(Set<Document> qualitativeData) {
		this.qualitativeData = qualitativeData;
	}
	public GuardRails getGuardRails() {
		return guardRails;
	}
	public void setGuardRails(GuardRails guardRails) {
		this.guardRails = guardRails;
	}
	
	
}
