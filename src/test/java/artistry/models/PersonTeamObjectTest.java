/** This class was generated by GenTest@Mobacar */
package artistry.models;

import artistry.enums.Role;
import java.util.*;
import java.util.Arrays;
import java.util.List;
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
public class PersonTeamObjectTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private PersonTeamObject underTest;

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
	public void testGetImplementationTeamId() throws Exception {
		// given
		Long value = 0L;
		underTest.setImplementationTeamId(value);
		// when
		Long actual = underTest.getImplementationTeamId();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetPersonId() throws Exception {
		// given
		Long value = 0L;
		underTest.setPersonId(value);
		// when
		Long actual = underTest.getPersonId();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetRoles() throws Exception {
		// given
		List<Role> value = Arrays.asList();
		underTest.setRoles(value);
		// when
		List<Role> actual = underTest.getRoles();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

}
