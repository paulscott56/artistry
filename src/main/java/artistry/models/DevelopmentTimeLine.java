package artistry.models;

import java.io.Serializable;
import java.util.Date;

public class DevelopmentTimeLine implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Date estimatedStartDate;
	private Date estimatedCompletionDate;
	
	public Date getEstimatedStartDate() {
		return estimatedStartDate;
	}
	public void setEstimatedStartDate(Date estimatedStartDate) {
		this.estimatedStartDate = estimatedStartDate;
	}
	public Date getEstimatedCompletionDate() {
		return estimatedCompletionDate;
	}
	public void setEstimatedCompletionDate(Date estimatedCompletionDate) {
		this.estimatedCompletionDate = estimatedCompletionDate;
	}
}
