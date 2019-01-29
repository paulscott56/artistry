package artistry.models;

import java.util.Date;
import java.util.Set;

import org.neo4j.ogm.annotation.Relationship;

public class PortfolioCanvas extends AbstractAuditableBaseEntity {

	private String portfolioName;
	private Date date;
	private String version;

	@Relationship(type = "HAS_VALUE_STREAM", direction = Relationship.OUTGOING)
	private Set<ValueStream> valueStreams;

	private Set<Epic> businessEpics;
	private Set<Epic> enablerEpics;
	private Set<StrategicTheme> strategicThemes;
	private PortfolioBacklog portfolioBacklog;

}
