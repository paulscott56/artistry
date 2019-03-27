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
public class FieldsTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private Fields underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAggregateprogress() throws Exception {
		// given
		Aggregateprogress value = new Aggregateprogress();
		underTest.setAggregateprogress(value);
		// when
		Aggregateprogress actual = underTest.getAggregateprogress();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetAggregatetimeestimate() throws Exception {
		// given
		Object value = "Object";
		underTest.setAggregatetimeestimate(value);
		// when
		Object actual = underTest.getAggregatetimeestimate();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetAggregatetimeoriginalestimate() throws Exception {
		// given
		Object value = "Object";
		underTest.setAggregatetimeoriginalestimate(value);
		// when
		Object actual = underTest.getAggregatetimeoriginalestimate();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetAggregatetimespent() throws Exception {
		// given
		Object value = "Object";
		underTest.setAggregatetimespent(value);
		// when
		Object actual = underTest.getAggregatetimespent();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetAssignee() throws Exception {
		// given
		Assignee value = new Assignee();
		underTest.setAssignee(value);
		// when
		Assignee actual = underTest.getAssignee();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetAttachment() throws Exception {
		// given
		List<Attachment> value = Arrays.asList();
		underTest.setAttachment(value);
		// when
		List<Attachment> actual = underTest.getAttachment();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetComment() throws Exception {
		// given
		Comment value = new Comment();
		underTest.setComment(value);
		// when
		Comment actual = underTest.getComment();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetComponents() throws Exception {
		// given
		List<Component> value = Arrays.asList();
		underTest.setComponents(value);
		// when
		List<Component> actual = underTest.getComponents();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetCreated() throws Exception {
		// given
		String value = "created";
		underTest.setCreated(value);
		// when
		String actual = underTest.getCreated();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetCreator() throws Exception {
		// given
		Creator value = new Creator();
		underTest.setCreator(value);
		// when
		Creator actual = underTest.getCreator();
		// then
		assertEquals(value, actual);
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
	public void testGetFixVersions() throws Exception {
		// given
		List<FixVersion> value = Arrays.asList();
		underTest.setFixVersions(value);
		// when
		List<FixVersion> actual = underTest.getFixVersions();
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
	public void testGetIssuetype() throws Exception {
		// given
		Issuetype value = new Issuetype();
		underTest.setIssuetype(value);
		// when
		Issuetype actual = underTest.getIssuetype();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetLabels() throws Exception {
		// given
		List<String> value = Arrays.asList();
		underTest.setLabels(value);
		// when
		List<String> actual = underTest.getLabels();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetLastViewed() throws Exception {
		// given
		String value = "lastViewed";
		underTest.setLastViewed(value);
		// when
		String actual = underTest.getLastViewed();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetPriority() throws Exception {
		// given
		Priority value = new Priority();
		underTest.setPriority(value);
		// when
		Priority actual = underTest.getPriority();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetProgress() throws Exception {
		// given
		Progress value = new Progress();
		underTest.setProgress(value);
		// when
		Progress actual = underTest.getProgress();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetProject() throws Exception {
		// given
		Project value = new Project();
		underTest.setProject(value);
		// when
		Project actual = underTest.getProject();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetReporter() throws Exception {
		// given
		Reporter value = new Reporter();
		underTest.setReporter(value);
		// when
		Reporter actual = underTest.getReporter();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetResolution() throws Exception {
		// given
		JiraResolution value = new JiraResolution();
		underTest.setResolution(value);
		// when
		JiraResolution actual = underTest.getResolution();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetResolutiondate() throws Exception {
		// given
		Object value = "Object";
		underTest.setResolutiondate(value);
		// when
		Object actual = underTest.getResolutiondate();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetStatus() throws Exception {
		// given
		Status value = new Status();
		underTest.setStatus(value);
		// when
		Status actual = underTest.getStatus();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetSubtasks() throws Exception {
		// given
		List<SubTask> value = Arrays.asList();
		underTest.setSubtasks(value);
		// when
		List<SubTask> actual = underTest.getSubtasks();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetSummary() throws Exception {
		// given
		String value = "summary";
		underTest.setSummary(value);
		// when
		String actual = underTest.getSummary();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTimeestimate() throws Exception {
		// given
		Object value = "Object";
		underTest.setTimeestimate(value);
		// when
		Object actual = underTest.getTimeestimate();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTimeoriginalestimate() throws Exception {
		// given
		Object value = "Object";
		underTest.setTimeoriginalestimate(value);
		// when
		Object actual = underTest.getTimeoriginalestimate();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTimespent() throws Exception {
		// given
		Object value = "Object";
		underTest.setTimespent(value);
		// when
		Object actual = underTest.getTimespent();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetTimetracking() throws Exception {
		// given
		Timetracking value = new Timetracking();
		underTest.setTimetracking(value);
		// when
		Timetracking actual = underTest.getTimetracking();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetUpdated() throws Exception {
		// given
		String value = "updated";
		underTest.setUpdated(value);
		// when
		String actual = underTest.getUpdated();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetVotes() throws Exception {
		// given
		Votes value = new Votes();
		underTest.setVotes(value);
		// when
		Votes actual = underTest.getVotes();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetWatches() throws Exception {
		// given
		Watches value = new Watches();
		underTest.setWatches(value);
		// when
		Watches actual = underTest.getWatches();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetWorklog() throws Exception {
		// given
		Worklog value = new Worklog();
		underTest.setWorklog(value);
		// when
		Worklog actual = underTest.getWorklog();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetWorkratio() throws Exception {
		// given
		Integer value = 0;
		underTest.setWorkratio(value);
		// when
		Integer actual = underTest.getWorkratio();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testIsFlagged() throws Exception {
		// given
		boolean value = false;
		underTest.setFlagged(value);
		// when
		boolean actual = underTest.isFlagged();
		// then
		assertEquals(value, actual);
	}

}