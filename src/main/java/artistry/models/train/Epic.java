package artistry.models.train;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

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
	
	private List<Person> customers;
	private String hypothesisStatement;
	private EpicType epicType;
	
	// now to define the actual business case
	private String epicName;
	private Date funnelEntryDate;
	private Person epicOwner;
	
	private String epicDescription;
	private Document businessOutcomeHypothesis;
	private Document leadingIndicators;
	
	private List<Requirement> inScope;
	private List<Requirement> outOfScope;
	private List<NonFunctionalRequirement> nonFunctionalRequirements;
	
	private List<Feature> mvpFeatures;
	private List<Feature> additionalPotentialFeatures;
	
	private List<Person> sponsors;
	private List<String> usersAndMarketsAffecred;
	
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
	private List<Document> attachments;
	private Document notesAndComments;

	public List<Person> getCustomers() {
		return customers;
	}
	public void setCustomers(List<Person> customers) {
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
	public List<Requirement> getInScope() {
		return inScope;
	}
	public void setInScope(List<Requirement> inScope) {
		this.inScope = inScope;
	}
	public List<Requirement> getOutOfScope() {
		return outOfScope;
	}
	public void setOutOfScope(List<Requirement> outOfScope) {
		this.outOfScope = outOfScope;
	}
	public List<NonFunctionalRequirement> getNonFunctionalRequirements() {
		return nonFunctionalRequirements;
	}
	public void setNonFunctionalRequirements(List<NonFunctionalRequirement> nonFunctionalRequirements) {
		this.nonFunctionalRequirements = nonFunctionalRequirements;
	}
	public List<Feature> getMvpFeatures() {
		return mvpFeatures;
	}
	public void setMvpFeatures(List<Feature> mvpFeatures) {
		this.mvpFeatures = mvpFeatures;
	}
	public List<Feature> getAdditionalPotentialFeatures() {
		return additionalPotentialFeatures;
	}
	public void setAdditionalPotentialFeatures(List<Feature> additionalPotentialFeatures) {
		this.additionalPotentialFeatures = additionalPotentialFeatures;
	}
	public List<Person> getSponsors() {
		return sponsors;
	}
	public void setSponsors(List<Person> sponsors) {
		this.sponsors = sponsors;
	}
	public List<String> getUsersAndMarketsAffecred() {
		return usersAndMarketsAffecred;
	}
	public void setUsersAndMarketsAffecred(List<String> usersAndMarketsAffecred) {
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
	public List<Document> getAttachments() {
		return attachments;
	}
	public void setAttachments(List<Document> attachments) {
		this.attachments = attachments;
	}
	public Document getNotesAndComments() {
		return notesAndComments;
	}
	public void setNotesAndComments(Document notesAndComments) {
		this.notesAndComments = notesAndComments;
	}
}
