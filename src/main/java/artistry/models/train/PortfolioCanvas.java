package artistry.models.train;

import java.util.Date;
import java.util.List;

import org.neo4j.ogm.annotation.Relationship;

public class PortfolioCanvas {
	
	private String portfolioName;
	private Date date;
	private String version;
	
	@Relationship(type = "HAS_VALUE_STREAM", direction = Relationship.OUTGOING)
	private List<ValueStream> valueStreams;
	
	private List<Epic> businessEpics;
	private List<Epic> enablerEpics;
	private List<StrategicTheme> strategicThemes;
	private PortfolioBacklog portfolioBacklog;
	
	
	
	

}
