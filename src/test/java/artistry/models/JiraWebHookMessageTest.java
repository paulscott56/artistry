/** This class was generated by GenTest@Mobacar */
package artistry.models;

import java.util.*;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.lang3.SerializationUtils;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.runners.MockitoJUnitRunner;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.endsWith;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import utils.*;

@RunWith(MockitoJUnitRunner.class)
public class JiraWebHookMessageTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private JiraWebHookMessage underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetChangelog() throws Exception {
		// given
		Changelog value = new Changelog();
		underTest.setChangelog(value);
		// when
		Changelog actual = underTest.getChangelog();
		// then
		assertEquals(value, actual);
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
	public void testGetIssue() throws Exception {
		// given
		Issue value = new Issue();
		underTest.setIssue(value);
		// when
		Issue actual = underTest.getIssue();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetIssue_event_type_name() throws Exception {
		// given
		String value = "issue_event_type_name";
		underTest.setIssue_event_type_name(value);
		// when
		String actual = underTest.getIssue_event_type_name();
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
	public void testGetUser() throws Exception {
		// given
		User value = new User();
		underTest.setUser(value);
		// when
		User actual = underTest.getUser();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetWebhookEvent() throws Exception {
		// given
		String value = "webhookEvent";
		underTest.setWebhookEvent(value);
		// when
		String actual = underTest.getWebhookEvent();
		// then
		assertEquals(value, actual);
	}

}
