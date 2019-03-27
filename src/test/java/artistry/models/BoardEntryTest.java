/** This class was generated by GenTest@Mobacar */
package artistry.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class BoardEntryTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private BoardEntry underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetBacklog() throws Exception {
		// given
		JiraBacklog value = new JiraBacklog();
		underTest.setBacklog(value);
		// when
		JiraBacklog actual = underTest.getBacklog();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetBoardConfig() throws Exception {
		// given
		BoardConfig value = new BoardConfig();
		underTest.setBoardConfig(value);
		// when
		BoardConfig actual = underTest.getBoardConfig();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetCommentOrError() throws Exception {
		// given
		String value = "commentOrError";
		underTest.setCommentOrError(value);
		// when
		String actual = underTest.getCommentOrError();
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
		BoardLocation value = new BoardLocation();
		underTest.setLocation(value);
		// when
		BoardLocation actual = underTest.getLocation();
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
	public void testGetType() throws Exception {
		// given
		String value = "type";
		underTest.setType(value);
		// when
		String actual = underTest.getType();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetUrl() throws Exception {
		// given
		String value = "url";
		underTest.setUrl(value);
		// when
		String actual = underTest.getUrl();
		// then
		assertEquals(value, actual);
	}

}
