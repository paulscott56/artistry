/** This class was generated by GenTest@Mobacar */
package artistry.models;

import java.util.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Set;
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
public class StrategicThemeTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private StrategicTheme underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetCreationDate() throws Exception {
		// given
		Date value = new Date();
		underTest.setCreationDate(value);
		// when
		Date actual = underTest.getCreationDate();
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
	public void testGetSupportingDocumentation() throws Exception {
		// given
		Set<Document> value = new TreeSet<>();
		underTest.setSupportingDocumentation(value);
		// when
		Set<Document> actual = underTest.getSupportingDocumentation();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetThemeName() throws Exception {
		// given
		String value = "themeName";
		underTest.setThemeName(value);
		// when
		String actual = underTest.getThemeName();
		// then
		assertEquals(value, actual);
	}

}
