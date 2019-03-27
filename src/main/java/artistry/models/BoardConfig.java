package artistry.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

@NodeEntity
public class BoardConfig {

	@Id
	@GeneratedValue
	@JsonIgnore
	private Long id;

	private String errorOrComment;
	private ColumnConfig columnConfig;
	private JiraBoardEstimation estimation;
	private JiraBoardFilter filter;

	@JsonProperty("id")
	private int jiraId;

	private JiraBoardLocation location;
	private String name;
	private JiraBoardRanking ranking;
	private String self;
	private String type;

	@JsonIgnore
	public Long getId() {
		return id;
	}

	@JsonIgnore
	public void setId(Long id) {
		this.id = id;
	}

	public String getErrorOrComment() {
		return errorOrComment;
	}

	public void setErrorOrComment(String errorOrComment) {
		this.errorOrComment = errorOrComment;
	}

	public ColumnConfig getColumnConfig() {
		return columnConfig;
	}

	public void setColumnConfig(ColumnConfig columnConfig) {
		this.columnConfig = columnConfig;
	}

	public JiraBoardEstimation getEstimation() {
		return estimation;
	}

	public void setEstimation(JiraBoardEstimation estimation) {
		this.estimation = estimation;
	}

	public JiraBoardFilter getFilter() {
		return filter;
	}

	public void setFilter(JiraBoardFilter filter) {
		this.filter = filter;
	}

	public int getJiraId() {
		return jiraId;
	}

	public void setJiraId(int jiraId) {
		this.jiraId = jiraId;
	}

	public JiraBoardLocation getLocation() {
		return location;
	}

	public void setLocation(JiraBoardLocation location) {
		this.location = location;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JiraBoardRanking getRanking() {
		return ranking;
	}

	public void setRanking(JiraBoardRanking ranking) {
		this.ranking = ranking;
	}

	public String getSelf() {
		return self;
	}

	public void setSelf(String self) {
		this.self = self;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}