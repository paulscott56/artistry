package artistry.models.train;

import java.util.List;

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
	private List<Person> keyPersonnel;
	
	@Relationship(type = "HAS_KPI", direction = Relationship.OUTGOING)
	private List<KPI> kpis;
	
	private PortfolioBudget portfolioBudget;
	
	@Relationship(type = "HAS_STRATEGIC_THEME", direction = Relationship.OUTGOING)
	private List<StrategicTheme> strategicThemes;
	
	@Relationship(type = "HAS_QUALITATIVE_DATA", direction = Relationship.OUTGOING)
	private List<Document> qualitativeData;
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
	public List<Person> getKeyPersonnel() {
		return keyPersonnel;
	}
	public void setKeyPersonnel(List<Person> keyPersonnel) {
		this.keyPersonnel = keyPersonnel;
	}
	public List<KPI> getKpis() {
		return kpis;
	}
	public void setKpis(List<KPI> kpis) {
		this.kpis = kpis;
	}
	public PortfolioBudget getPortfolioBudget() {
		return portfolioBudget;
	}
	public void setPortfolioBudget(PortfolioBudget portfolioBudget) {
		this.portfolioBudget = portfolioBudget;
	}
	public List<StrategicTheme> getStrategicThemes() {
		return strategicThemes;
	}
	public void setStrategicThemes(List<StrategicTheme> strategicThemes) {
		this.strategicThemes = strategicThemes;
	}
	public List<Document> getQualitativeData() {
		return qualitativeData;
	}
	public void setQualitativeData(List<Document> qualitativeData) {
		this.qualitativeData = qualitativeData;
	}
	public GuardRails getGuardRails() {
		return guardRails;
	}
	public void setGuardRails(GuardRails guardRails) {
		this.guardRails = guardRails;
	}
	
	
}
