package Pojo;

public class Issue implements Cloneable{
	 int id ;
	 String assignee;
	 String reportee;
	 String description;
	 String severity; 
	 String status; 
	 
	 public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAssignee() {
		return assignee;
	}
	public void setAssignee(String assignee) {
		this.assignee = assignee;
	}
	public String getReportee() {
		return reportee;
	}
	public void setReportee(String reportee) {
		this.reportee = reportee;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSeverity() {
		return severity;
	}
	public void setSeverity(String severity) {
		this.severity = severity;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public  Issue(int id, String assignee, String reportee, String description, String severity, String status) {

		this.id = id;
		this.assignee = assignee;
		this.reportee = reportee;
		this.description = description;
		this.severity = severity;
		this.status = status;
	}
	@Override
	public String toString() {
		return "[id= "+id+",assignee= "+assignee+",reportee= "+reportee+",description= "+description+",severity= "+severity+",status= "+status+"]"+'\n';
	}
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}
