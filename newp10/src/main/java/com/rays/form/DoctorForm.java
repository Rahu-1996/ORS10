package com.rays.form;

import java.util.Date;

import javax.persistence.Column;
import javax.validation.constraints.NotEmpty;

import com.rays.common.BaseDTO;
import com.rays.common.BaseForm;
import com.rays.dto.DoctorDTO;

public class DoctorForm extends BaseForm {

	@NotEmpty(message = "Docter Name is required")
	private String name;

	@NotEmpty(message = "Date Of Birth is required")
	private Date dateOfBirth;

	@NotEmpty(message = "Mobile No is required")
	private long mobile;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getMobile() {
		return mobile;
	}

	public void setMobile(long mobile) {
		this.mobile = mobile;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	@NotEmpty(message = "Experties is required")
	private String expertise;

	@Override
	public BaseDTO getDto() {
		DoctorDTO dto = initDTO(new DoctorDTO());
		dto.setName(name);
		dto.setDateOfBirth(dateOfBirth);
		dto.setMobile(mobile);
		dto.setExpertise(expertise);

		return dto;
	}
}
