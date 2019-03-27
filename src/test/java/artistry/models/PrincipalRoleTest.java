/** This class was generated by GenTest@Mobacar */
package artistry.models;

import artistry.enums.Role;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class PrincipalRoleTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private PrincipalRole underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetDescription() throws Exception {
		// given
		String value = "description";
		underTest.setDescription(value);
		// when
		String actual = underTest.getDescription();
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
	public void testGetPerson() throws Exception {
		// given
		Person value = new Person();
		underTest.setPerson(value);
		// when
		Person actual = underTest.getPerson();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetRole() throws Exception {
		// given
		Role value = Role.SCRUM_MASTER;
		underTest.setRole(value);
		// when
		Role actual = underTest.getRole();
		// then
		assertEquals(value, actual);
	}

}