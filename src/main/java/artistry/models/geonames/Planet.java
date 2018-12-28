package artistry.models.geonames;

import java.util.List;

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
	private List<Ocean> ocean;

	@Relationship(type = "HAS_CONTINENT", direction = Relationship.OUTGOING)
	private List<Continent> continent;

	@Relationship(type = "HAS_BIOME", direction = Relationship.OUTGOING)
	private List<Biome> biome;

	@Relationship(type = "HAS_ISLAND", direction = Relationship.OUTGOING)
	private List<Island> island;

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

	public List<Ocean> getOcean() {
		return ocean;
	}

	public void setOcean(List<Ocean> ocean) {
		this.ocean = ocean;
	}

	public List<Continent> getContinent() {
		return continent;
	}

	public void setContinent(List<Continent> continent) {
		this.continent = continent;
	}

	public List<Biome> getBiome() {
		return biome;
	}

	public void setBiome(List<Biome> biome) {
		this.biome = biome;
	}

	public List<Island> getIsland() {
		return island;
	}

	public void setIsland(List<Island> island) {
		this.island = island;
	}

}
