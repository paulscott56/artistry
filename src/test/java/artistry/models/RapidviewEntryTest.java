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
public class RapidviewEntryTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private RapidviewEntry underTest;

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
	public void testGetParentProjectId() throws Exception {
		// given
		int value = 0;
		underTest.setParentProjectId(value);
		// when
		int actual = underTest.getParentProjectId();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetRapidviewId() throws Exception {
		// given
		String value = "rapidviewId";
		underTest.setRapidviewId(value);
		// when
		String actual = underTest.getRapidviewId();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetSavedFilterId() throws Exception {
		// given
		int value = 0;
		underTest.setSavedFilterId(value);
		// when
		int actual = underTest.getSavedFilterId();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testIsCanEdit() throws Exception {
		// given
		boolean value = false;
		underTest.setCanEdit(value);
		// when
		boolean actual = underTest.isCanEdit();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testIsKanPlanEnabled() throws Exception {
		// given
		boolean value = false;
		underTest.setKanPlanEnabled(value);
		// when
		boolean actual = underTest.isKanPlanEnabled();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testIsShowDaysInColumn() throws Exception {
		// given
		boolean value = false;
		underTest.setShowDaysInColumn(value);
		// when
		boolean actual = underTest.isShowDaysInColumn();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testIsShowEpicAsPanel() throws Exception {
		// given
		boolean value = false;
		underTest.setShowEpicAsPanel(value);
		// when
		boolean actual = underTest.isShowEpicAsPanel();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testIsSimpleBoard() throws Exception {
		// given
		boolean value = false;
		underTest.setSimpleBoard(value);
		// when
		boolean actual = underTest.isSimpleBoard();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testIsSprintSupportEnabled() throws Exception {
		// given
		boolean value = false;
		underTest.setSprintSupportEnabled(value);
		// when
		boolean actual = underTest.isSprintSupportEnabled();
		// then
		assertEquals(value, actual);
	}

}