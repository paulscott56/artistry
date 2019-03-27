/** This class was generated by GenTest@Mobacar */
package artistry.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class JiraGroupsTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private JiraGroups underTest;

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
	public void testGetItems() throws Exception {
		// given
		Set<Object> value = new TreeSet<>();
		underTest.setItems(value);
		// when
		Set<Object> actual = underTest.getItems();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetSize() throws Exception {
		// given
		int value = 0;
		underTest.setSize(value);
		// when
		int actual = underTest.getSize();
		// then
		assertEquals(value, actual);
	}

}
