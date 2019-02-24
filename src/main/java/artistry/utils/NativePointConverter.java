package artistry.utils;

import org.neo4j.driver.v1.Values;
import org.neo4j.driver.v1.types.Point;
import org.neo4j.ogm.typeconversion.AttributeConverter;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
class NativePointConverter
		implements AttributeConverter<org.springframework.data.geo.Point, org.neo4j.driver.v1.types.Point>,
		Converter<org.neo4j.driver.v1.types.Point, org.springframework.data.geo.Point> {

	@Override
	public org.springframework.data.geo.Point toEntityAttribute(org.neo4j.driver.v1.types.Point value) {
		return Optional.ofNullable(value).map(p -> new org.springframework.data.geo.Point(p.x(), p.y())).orElse(null);
	}

	@Override
	public org.springframework.data.geo.Point convert(org.neo4j.driver.v1.types.Point source) {
		return toEntityAttribute(source);
	}

	@Override
	public Point toGraphProperty(org.springframework.data.geo.Point value) {
		Optional.ofNullable(value).map(p -> Values.point(4326, value.getX(), value.getY()).asPoint()).orElse(null);
		return null;
	}
}