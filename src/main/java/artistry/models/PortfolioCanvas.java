package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

import java.util.Date;
import java.util.Set;

@NodeEntity
public class PortfolioCanvas {

    @Id
    @GeneratedValue
    private Long id;

	private String portfolioName;
	private Date date;
	private String version;

	@Relationship(type = "HAS_VALUE_STREAM", direction = Relationship.OUTGOING)
	private Set<ValueStream> valueStreams;

	private Set<Epic> businessEpics;
	private Set<Epic> enablerEpics;
	private Set<StrategicTheme> strategicThemes;
	private PortfolioBacklog portfolioBacklog;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPortfolioName() {
        return portfolioName;
    }

    public void setPortfolioName(String portfolioName) {
        this.portfolioName = portfolioName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public Set<ValueStream> getValueStreams() {
        return valueStreams;
    }

    public void setValueStreams(Set<ValueStream> valueStreams) {
        this.valueStreams = valueStreams;
    }

    public Set<Epic> getBusinessEpics() {
        return businessEpics;
    }

    public void setBusinessEpics(Set<Epic> businessEpics) {
        this.businessEpics = businessEpics;
    }

    public Set<Epic> getEnablerEpics() {
        return enablerEpics;
    }

    public void setEnablerEpics(Set<Epic> enablerEpics) {
        this.enablerEpics = enablerEpics;
    }

    public Set<StrategicTheme> getStrategicThemes() {
        return strategicThemes;
    }

    public void setStrategicThemes(Set<StrategicTheme> strategicThemes) {
        this.strategicThemes = strategicThemes;
    }

    public PortfolioBacklog getPortfolioBacklog() {
        return portfolioBacklog;
    }

    public void setPortfolioBacklog(PortfolioBacklog portfolioBacklog) {
        this.portfolioBacklog = portfolioBacklog;
    }
}
