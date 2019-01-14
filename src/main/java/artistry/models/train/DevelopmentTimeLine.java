package artistry.models.train;

import java.util.Date;

public class DevelopmentTimeLine {
	
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
