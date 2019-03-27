/** This class was generated by GenTest@Mobacar */
package artistry.utils;

import java.nio.charset.*;
import java.util.*;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicReference;
import org.apache.commons.io.*;
import org.junit.*;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.neo4j.driver.v1.Values;
import org.neo4j.driver.v1.types.Point;
import org.neo4j.ogm.typeconversion.AttributeConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.RestTemplate;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.mockito.Matchers.any;
import static org.mockito.Matchers.anyString;
import static org.mockito.Matchers.endsWith;
import static org.mockito.Matchers.eq;
import static org.mockito.Mockito.doAnswer;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import utils.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test")
@ContextConfiguration(classes = NativePointConverter.class)
public class NativePointConverterTest {

	@Autowired
	private NativePointConverter underTest;

	@Before
	public void setupTest() {
		// prepare test
	}

	@Test
	public void testConvert() throws Exception {
		// given
		Point source = mock(Point.class);
		// when
		org.springframework.data.geo.Point actual = underTest.convert(source);
		// then
		assertNotNull(actual);
	}

	@Test
	public void testToEntityAttribute() throws Exception {
		// given
		Point value = mock(Point.class);
		// when
		org.springframework.data.geo.Point actual = underTest.toEntityAttribute(value);
		// then
		assertNotNull(actual);
	}

	@Test
	public void testToGraphProperty() throws Exception {
		// given
		org.springframework.data.geo.Point value = mock(org.springframework.data.geo.Point.class);
		// when
		Point actual = underTest.toGraphProperty(value);
		// then
		assertNotNull(actual);
	}

}
