package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import java.util.List;

@NodeEntity
public class Destination {

	@Id
	@GeneratedValue
	private Long id;

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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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
