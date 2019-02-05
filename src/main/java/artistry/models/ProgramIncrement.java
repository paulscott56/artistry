package artistry.models;

import java.util.Date;
import java.util.Set;

public class ProgramIncrement extends AbstractAuditableBaseEntity {

	private Date startDate;
	private Date endDate;
	private Set<ImplementationTeam> teams;
	private Set<Objective> objectives;
	private InspectAndAdapt inspectAndAdapt;
	private SystemDemo demo;
	private boolean complete;

}
