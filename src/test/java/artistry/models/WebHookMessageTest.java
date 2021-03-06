/** This class was generated by GenTest@Mobacar */
package artistry.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class WebHookMessageTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private WebHookMessage underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetContentType() throws Exception {
		// given
		String value = "contentType";
		underTest.setContentType(value);
		// when
		String actual = underTest.getContentType();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetDestination() throws Exception {
		// given
		Destination value = mock(Destination.class);
		underTest.setDestination(value);
		// when
		Destination actual = underTest.getDestination();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetDestinationUrl() throws Exception {
		// given
		// when
		String actual = underTest.getDestinationUrl();
		// then
		assertEquals("", actual);
	}

	@Test
	public void testGetId() throws Exception {
		// given
		Long value = 0L;
		underTest.setId(value);
		// when
		Long actual = underTest.getId();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetMessageBody() throws Exception {
		// given
		String value = "messageBody";
		underTest.setMessageBody(value);
		// when
		String actual = underTest.getMessageBody();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetRetryCount() throws Exception {
		// given
		int value = 0;
		underTest.setRetryCount(value);
		// when
		int actual = underTest.getRetryCount();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTimestamp() throws Exception {
		// given
		Long value = 0L;
		underTest.setTimestamp(value);
		// when
		Long actual = underTest.getTimestamp();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testIsMessageTimeout() throws Exception {
		// given
		// when
		Boolean actual = underTest.isMessageTimeout();
		// then
		assertNotNull(actual);
	}

	@Test
	public void testGetMessageTimeout() throws Exception {
		// given
		// when
		long actual = WebHookMessage.getMessageTimeout();
		// then
		assertEquals(0L, actual);
	}

}
