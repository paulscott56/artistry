package artistry.models;

import java.io.Serializable;

import org.neo4j.ogm.annotation.GeneratedValue;
import org.neo4j.ogm.annotation.Id;
import org.neo4j.ogm.annotation.NodeEntity;
import org.neo4j.ogm.annotation.Relationship;

@NodeEntity
public class RapidviewEntry implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;

	private String rapidviewId;
	private String name;
	private boolean canEdit;
	private boolean sprintSupportEnabled;
	private boolean showDaysInColumn;
	private boolean kanPlanEnabled;
	private boolean showEpicAsPanel;

	@Relationship(type = "PARENT_PROJECT", direction = Relationship.OUTGOING)
	private int parentProjectId;

	private boolean isSimpleBoard;
	private int savedFilterId;

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

	public boolean isCanEdit() {
		return canEdit;
	}

	public void setCanEdit(boolean canEdit) {
		this.canEdit = canEdit;
	}

	public boolean isSprintSupportEnabled() {
		return sprintSupportEnabled;
	}

	public void setSprintSupportEnabled(boolean sprintSupportEnabled) {
		this.sprintSupportEnabled = sprintSupportEnabled;
	}

	public boolean isShowDaysInColumn() {
		return showDaysInColumn;
	}

	public void setShowDaysInColumn(boolean showDaysInColumn) {
		this.showDaysInColumn = showDaysInColumn;
	}

	public boolean isKanPlanEnabled() {
		return kanPlanEnabled;
	}

	public void setKanPlanEnabled(boolean kanPlanEnabled) {
		this.kanPlanEnabled = kanPlanEnabled;
	}

	public boolean isShowEpicAsPanel() {
		return showEpicAsPanel;
	}

	public void setShowEpicAsPanel(boolean showEpicAsPanel) {
		this.showEpicAsPanel = showEpicAsPanel;
	}

	public String getRapidviewId() {
		return rapidviewId;
	}

	public void setRapidviewId(String rapidviewId) {
		this.rapidviewId = rapidviewId;
	}

	public int getParentProjectId() {
		return parentProjectId;
	}

	public void setParentProjectId(int parentProjectId) {
		this.parentProjectId = parentProjectId;
	}

	public boolean isSimpleBoard() {
		return isSimpleBoard;
	}

	public void setSimpleBoard(boolean isSimpleBoard) {
		this.isSimpleBoard = isSimpleBoard;
	}

	public int getSavedFilterId() {
		return savedFilterId;
	}

	public void setSavedFilterId(int savedFilterId) {
		this.savedFilterId = savedFilterId;
	}

}
