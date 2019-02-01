package artistry.models;

import java.util.Set;

public class JiraWebhook {

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

}
