package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class WebHookMessage extends AbstractAuditableBaseEntity {

	static final long MESSAGE_TIMEOUT = 24 * 60 * 60 * 1000;

	@Id
	@GeneratedValue
	private Long id;

	private String messageBody;

	private String contentType;

	private Long timestamp;

	private Destination destination;

	protected WebHookMessage() {
	}

	public WebHookMessage(String messageBody, String contentType, Destination destination) {
		super();
		this.messageBody = messageBody;
		this.contentType = contentType;
		// this.timestamp = LocalDateTime.now().toEpochSecond(null); // new
		// Timestamp(System.currentTimeMillis());
		this.destination = destination;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessageBody() {
		return messageBody;
	}

	public String getContentType() {
		return contentType;
	}

	public Long getTimestamp() {
		return timestamp;
	}

	public Destination getDestination() {
		return destination;
	}

	public String getDestinationUrl() {
		return destination.getUrl();
	}

	public Boolean isMessageTimeout() {
		return timestamp < System.currentTimeMillis() - MESSAGE_TIMEOUT;
	}

}