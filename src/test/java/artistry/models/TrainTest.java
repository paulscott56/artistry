/** This class was generated by GenTest@Mobacar */
package artistry.models;

import java.util.*;
import java.util.Arrays;
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
import org.neo4j.ogm.annotation.Relationship;
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
public class TrainTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private Train underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
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
	public void testGetPeopleAndLocations() throws Exception {
		// given
		Set<ImplementationTeam> value = new TreeSet<>();
		underTest.setPeopleAndLocations(value);
		// when
		Set<ImplementationTeam> actual = underTest.getPeopleAndLocations();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetPi() throws Exception {
		// given
		Set<ProgramIncrement> value = new TreeSet<>();
		underTest.setPi(value);
		// when
		Set<ProgramIncrement> actual = underTest.getPi();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetSolutionStatement() throws Exception {
		// given
		Document value = new Document();
		underTest.setSolutionStatement(value);
		// when
		Document actual = underTest.getSolutionStatement();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTeamDesignStrategy() throws Exception {
		// given
		Document value = new Document();
		underTest.setTeamDesignStrategy(value);
		// when
		Document actual = underTest.getTeamDesignStrategy();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetVisionStatement() throws Exception {
		// given
		Document value = new Document();
		underTest.setVisionStatement(value);
		// when
		Document actual = underTest.getVisionStatement();
		// then
		assertEquals(value, actual);
	}

}
