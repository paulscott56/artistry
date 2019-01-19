package artistry.models.geo;

import java.util.List;
import java.util.Set;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class Planet {

	@Id
	@GeneratedValue
	private Long id;

	private String name;

	@Relationship(type = "HAS_OCEAN", direction = Relationship.OUTGOING)
	private Set<Ocean> ocean;

	@Relationship(type = "HAS_CONTINENT", direction = Relationship.OUTGOING)
	private Set<Continent> continent;

	@Relationship(type = "HAS_BIOME", direction = Relationship.OUTGOING)
	private Set<Biome> biome;

	@Relationship(type = "HAS_ISLAND", direction = Relationship.OUTGOING)
	private Set<Island> island;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<Ocean> getOcean() {
		return ocean;
	}

	public void setOcean(Set<Ocean> ocean) {
		this.ocean = ocean;
	}

	public Set<Continent> getContinent() {
		return continent;
	}

	public void setContinent(Set<Continent> continent) {
		this.continent = continent;
	}

	public Set<Biome> getBiome() {
		return biome;
	}

	public void setBiome(Set<Biome> biome) {
		this.biome = biome;
	}

	public Set<Island> getIsland() {
		return island;
	}

	public void setIsland(Set<Island> island) {
		this.island = island;
	}

	

}
