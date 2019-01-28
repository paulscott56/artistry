package artistry.utils;

import java.time.LocalDateTime;

import org.neo4j.ogm.typeconversion.AttributeConverter;

/**
 * This is a stupid workaround for a bug in OGM together with Java-Driver 1.6
 * and native LocalDateTimes.
 *
 * @author Michael J. Simons
 */
public class NoOpLocalDateTimeConversion implements AttributeConverter<LocalDateTime, LocalDateTime> {
	@Override
	public LocalDateTime toGraphProperty(LocalDateTime value) {
		return value;
	}

	@Override
	public LocalDateTime toEntityAttribute(LocalDateTime value) {
		return value;
	}
}