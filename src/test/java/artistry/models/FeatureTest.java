/** This class was generated by GenTest@Mobacar */
package artistry.models;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Date;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FeatureTest {

	/**
	 * If the class has a default constructor, then you don't need to instantiate it manually. InjectMocks annotation will do it.<br/>
	 * Otherwise use the {@link #setupTest()} method for creating the underTest object.
	 */
	@InjectMocks
	private Feature underTest;

	@Before
	public void setupTest() {
		// prepare test
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testGetAcceptanceCriteria() throws Exception {
		// given
		Set<Document> value = new TreeSet<>();
		underTest.setAcceptanceCriteria(value);
		// when
		Set<Document> actual = underTest.getAcceptanceCriteria();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetAdditionalNotes() throws Exception {
		// given
		Set<String> value = new TreeSet<>();
		underTest.setAdditionalNotes(value);
		// when
		Set<String> actual = underTest.getAdditionalNotes();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetAssumptions() throws Exception {
		// given
		Document value = new Document();
		underTest.setAssumptions(value);
		// when
		Document actual = underTest.getAssumptions();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetBenefitStatement() throws Exception {
		// given
		String value = "benefitStatement";
		underTest.setBenefitStatement(value);
		// when
		String actual = underTest.getBenefitStatement();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetBusinessValue() throws Exception {
		// given
		Integer value = 0;
		underTest.setBusinessValue(value);
		// when
		Integer actual = underTest.getBusinessValue();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetCompletionDate() throws Exception {
		// given
		Date value = new Date();
		underTest.setCompletionDate(value);
		// when
		Date actual = underTest.getCompletionDate();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetCreatedBy() throws Exception {
		// given
		Person value = new Person();
		underTest.setCreatedBy(value);
		// when
		Person actual = underTest.getCreatedBy();
		// then
		assertEquals(value, actual);
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
	public void testGetDefinitionOfDone() throws Exception {
		// given
		Document value = new Document();
		underTest.setDefinitionOfDone(value);
		// when
		Document actual = underTest.getDefinitionOfDone();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetDependencies() throws Exception {
		// given
		Set<Feature> value = new TreeSet<>();
		underTest.setDependencies(value);
		// when
		Set<Feature> actual = underTest.getDependencies();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetDependenciesAndStakeholders() throws Exception {
		// given
		Set<Document> value = new TreeSet<>();
		underTest.setDependenciesAndStakeholders(value);
		// when
		Set<Document> actual = underTest.getDependenciesAndStakeholders();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetFeatureDescription() throws Exception {
		// given
		Document value = new Document();
		underTest.setFeatureDescription(value);
		// when
		Document actual = underTest.getFeatureDescription();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetFeatureName() throws Exception {
		// given
		String value = "featureName";
		underTest.setFeatureName(value);
		// when
		String actual = underTest.getFeatureName();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetFeatureOwner() throws Exception {
		// given
		Person value = new Person();
		underTest.setFeatureOwner(value);
		// when
		Person actual = underTest.getFeatureOwner();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetFeatureOwnerTeam() throws Exception {
		// given
		ImplementationTeam value = new ImplementationTeam();
		underTest.setFeatureOwnerTeam(value);
		// when
		ImplementationTeam actual = underTest.getFeatureOwnerTeam();
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
	public void testGetImplementationTeams() throws Exception {
		// given
		Set<ImplementationTeam> value = new TreeSet<>();
		underTest.setImplementationTeams(value);
		// when
		Set<ImplementationTeam> actual = underTest.getImplementationTeams();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetLastModificationDate() throws Exception {
		// given
		Date value = new Date();
		underTest.setLastModificationDate(value);
		// when
		Date actual = underTest.getLastModificationDate();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetNonFunctionalRequirements() throws Exception {
		// given
		Set<NonFunctionalRequirement> value = new TreeSet<>();
		underTest.setNonFunctionalRequirements(value);
		// when
		Set<NonFunctionalRequirement> actual = underTest.getNonFunctionalRequirements();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetScope() throws Exception {
		// given
		Document value = new Document();
		underTest.setScope(value);
		// when
		Document actual = underTest.getScope();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testGetStakeHolders() throws Exception {
		// given
		Set<Person> value = new TreeSet<>();
		underTest.setStakeHolders(value);
		// when
		Set<Person> actual = underTest.getStakeHolders();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetTestPlans() throws Exception {
		// given
		Set<TestPlan> value = new TreeSet<>();
		underTest.setTestPlans(value);
		// when
		Set<TestPlan> actual = underTest.getTestPlans();
		// then
		assertArrayEquals(value.toArray(), actual.toArray());
	}

	@Test
	public void testGetWsjf() throws Exception {
		// given
		WeightedShortestJobFirst value = new WeightedShortestJobFirst();
		underTest.setWsjf(value);
		// when
		WeightedShortestJobFirst actual = underTest.getWsjf();
		// then
		assertEquals(value, actual);
	}

	@Test
	public void testIsComplete() throws Exception {
		// given
		boolean value = false;
		underTest.setComplete(value);
		// when
		boolean actual = underTest.isComplete();
		// then
		assertEquals(value, actual);
	}

}
