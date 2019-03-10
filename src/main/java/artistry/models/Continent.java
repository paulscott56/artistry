package artistry.models;

import org.neo4j.ogm.annotation.*;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.Set;

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
	private Set<Country> country;

	public Set<Country> getCountry() {
		return country;
	}

	public void setCountry(Set<Country> country) {
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