package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Set;

@NodeEntity("Program")
public class Program {

    @Id
    @GeneratedValue
    private Long id;

    @Relationship(type = "HAS_BUSINESS_OWNER", direction = Relationship.OUTGOING)
    private Set<Person> businessOwners;

    @Relationship(type = "HAS_KEY_CUSTOMER", direction = Relationship.OUTGOING)
    private Set<Person> keyCustomers;

    @Relationship(type = "HAS_SUCCESS_MEASURE", direction = Relationship.OUTGOING)
    private Set<String> successMeasures;

    private Set<PrincipalRole> principalRoles;

    @Relationship(type = "HAS_OTHER_STAKEHOLDER", direction = Relationship.OUTGOING)
    private Set<Person> otherStakeholders;

    @Relationship(type = "HAS_VALUESTREAM", direction = Relationship.OUTGOING)
    private ValueStream valueStream;

    @Relationship(type = "HAS_PRODUCT_TEAM", direction = Relationship.OUTGOING)
    private Set<Person> productManagement;

    @Relationship(type = "HAS_STE", direction = Relationship.OUTGOING)
    private Person SystemArchitect;

    @Relationship(type = "HAS_RTE", direction = Relationship.OUTGOING)
    private Person releaseTrainEngineer;

    private Set<SystemDemo> systemDemos;
    private Set<InspectAndAdapt> inspectAndAdaptWorkshops;
    private Set<Epic> programEpics;
    private ProgramBacklog programBacklog;
    private ProgramKanban programKanban;
    private Set<Document> architecturalRunway;
    private String programName;

    @Relationship(type = "HAS_TRAIN", direction = Relationship.OUTGOING)
    private Train train;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Set<Person> getBusinessOwners() {
        return businessOwners;
    }

    public void setBusinessOwners(Set<Person> businessOwners) {
        this.businessOwners = businessOwners;
    }

    public Set<Person> getKeyCustomers() {
        return keyCustomers;
    }

    public void setKeyCustomers(Set<Person> keyCustomers) {
        this.keyCustomers = keyCustomers;
    }

    public Set<String> getSuccessMeasures() {
        return successMeasures;
    }

    public void setSuccessMeasures(Set<String> successMeasures) {
        this.successMeasures = successMeasures;
    }

    public Set<PrincipalRole> getPrincipalRoles() {
        return principalRoles;
    }

    public void setPrincipalRoles(Set<PrincipalRole> principalRoles) {
        this.principalRoles = principalRoles;
    }

    public Set<Person> getOtherStakeholders() {
        return otherStakeholders;
    }

    public void setOtherStakeholders(Set<Person> otherStakeholders) {
        this.otherStakeholders = otherStakeholders;
    }

    public ValueStream getValueStream() {
        return valueStream;
    }

    public void setValueStream(ValueStream valueStream) {
        this.valueStream = valueStream;
    }

    public Set<Person> getProductManagement() {
        return productManagement;
    }

    public void setProductManagement(Set<Person> productManagement) {
        this.productManagement = productManagement;
    }

    public Person getSystemArchitect() {
        return SystemArchitect;
    }

    public void setSystemArchitect(Person systemArchitect) {
        SystemArchitect = systemArchitect;
    }

    public Person getReleaseTrainEngineer() {
        return releaseTrainEngineer;
    }

    public void setReleaseTrainEngineer(Person releaseTrainEngineer) {
        this.releaseTrainEngineer = releaseTrainEngineer;
    }

    public Set<SystemDemo> getSystemDemos() {
        return systemDemos;
    }

    public void setSystemDemos(Set<SystemDemo> systemDemos) {
        this.systemDemos = systemDemos;
    }

    public Set<InspectAndAdapt> getInspectAndAdaptWorkshops() {
        return inspectAndAdaptWorkshops;
    }

    public void setInspectAndAdaptWorkshops(Set<InspectAndAdapt> inspectAndAdaptWorkshops) {
        this.inspectAndAdaptWorkshops = inspectAndAdaptWorkshops;
    }

    public Set<Epic> getProgramEpics() {
        return programEpics;
    }

    public void setProgramEpics(Set<Epic> programEpics) {
        this.programEpics = programEpics;
    }

    public ProgramBacklog getProgramBacklog() {
        return programBacklog;
    }

    public void setProgramBacklog(ProgramBacklog programBacklog) {
        this.programBacklog = programBacklog;
    }

    public ProgramKanban getProgramKanban() {
        return programKanban;
    }

    public void setProgramKanban(ProgramKanban programKanban) {
        this.programKanban = programKanban;
    }

    public Set<Document> getArchitecturalRunway() {
        return architecturalRunway;
    }

    public void setArchitecturalRunway(Set<Document> architecturalRunway) {
        this.architecturalRunway = architecturalRunway;
    }

    public String getProgramName() {
        return programName;
    }

    public void setProgramName(String programName) {
        this.programName = programName;
    }

    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
}