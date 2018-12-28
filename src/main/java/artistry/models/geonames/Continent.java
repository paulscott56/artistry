package artistry.models.geonames;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.Index;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Continent {

	@Id
	@GeneratedValue
	private Long id;

	@Index(unique = true)
	@NotNull
	@Size(min = 2, max = 2)
	@Pattern(regexp = "\\D*", message = "can not contain numbers")
	private String code;

	@NotNull
	@Pattern(regexp = "\\D*", message = "can not contain numbers")
	private String name;

	@Relationship(type = "HAS_COUNTRY", direction = Relationship.OUTGOING)
	private List<Country> country;

	public List<Country> getCountry() {
		return country;
	}

	public void setCountry(List<Country> country) {
		this.country = country;
	}

	transient private boolean hasChanges;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isHasChanges() {
		return hasChanges;
	}

	public void setHasChanges(boolean hasChanges) {
		this.hasChanges = hasChanges;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		if (hasChange(this.code, code))
			this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (hasChange(this.name, name))
			this.name = name;
	}

	public boolean hasChanges() {
		return hasChanges;
	}

	private boolean hasChange(String original, String replacement) {
		if (original != null ? !original.equals(replacement) : replacement != null)
			hasChanges = true;
		return hasChanges;
	}
}