package artistry.models;

import java.time.LocalDateTime;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.typeconversion.Convert;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import artistry.utils.NoOpLocalDateTimeConversion;

public abstract class AbstractAuditableBaseEntity {
	@Id
	@GeneratedValue // 1
	private Long id;

	@CreatedDate // 2
	@Convert(NoOpLocalDateTimeConversion.class) // 3
	private LocalDateTime createdAt;

	@LastModifiedDate // 2
	@Convert(NoOpLocalDateTimeConversion.class)
	private LocalDateTime updatedAt;
}