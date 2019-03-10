package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Date;
import java.util.Set;

@NodeEntity
public class Feature {

	@Id
	@GeneratedValue
	private Long id;

	private String featureName;
	private String benefitStatement;
	private Document Scope;
	private Document featureDescription;
	private Date lastModificationDate;
	private Date creationDate;
	private Date completionDate;

	@Relationship(type = "HAS_ACCEPTANCE_CRITERIA", direction = Relationship.OUTGOING)
	private Set<Document> acceptanceCriteria;

	private Document definitionOfDone;

	@Relationship(type = "HAS_NFR", direction = Relationship.OUTGOING)
	private Set<NonFunctionalRequirement> nonFunctionalRequirements;

	private Document assumptions;
	private Integer businessValue;
	private boolean complete;

	@Relationship(type = "HAS_ASSIGNED_TEAM", direction = Relationship.OUTGOING)
	private Set<ImplementationTeam> implementationTeams;

	private WeightedShortestJobFirst wsjf;
	private Set<Document> dependenciesAndStakeholders;

	@Relationship(type = "HAS_DEPENDENCY", direction = Relationship.OUTGOING)
	private Set<Feature> dependencies;

	@Relationship(type = "HAS_STAKEHOLDER", direction = Relationship.OUTGOING)
	private Set<Person> stakeHolders;

	@Relationship(type = "HAS_TEST_PLAN", direction = Relationship.OUTGOING)
	private Set<TestPlan> testPlans;

	@Relationship(type = "HAS_FEATURE_OWNER_TEAM", direction = Relationship.OUTGOING)
	private ImplementationTeam featureOwnerTeam;

	@Relationship(type = "HAS_FEATURE_OWNER", direction = Relationship.OUTGOING)
	private Person featureOwner;
	private Set<String> additionalNotes;

	@Relationship(type = "CREATED_BY", direction = Relationship.OUTGOING)
	private Person createdBy;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFeatureName() {
		return featureName;
	}

	public void setFeatureName(String featureName) {
		this.featureName = featureName;
	}

	public String getBenefitStatement() {
		return benefitStatement;
	}

	public void setBenefitStatement(String benefitStatement) {
		this.benefitStatement = benefitStatement;
	}

	public Document getScope() {
		return Scope;
	}

	public void setScope(Document scope) {
		Scope = scope;
	}

	public Document getFeatureDescription() {
		return featureDescription;
	}

	public void setFeatureDescription(Document featureDescription) {
		this.featureDescription = featureDescription;
	}

	public Date getLastModificationDate() {
		return lastModificationDate;
	}

	public void setLastModificationDate(Date lastModificationDate) {
		this.lastModificationDate = lastModificationDate;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getCompletionDate() {
		return completionDate;
	}

	public void setCompletionDate(Date completionDate) {
		this.completionDate = completionDate;
	}

	public Set<Document> getAcceptanceCriteria() {
		return acceptanceCriteria;
	}

	public void setAcceptanceCriteria(Set<Document> acceptanceCriteria) {
		this.acceptanceCriteria = acceptanceCriteria;
	}

	public Document getDefinitionOfDone() {
		return definitionOfDone;
	}

	public void setDefinitionOfDone(Document definitionOfDone) {
		this.definitionOfDone = definitionOfDone;
	}

	public Set<NonFunctionalRequirement> getNonFunctionalRequirements() {
		return nonFunctionalRequirements;
	}

	public void setNonFunctionalRequirements(Set<NonFunctionalRequirement> nonFunctionalRequirements) {
		this.nonFunctionalRequirements = nonFunctionalRequirements;
	}

	public Document getAssumptions() {
		return assumptions;
	}

	public void setAssumptions(Document assumptions) {
		this.assumptions = assumptions;
	}

	public Integer getBusinessValue() {
		return businessValue;
	}

	public void setBusinessValue(Integer businessValue) {
		this.businessValue = businessValue;
	}

	public boolean isComplete() {
		return complete;
	}

	public void setComplete(boolean complete) {
		this.complete = complete;
	}

	public Set<ImplementationTeam> getImplementationTeams() {
		return implementationTeams;
	}

	public void setImplementationTeams(Set<ImplementationTeam> implementationTeams) {
		this.implementationTeams = implementationTeams;
	}

	public WeightedShortestJobFirst getWsjf() {
		return wsjf;
	}

	public void setWsjf(WeightedShortestJobFirst wsjf) {
		this.wsjf = wsjf;
	}

	public Set<Document> getDependenciesAndStakeholders() {
		return dependenciesAndStakeholders;
	}

	public void setDependenciesAndStakeholders(Set<Document> dependenciesAndStakeholders) {
		this.dependenciesAndStakeholders = dependenciesAndStakeholders;
	}

	public Set<Feature> getDependencies() {
		return dependencies;
	}

	public void setDependencies(Set<Feature> dependencies) {
		this.dependencies = dependencies;
	}

	public Set<Person> getStakeHolders() {
		return stakeHolders;
	}

	public void setStakeHolders(Set<Person> stakeHolders) {
		this.stakeHolders = stakeHolders;
	}

	public Set<TestPlan> getTestPlans() {
		return testPlans;
	}

	public void setTestPlans(Set<TestPlan> testPlans) {
		this.testPlans = testPlans;
	}

	public ImplementationTeam getFeatureOwnerTeam() {
		return featureOwnerTeam;
	}

	public void setFeatureOwnerTeam(ImplementationTeam featureOwnerTeam) {
		this.featureOwnerTeam = featureOwnerTeam;
	}

	public Person getFeatureOwner() {
		return featureOwner;
	}

	public void setFeatureOwner(Person featureOwner) {
		this.featureOwner = featureOwner;
	}

	public Set<String> getAdditionalNotes() {
		return additionalNotes;
	}

	public void setAdditionalNotes(Set<String> additionalNotes) {
		this.additionalNotes = additionalNotes;
	}

	public Person getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Person createdBy) {
		this.createdBy = createdBy;
	}

}
