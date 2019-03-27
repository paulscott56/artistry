/** This class was generated by GenTest@Mobacar */
package artistry.utils;

import org.junit.Before;
import org.junit.Test;

import java.awt.*;

import static org.junit.Assert.assertNotNull;

public class GoogleTileUtilsTest {

	@Before
	public void setupTest() {
		// prepare test
	}

	@Test
	public void testGetPixelOffsetInTile() throws Exception {
		// given
		double lat = 0d;
		double lng = 0d;
		int zoom = 0;
		// when
		Point actual = GoogleTileUtils.getPixelOffsetInTile(lat, lng, zoom);
		// then
		assertNotNull(actual);
	}

	@Test
	public void testGetTileRect() throws Exception {
		// given
		int x = 0;
		int y = 0;
		int zoom = 0;
		// when
		java.awt.geom.Rectangle2D.Double actual = GoogleTileUtils.getTileRect(x, y, zoom);
		// then
		assertNotNull(actual);
	}

}
