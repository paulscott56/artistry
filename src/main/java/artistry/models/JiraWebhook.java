package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.Set;

@NodeEntity
public class JiraWebhook {

    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String url;
    private Set<String> events;
    private JiraFilter filters;
    private boolean excludeBody;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Set<String> getEvents() {
        return events;
    }

    public void setEvents(Set<String> events) {
        this.events = events;
    }

    public JiraFilter getFilters() {
        return filters;
    }

    public void setFilters(JiraFilter filters) {
        this.filters = filters;
    }

    public boolean isExcludeBody() {
        return excludeBody;
    }

    public void setExcludeBody(boolean excludeBody) {
        this.excludeBody = excludeBody;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
