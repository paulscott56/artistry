/** This class was generated by GenTest@Mobacar */
package artistry.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
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
public class CreatorTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private Creator underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetActive() throws Exception {
		// given
		Boolean value = false;
		underTest.setActive(value);
		// when
		Boolean actual = underTest.getActive();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetAvatarUrls() throws Exception {
		// given
		AvatarUrls value = new AvatarUrls();
		underTest.setAvatarUrls(value);
		// when
		AvatarUrls actual = underTest.getAvatarUrls();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetDisplayName() throws Exception {
		// given
		String value = "displayName";
		underTest.setDisplayName(value);
		// when
		String actual = underTest.getDisplayName();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetEmailAddress() throws Exception {
		// given
		String value = "emailAddress";
		underTest.setEmailAddress(value);
		// when
		String actual = underTest.getEmailAddress();
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
	public void testGetKey() throws Exception {
		// given
		String value = "key";
		underTest.setKey(value);
		// when
		String actual = underTest.getKey();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetName() throws Exception {
		// given
		String value = "name";
		underTest.setName(value);
		// when
		String actual = underTest.getName();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetSelf() throws Exception {
		// given
		String value = "self";
		underTest.setSelf(value);
		// when
		String actual = underTest.getSelf();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTimeZone() throws Exception {
		// given
		String value = "timeZone";
		underTest.setTimeZone(value);
		// when
		String actual = underTest.getTimeZone();
		// then
		assertEquals(value, actual);
	}

}
