/** This class was generated by GenTest@Mobacar */
package artistry.models;

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
public class CommentTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private Comment underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetComments() throws Exception {
		// given
		List<Comment> value = Arrays.asList();
		underTest.setComments(value);
		// when
		List<Comment> actual = underTest.getComments();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
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
	public void testGetMaxResults() throws Exception {
		// given
		Integer value = 0;
		underTest.setMaxResults(value);
		// when
		Integer actual = underTest.getMaxResults();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetStartAt() throws Exception {
		// given
		Integer value = 0;
		underTest.setStartAt(value);
		// when
		Integer actual = underTest.getStartAt();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTotal() throws Exception {
		// given
		Integer value = 0;
		underTest.setTotal(value);
		// when
		Integer actual = underTest.getTotal();
		// then
		assertEquals(value, actual);
	}

}