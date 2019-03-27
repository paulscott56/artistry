/** This class was generated by GenTest@Mobacar */
package artistry.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
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
public class BoardConfigTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private BoardConfig underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetColumnConfig() throws Exception {
		// given
		ColumnConfig value = new ColumnConfig();
		underTest.setColumnConfig(value);
		// when
		ColumnConfig actual = underTest.getColumnConfig();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetErrorOrComment() throws Exception {
		// given
		String value = "errorOrComment";
		underTest.setErrorOrComment(value);
		// when
		String actual = underTest.getErrorOrComment();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetEstimation() throws Exception {
		// given
		JiraBoardEstimation value = new JiraBoardEstimation();
		underTest.setEstimation(value);
		// when
		JiraBoardEstimation actual = underTest.getEstimation();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetFilter() throws Exception {
		// given
		JiraBoardFilter value = new JiraBoardFilter();
		underTest.setFilter(value);
		// when
		JiraBoardFilter actual = underTest.getFilter();
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
	public void testGetJiraId() throws Exception {
		// given
		int value = 0;
		underTest.setJiraId(value);
		// when
		int actual = underTest.getJiraId();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetLocation() throws Exception {
		// given
		JiraBoardLocation value = new JiraBoardLocation();
		underTest.setLocation(value);
		// when
		JiraBoardLocation actual = underTest.getLocation();
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
	public void testGetRanking() throws Exception {
		// given
		JiraBoardRanking value = new JiraBoardRanking();
		underTest.setRanking(value);
		// when
		JiraBoardRanking actual = underTest.getRanking();
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
	public void testGetType() throws Exception {
		// given
		String value = "type";
		underTest.setType(value);
		// when
		String actual = underTest.getType();
		// then
		assertEquals(value, actual);
	}

}
