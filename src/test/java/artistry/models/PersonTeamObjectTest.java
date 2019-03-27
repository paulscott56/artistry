/** This class was generated by GenTest@Mobacar */
package artistry.models;

import artistry.enums.Role;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

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
