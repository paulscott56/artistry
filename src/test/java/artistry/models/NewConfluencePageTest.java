/** This class was generated by GenTest@Mobacar */
package artistry.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class NewConfluencePageTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private NewConfluencePage underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetBody() throws Exception {
		// given
		ConfluenceBody value = new ConfluenceBody();
		underTest.setBody(value);
		// when
		ConfluenceBody actual = underTest.getBody();
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
	public void testGetSpace() throws Exception {
		// given
		ConfluenceSpace value = new ConfluenceSpace();
		underTest.setSpace(value);
		// when
		ConfluenceSpace actual = underTest.getSpace();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTitle() throws Exception {
		// given
		String value = "title";
		underTest.setTitle(value);
		// when
		String actual = underTest.getTitle();
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
