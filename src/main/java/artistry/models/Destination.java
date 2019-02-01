package artistry.models;

import java.util.List;

import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class Destination extends AbstractAuditableBaseEntity {

	private String url;

	private List<WebHookMessage> messages;

	private boolean online;

	protected Destination() {
	}

	public Destination(String url) {
		super();
		this.url = url;
		this.online = true;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public List<WebHookMessage> getMessages() {
		return messages;
	}

	public void setMessages(List<WebHookMessage> messages) {
		this.messages = messages;
	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

}
