package artistry.repositories;

import java.util.Collection;

import org.springframework.data.neo4j.annotation.Query;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import artistry.models.train.Train;

@RepositoryRestResource(collectionResourceRel = "trains", path = "trains")
public interface TrainRepository extends Neo4jRepository<Train, Long> {

	Train findByName(@Param("name") String name);

	Collection<Train> findByNameLike(@Param("name") String name);

	@Query("MATCH (m:train) <- [r:TEAM]-(a:Team) RETURN m,r,a LIMIT {LIMIT}")
	Collection<Train> graph(@Param("limit") int limit);

}
