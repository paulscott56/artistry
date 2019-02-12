package artistry.models;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@NodeEntity
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({ "issuetype", "components", "timespent", "timeoriginalestimate", "description", "project",
		"fixVersions", "aggregatetimespent", "resolution", "timetracking", "attachment", "aggregatetimeestimate",
		"resolutiondate", "workratio", "summary", "lastViewed", "watches", "creator", "subtasks", "created", "reporter",
		"aggregateprogress", "priority", "labels", "environment", "timeestimate", "aggregatetimeoriginalestimate",
		"versions", "duedate", "progress", "comment", "issuelinks", "votes", "worklog", "assignee", "updated",
		"status" })
public class Fields {

	@Id
	@GeneratedValue
	private Long id;

	@JsonProperty("issuetype")
	private Issuetype issuetype;

	// @JsonProperty("components")
	// private List<Object> components = null;

	@JsonProperty("timespent")
	private Object timespent;

	@JsonProperty("timeoriginalestimate")
	private Object timeoriginalestimate;

	@JsonProperty("description")
	private String description;

	// @JsonProperty("project")
	// private Project project;

	// @JsonProperty("fixVersions")
	// private List<Object> fixVersions = null;

	@JsonProperty("aggregatetimespent")
	private Object aggregatetimespent;

	@JsonProperty("resolution")
	private Object resolution;

	@JsonProperty("timetracking")
	private Timetracking timetracking;

	// @JsonProperty("attachment")
	// private List<Object> attachment = null;

	@JsonProperty("aggregatetimeestimate")
	private Object aggregatetimeestimate;

	@JsonProperty("resolutiondate")
	private Object resolutiondate;

	@JsonProperty("workratio")
	private Integer workratio;

	@JsonProperty("summary")
	private String summary;

	@JsonProperty("lastViewed")
	private String lastViewed;

	// @JsonProperty("watches")
	// private Watches watches;

	// @JsonProperty("creator")
	// private Creator creator;

	// @JsonProperty("subtasks")
	// private List<Object> subtasks = null;

	// @JsonProperty("created")
	// private String created;

	// @JsonProperty("reporter")
	// private Reporter reporter;

	// @JsonProperty("aggregateprogress")
	// private Aggregateprogress aggregateprogress;

	// @JsonProperty("priority")
	// private Priority priority;

	// @JsonProperty("labels")
	// private List<String> labels = null;

	// @JsonProperty("environment")
	// private Object environment;

	// @JsonProperty("timeestimate")
	// private Object timeestimate;

	// @JsonProperty("aggregatetimeoriginalestimate")
	// private Object aggregatetimeoriginalestimate;

	// @JsonProperty("versions")
	// private List<Object> versions = null;

	// @JsonProperty("duedate")
	// private Object duedate;

	// @JsonProperty("progress")
	// private Progress progress;

	// @JsonProperty("comment")
	// private Comment comment;

	// @JsonProperty("issuelinks")
	// private List<Object> issuelinks = null;

	// @JsonProperty("votes")
	// private Votes votes;

	// @JsonProperty("worklog")
	// private Worklog worklog;

	// @JsonProperty("assignee")
	// private Assignee assignee;

	// @JsonProperty("updated")
	// private String updated;

	// @JsonProperty("status")
	// private Status status;

	// @JsonIgnore
	// private Map<String, Object> additionalProperties = new HashMap<String,
	// Object>();

	@JsonProperty("issuetype")
	public Issuetype getIssuetype() {
		return issuetype;
	}

	@JsonProperty("issuetype")
	public void setIssuetype(Issuetype issuetype) {
		this.issuetype = issuetype;
	}

	// @JsonProperty("components")
	// public List<Object> getComponents() {
	// return components;
	// }
	//
	// @JsonProperty("components")
	// public void setComponents(List<Object> components) {
	// this.components = components;
	// }

	@JsonProperty("timespent")
	public Object getTimespent() {
		return timespent;
	}

	@JsonProperty("timespent")
	public void setTimespent(Object timespent) {
		this.timespent = timespent;
	}

	@JsonProperty("timeoriginalestimate")
	public Object getTimeoriginalestimate() {
		return timeoriginalestimate;
	}

	@JsonProperty("timeoriginalestimate")
	public void setTimeoriginalestimate(Object timeoriginalestimate) {
		this.timeoriginalestimate = timeoriginalestimate;
	}

