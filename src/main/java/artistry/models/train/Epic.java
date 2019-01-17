package artistry.models.train;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

import org.neo4j.ogm.annotation.NodeEntity;

import artistry.enums.EpicType;
import artistry.models.person.Person;

/**
 * Define an epic
 * 
 * @author paul
 * @see https://www.scaledagileframework.com/epic/
 */
@NodeEntity
public class Epic {
	
	private Set<Person> customers;
	private String hypothesisStatement;
	private EpicType epicType;
	
	// now to define the actual business case
	private String epicName;
	private Date funnelEntryDate;
	private Person epicOwner;
	
	private String epicDescription;
	private Document businessOutcomeHypothesis;
	private Document leadingIndicators;
	
	private Set<Requirement> inScope;
	private Set<Requirement> outOfScope;
	private Set<NonFunctionalRequirement> nonFunctionalRequirements;
	
	private Set<Feature> mvpFeatures;
	private Set<Feature> additionalPotentialFeatures;
	
	private Set<Person> sponsors;
	private Set<String> usersAndMarketsAffecred;
	
	private Document impactOnProductsAndServices;
	private Document impactOnSalesDeployment;
	private Document analysisSummary;
	private boolean goNoGo;
	private int estimatedStoryPoints;
	private BigDecimal estimatedMonetaryCost;
	private Document typeOfReturn;
	private Document anticipatedBusinessImpact;
	private Document inhouseOrExternalDev;
	private DevelopmentTimeLine estimatedTimeline;
	private EpicType incrementalImplementationStrategy;
	private Document sequencingAndDependencies;
	private Document milestones;
	private Set<Document> attachments;
	private Document notesAndComments;
	public Set<Person> getCustomers() {
		return customers;
	}
	public void setCustomers(Set<Person> customers) {
		this.customers = customers;
	}
	public String getHypothesisStatement() {
		return hypothesisStatement;
	}
	public void setHypothesisStatement(String hypothesisStatement) {
		this.hypothesisStatement = hypothesisStatement;
	}
	public EpicType getEpicType() {
		return epicType;
	}
	public void setEpicType(EpicType epicType) {
		this.epicType = epicType;
	}
	public String getEpicName() {
		return epicName;
	}
	public void setEpicName(String epicName) {
		this.epicName = epicName;
	}
	public Date getFunnelEntryDate() {
		return funnelEntryDate;
	}
	public void setFunnelEntryDate(Date funnelEntryDate) {
		this.funnelEntryDate = funnelEntryDate;
	}
	public Person getEpicOwner() {
		return epicOwner;
	}
	public void setEpicOwner(Person epicOwner) {
		this.epicOwner = epicOwner;
	}
	public String getEpicDescription() {
		return epicDescription;
	}
	public void setEpicDescription(String epicDescription) {
		this.epicDescription = epicDescription;
	}
	public Document getBusinessOutcomeHypothesis() {
		return businessOutcomeHypothesis;
	}
	public void setBusinessOutcomeHypothesis(Document businessOutcomeHypothesis) {
		this.businessOutcomeHypothesis = businessOutcomeHypothesis;
	}
	public Document getLeadingIndicators() {
		return leadingIndicators;
	}
	public void setLeadingIndicators(Document leadingIndicators) {
		this.leadingIndicators = leadingIndicators;
	}
	public Set<Requirement> getInScope() {
		return inScope;
	}
	public void setInScope(Set<Requirement> inScope) {
		this.inScope = inScope;
	}
	public Set<Requirement> getOutOfScope() {
		return outOfScope;
	}
	public void setOutOfScope(Set<Requirement> outOfScope) {
		this.outOfScope = outOfScope;
	}
	public Set<NonFunctionalRequirement> getNonFunctionalRequirements() {
		return nonFunctionalRequirements;
	}
	public void setNonFunctionalRequirements(Set<NonFunctionalRequirement> nonFunctionalRequirements) {
		this.nonFunctionalRequirements = nonFunctionalRequirements;
	}
	public Set<Feature> getMvpFeatures() {
		return mvpFeatures;
	}
	public void setMvpFeatures(Set<Feature> mvpFeatures) {
		this.mvpFeatures = mvpFeatures;
	}
	public Set<Feature> getAdditionalPotentialFeatures() {
		return additionalPotentialFeatures;
	}
	public void setAdditionalPotentialFeatures(Set<Feature> additionalPotentialFeatures) {
		this.additionalPotentialFeatures = additionalPotentialFeatures;
	}
	public Set<Person> getSponsors() {
		return sponsors;
	}
	public void setSponsors(Set<Person> sponsors) {
		this.sponsors = sponsors;
	}
	public Set<String> getUsersAndMarketsAffecred() {
		return usersAndMarketsAffecred;
	}
	public void setUsersAndMarketsAffecred(Set<String> usersAndMarketsAffecred) {
		this.usersAndMarketsAffecred = usersAndMarketsAffecred;
	}
	public Document getImpactOnProductsAndServices() {
		return impactOnProductsAndServices;
	}
	public void setImpactOnProductsAndServices(Document impactOnProductsAndServices) {
		this.impactOnProductsAndServices = impactOnProductsAndServices;
	}
	public Document getImpactOnSalesDeployment() {
		return impactOnSalesDeployment;
	}
	public void setImpactOnSalesDeployment(Document impactOnSalesDeployment) {
		this.impactOnSalesDeployment = impactOnSalesDeployment;
	}
	public Document getAnalysisSummary() {
		return analysisSummary;
	}
	public void setAnalysisSummary(Document analysisSummary) {
		this.analysisSummary = analysisSummary;
	}
	public boolean isGoNoGo() {
		return goNoGo;
	}
	public void setGoNoGo(boolean goNoGo) {
		this.goNoGo = goNoGo;
	}
	public int getEstimatedStoryPoints() {
		return estimatedStoryPoints;
	}
	public void setEstimatedStoryPoints(int estimatedStoryPoints) {
		this.estimatedStoryPoints = estimatedStoryPoints;
	}
	public BigDecimal getEstimatedMonetaryCost() {
		return estimatedMonetaryCost;
	}
	public void setEstimatedMonetaryCost(BigDecimal estimatedMonetaryCost) {
		this.estimatedMonetaryCost = estimatedMonetaryCost;
	}
	public Document getTypeOfReturn() {
		return typeOfReturn;
	}
	public void setTypeOfReturn(Document typeOfReturn) {
		this.typeOfReturn = typeOfReturn;
	}
	public Document getAnticipatedBusinessImpact() {
		return anticipatedBusinessImpact;
	}
	public void setAnticipatedBusinessImpact(Document anticipatedBusinessImpact) {
		this.anticipatedBusinessImpact = anticipatedBusinessImpact;
	}
	public Document getInhouseOrExternalDev() {
		return inhouseOrExternalDev;
	}
	public void setInhouseOrExternalDev(Document inhouseOrExternalDev) {
		this.inhouseOrExternalDev = inhouseOrExternalDev;
	}
	public DevelopmentTimeLine getEstimatedTimeline() {
		return estimatedTimeline;
	}
	public void setEstimatedTimeline(DevelopmentTimeLine estimatedTimeline) {
		this.estimatedTimeline = estimatedTimeline;
	}
	public EpicType getIncrementalImplementationStrategy() {
		return incrementalImplementationStrategy;
	}
	public void setIncrementalImplementationStrategy(EpicType incrementalImplementationStrategy) {
		this.incrementalImplementationStrategy = incrementalImplementationStrategy;
	}
	public Document getSequencingAndDependencies() {
		return sequencingAndDependencies;
	}
	public void setSequencingAndDependencies(Document sequencingAndDependencies) {
		this.sequencingAndDependencies = sequencingAndDependencies;
	}
	public Document getMilestones() {
		return milestones;
	}
	public void setMilestones(Document milestones) {
		this.milestones = milestones;
	}
	public Set<Document> getAttachments() {
		return attachments;
	}
	public void setAttachments(Set<Document> attachments) {
		this.attachments = attachments;
	}
	public Document getNotesAndComments() {
		return notesAndComments;
	}
	public void setNotesAndComments(Document notesAndComments) {
		this.notesAndComments = notesAndComments;
	}

	
}
