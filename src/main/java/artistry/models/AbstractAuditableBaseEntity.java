package artistry.models;

import java.time.LocalDateTime;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.typeconversion.Convert;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import artistry.utils.NoOpLocalDateTimeConversion;

@NodeEntity
abstract class AbstractAuditableBaseEntity {
	@Id
	@GeneratedValue
	private Long id;

	@CreatedDate
	@Convert(NoOpLocalDateTimeConversion.class)
	private LocalDateTime createdAt;

	@LastModifiedDate
	@Convert(NoOpLocalDateTimeConversion.class)
	private LocalDateTime updatedAt;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
}