	@JsonProperty("description")
	public String getDescription() {
		return description;
	}

	@JsonProperty("description")
	public void setDescription(String description) {
		this.description = description;
	}

	// @JsonProperty("project")
	// public Project getProject() {
	// return project;
	// }
	//
	// @JsonProperty("project")
	// public void setProject(Project project) {
	// this.project = project;
	// }

	// @JsonProperty("fixVersions")
	// public List<Object> getFixVersions() {
	// return fixVersions;
	// }
	//
	// @JsonProperty("fixVersions")
	// public void setFixVersions(List<Object> fixVersions) {
	// this.fixVersions = fixVersions;
	// }

	@JsonProperty("aggregatetimespent")
	public Object getAggregatetimespent() {
		return aggregatetimespent;
	}

	@JsonProperty("aggregatetimespent")
	public void setAggregatetimespent(Object aggregatetimespent) {
		this.aggregatetimespent = aggregatetimespent;
	}

	@JsonProperty("resolution")
	public Object getResolution() {
		return resolution;
	}

	@JsonProperty("resolution")
	public void setResolution(Object resolution) {
		this.resolution = resolution;
	}

	@JsonProperty("timetracking")
	public Timetracking getTimetracking() {
		return timetracking;
	}

	@JsonProperty("timetracking")
	public void setTimetracking(Timetracking timetracking) {
		this.timetracking = timetracking;
	}

	// @JsonProperty("attachment")
	// public List<Object> getAttachment() {
	// return attachment;
	// }
	//
	// @JsonProperty("attachment")
	// public void setAttachment(List<Object> attachment) {
	// this.attachment = attachment;
	// }

	@JsonProperty("aggregatetimeestimate")
	public Object getAggregatetimeestimate() {
		return aggregatetimeestimate;
	}

	@JsonProperty("aggregatetimeestimate")
	public void setAggregatetimeestimate(Object aggregatetimeestimate) {
		this.aggregatetimeestimate = aggregatetimeestimate;
	}

	@JsonProperty("resolutiondate")
	public Object getResolutiondate() {
		return resolutiondate;
	}

	@JsonProperty("resolutiondate")
	public void setResolutiondate(Object resolutiondate) {
		this.resolutiondate = resolutiondate;
	}

	@JsonProperty("workratio")
	public Integer getWorkratio() {
		return workratio;
	}

	@JsonProperty("workratio")
	public void setWorkratio(Integer workratio) {
		this.workratio = workratio;
	}

	@JsonProperty("summary")
	public String getSummary() {
		return summary;
	}

	@JsonProperty("summary")
	public void setSummary(String summary) {
		this.summary = summary;
	}

	@JsonProperty("lastViewed")
	public String getLastViewed() {
		return lastViewed;
	}

	@JsonProperty("lastViewed")
	public void setLastViewed(String lastViewed) {
		this.lastViewed = lastViewed;
	}

	// @JsonProperty("watches")
	// public Watches getWatches() {
	// return watches;
	// }
	//
	// @JsonProperty("watches")
	// public void setWatches(Watches watches) {
	// this.watches = watches;
	// }

	// @JsonProperty("creator")
	// public Creator getCreator() {
	// return creator;
	// }
	//
	// @JsonProperty("creator")
	// public void setCreator(Creator creator) {
	// this.creator = creator;
	// }

	// @JsonProperty("subtasks")
	// public List<Object> getSubtasks() {
	// return subtasks;
	// }
	//
	// @JsonProperty("subtasks")
	// public void setSubtasks(List<Object> subtasks) {
	// this.subtasks = subtasks;
	// }

	// @JsonProperty("created")
	// public String getCreated() {
	// return created;
	// }
	//
	// @JsonProperty("created")
	// public void setCreated(String created) {
	// this.created = created;
	// }

	// @JsonProperty("reporter")
	// public Reporter getReporter() {
	// return reporter;
	// }
	//
	// @JsonProperty("reporter")
	// public void setReporter(Reporter reporter) {
	// this.reporter = reporter;
	// }

	// @JsonProperty("aggregateprogress")
	// public Aggregateprogress getAggregateprogress() {
	// return aggregateprogress;
	// }
	//
	// @JsonProperty("aggregateprogress")
	// public void setAggregateprogress(Aggregateprogress aggregateprogress) {
	// this.aggregateprogress = aggregateprogress;
	// }

