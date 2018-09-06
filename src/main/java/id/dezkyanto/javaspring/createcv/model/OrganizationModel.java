package id.dezkyanto.javaspring.createcv.model;

import java.util.Date;

public class OrganizationModel {

	private String organizationName;
	private Date start;
	private Date end;
	private String description;

	public OrganizationModel(String organizationName, Date start, Date end, String description) {
		super();
		this.organizationName = organizationName;
		this.start = start;
		this.end = end;
		this.description = description;
	}

	public OrganizationModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public Date getStart() {
		return start;
	}

	public void setStart(Date start) {
		this.start = start;
	}

	public Date getEnd() {
		return end;
	}

	public void setEnd(Date end) {
		this.end = end;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Organization [organizationName=" + organizationName + ", start=" + start + ", end=" + end
				+ ", description=" + description + "]";
	}

}
