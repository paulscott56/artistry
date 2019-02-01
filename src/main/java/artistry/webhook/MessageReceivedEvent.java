package artistry.webhook;

import org.springframework.context.ApplicationEvent;

public class MessageReceivedEvent extends ApplicationEvent {

	private static final long serialVersionUID = 1L;

	private WebHookMessage webHookMessage;

	public MessageReceivedEvent(Object source, WebHookMessage message) {
		super(source);
		this.webHookMessage = message;
	}

	public WebHookMessage getWebHookMessage() {
		return webHookMessage;
	}

}