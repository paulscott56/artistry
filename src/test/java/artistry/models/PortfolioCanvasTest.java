/** This class was generated by GenTest@Mobacar */
package artistry.models;

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
import static org.mockito.Mockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class PortfolioCanvasTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private PortfolioCanvas underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetBusinessEpics() throws Exception {
		// given
		Set<Epic> value = new TreeSet<>();
		underTest.setBusinessEpics(value);
		// when
		Set<Epic> actual = underTest.getBusinessEpics();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetDate() throws Exception {
		// given
		Date value = new Date();
		underTest.setDate(value);
		// when
		Date actual = underTest.getDate();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetEnablerEpics() throws Exception {
		// given
		Set<Epic> value = new TreeSet<>();
		underTest.setEnablerEpics(value);
		// when
		Set<Epic> actual = underTest.getEnablerEpics();
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
	public void testGetPortfolioBacklog() throws Exception {
		// given
		PortfolioBacklog value = mock(PortfolioBacklog.class);
		underTest.setPortfolioBacklog(value);
		// when
		PortfolioBacklog actual = underTest.getPortfolioBacklog();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetPortfolioName() throws Exception {
		// given
		String value = "portfolioName";
		underTest.setPortfolioName(value);
		// when
		String actual = underTest.getPortfolioName();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetStrategicThemes() throws Exception {
		// given
		Set<StrategicTheme> value = new TreeSet<>();
		underTest.setStrategicThemes(value);
		// when
		Set<StrategicTheme> actual = underTest.getStrategicThemes();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetValueStreams() throws Exception {
		// given
		Set<ValueStream> value = new TreeSet<>();
		underTest.setValueStreams(value);
		// when
		Set<ValueStream> actual = underTest.getValueStreams();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
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