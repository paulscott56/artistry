package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Date;
import java.util.Set;

@NodeEntity
public class ProgramIncrement {

    @Id
    @GeneratedValue
    private Long id;

	private Date startDate;
	private Date endDate;
	private Set<ImplementationTeam> teams;
	private Set<Objective> objectives;
	private InspectAndAdapt inspectAndAdapt;
	private SystemDemo demo;
	private boolean complete;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public Set<ImplementationTeam> getTeams() {
        return teams;
    }

    public void setTeams(Set<ImplementationTeam> teams) {
        this.teams = teams;
    }

    public Set<Objective> getObjectives() {
        return objectives;
    }

    public void setObjectives(Set<Objective> objectives) {
        this.objectives = objectives;
    }

    public InspectAndAdapt getInspectAndAdapt() {
        return inspectAndAdapt;
    }

    public void setInspectAndAdapt(InspectAndAdapt inspectAndAdapt) {
        this.inspectAndAdapt = inspectAndAdapt;
    }

    public SystemDemo getDemo() {
        return demo;
    }

    public void setDemo(SystemDemo demo) {
        this.demo = demo;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}
