package id.dezkyanto.javaspring.createcv.model;

import java.util.Date;

public class EducationModel {

	private String typeOfEducation;
	private String nameOfInstitution;
	private String institutionAddress;
	private Date start;
	private Date end;

	public EducationModel(String typeOfEducation, String nameOfInstitution, String institutionAddress, Date start,
			Date end) {
		super();
		this.typeOfEducation = typeOfEducation;
		this.nameOfInstitution = nameOfInstitution;
		this.institutionAddress = institutionAddress;
		this.start = start;
		this.end = end;
	}

	public EducationModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTypeOfEducation() {
		return typeOfEducation;
	}

	public void setTypeOfEducation(String typeOfEducation) {
		this.typeOfEducation = typeOfEducation;
	}

	public String getNameOfInstitution() {
		return nameOfInstitution;
	}

	public void setNameOfInstitution(String nameOfInstitution) {
		this.nameOfInstitution = nameOfInstitution;
	}

	public String getInstitutionAddress() {
		return institutionAddress;
	}

	public void setInstitutionAddress(String institutionAddress) {
		this.institutionAddress = institutionAddress;
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

	@Override
	public String toString() {
		return "Education [typeOfEducation=" + typeOfEducation + ", nameOfInstitution=" + nameOfInstitution
				+ ", institutionAddress=" + institutionAddress + ", start=" + start + ", end=" + end + "]";
	}

}
