/** This class was generated by GenTest@Mobacar */
package artistry.models;

import artistry.enums.DocumentStatus;
import artistry.enums.License;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class DocumentTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private Document underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAdditionalAuthors() throws Exception {
		// given
		Set<Person> value = new TreeSet<>();
		underTest.setAdditionalAuthors(value);
		// when
		Set<Person> actual = underTest.getAdditionalAuthors();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
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
	public void testGetDocumentBody() throws Exception {
		// given
		String value = "documentBody";
		underTest.setDocumentBody(value);
		// when
		String actual = underTest.getDocumentBody();
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
	public void testGetLicense() throws Exception {
		// given
		License value = License.COPYRIGHT;
		underTest.setLicense(value);
		// when
		License actual = underTest.getLicense();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetPrimaryAuthor() throws Exception {
		// given
		Person value = new Person();
		underTest.setPrimaryAuthor(value);
		// when
		Person actual = underTest.getPrimaryAuthor();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetRevisionDates() throws Exception {
		// given
		Set<Date> value = new TreeSet<>();
		underTest.setRevisionDates(value);
		// when
		Set<Date> actual = underTest.getRevisionDates();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetStatus() throws Exception {
		// given
		DocumentStatus value = DocumentStatus.DRAFT;
		underTest.setStatus(value);
		// when
		DocumentStatus actual = underTest.getStatus();
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
	public void testGetVersion() throws Exception {
		// given
		String value = "version";
		underTest.setVersion(value);
		// when
		String actual = underTest.getVersion();
		// then
		assertEquals(value, actual);
	}

}