	// @JsonProperty("priority")
	// public Priority getPriority() {
	// return priority;
	// }
	//
	// @JsonProperty("priority")
	// public void setPriority(Priority priority) {
	// this.priority = priority;
	// }

	// @JsonProperty("labels")
	// public List<String> getLabels() {
	// return labels;
	// }
	//
	// @JsonProperty("labels")
	// public void setLabels(List<String> labels) {
	// this.labels = labels;
	// }

	// @JsonProperty("environment")
	// public Object getEnvironment() {
	// return environment;
	// }
	//
	// @JsonProperty("environment")
	// public void setEnvironment(Object environment) {
	// this.environment = environment;
	// }

	// @JsonProperty("timeestimate")
	// public Object getTimeestimate() {
	// return timeestimate;
	// }
	//
	// @JsonProperty("timeestimate")
	// public void setTimeestimate(Object timeestimate) {
	// this.timeestimate = timeestimate;
	// }

	// @JsonProperty("aggregatetimeoriginalestimate")
	// public Object getAggregatetimeoriginalestimate() {
	// return aggregatetimeoriginalestimate;
	// }
	//
	// @JsonProperty("aggregatetimeoriginalestimate")
	// public void setAggregatetimeoriginalestimate(Object
	// aggregatetimeoriginalestimate) {
	// this.aggregatetimeoriginalestimate = aggregatetimeoriginalestimate;
	// }

	// @JsonProperty("versions")
	// public List<Object> getVersions() {
	// return versions;
	// }
	//
	// @JsonProperty("versions")
	// public void setVersions(List<Object> versions) {
	// this.versions = versions;
	// }

	// @JsonProperty("duedate")
	// public Object getDuedate() {
	// return duedate;
	// }
	//
	// @JsonProperty("duedate")
	// public void setDuedate(Object duedate) {
	// this.duedate = duedate;
	// }

	// @JsonProperty("progress")
	// public Progress getProgress() {
	// return progress;
	// }
	//
	// @JsonProperty("progress")
	// public void setProgress(Progress progress) {
	// this.progress = progress;
	// }

	// @JsonProperty("comment")
	// public Comment getComment() {
	// return comment;
	// }
	//
	// @JsonProperty("comment")
	// public void setComment(Comment comment) {
	// this.comment = comment;
	// }

	// @JsonProperty("issuelinks")
	// public List<Object> getIssuelinks() {
	// return issuelinks;
	// }
	//
	// @JsonProperty("issuelinks")
	// public void setIssuelinks(List<Object> issuelinks) {
	// this.issuelinks = issuelinks;
	// }

	// @JsonProperty("votes")
	// public Votes getVotes() {
	// return votes;
	// }
	//
	// @JsonProperty("votes")
	// public void setVotes(Votes votes) {
	// this.votes = votes;
	// }

	// @JsonProperty("worklog")
	// public Worklog getWorklog() {
	// return worklog;
	// }
	//
	// @JsonProperty("worklog")
	// public void setWorklog(Worklog worklog) {
	// this.worklog = worklog;
	// }

	// @JsonProperty("assignee")
	// public Assignee getAssignee() {
	// return assignee;
	// }
	//
	// @JsonProperty("assignee")
	// public void setAssignee(Assignee assignee) {
	// this.assignee = assignee;
	// }

	// @JsonProperty("updated")
	// public String getUpdated() {
	// return updated;
	// }
	//
	// @JsonProperty("updated")
	// public void setUpdated(String updated) {
	// this.updated = updated;
	// }

	// @JsonProperty("status")
	// public Status getStatus() {
	// return status;
	// }
	//
	// @JsonProperty("status")
	// public void setStatus(Status status) {
	// this.status = status;
	// }

	// @JsonAnyGetter
	// public Map<String, Object> getAdditionalProperties() {
	// return this.additionalProperties;
	// }
	//
	// @JsonAnySetter
	// public void setAdditionalProperty(String name, Object value) {
	// this.additionalProperties.put(name, value);
	// }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	// public void setAdditionalProperties(Map<String, Object> additionalProperties)
	// {
	// this.additionalProperties = additionalProperties;
	// }

}