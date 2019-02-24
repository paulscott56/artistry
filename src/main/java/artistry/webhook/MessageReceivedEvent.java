package artistry.webhook;

import artistry.models.WebHookMessage;
import org.springframework.context.ApplicationEvent;

public class MessageReceivedEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	private final WebHookMessage webHookMessage;

	public MessageReceivedEvent(Object source, WebHookMessage message) {
		super(source);
		this.webHookMessage = message;
	}

	public WebHookMessage getWebHookMessage() {
		return webHookMessage;
	}

}