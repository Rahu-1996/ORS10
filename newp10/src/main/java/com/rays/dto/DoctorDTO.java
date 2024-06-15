package com.rays.dto;

import java.util.Date;
import java.util.LinkedHashMap;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.rays.common.BaseDTO;

@Entity
@Table(name = "st_doctor")
public class DoctorDTO extends BaseDTO {
	@Column(name = "NAME", length = 50)
	private String name;

	@Column(name = "DATE_OF_BIRTH", length = 50)
	private Date dateOfBirth;

	@Column(name = "MOBILE", length = 50)
	private Long mobile;

	@Column(name = "EXPERTISE", length = 50)
	private String expertise;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public Long getMobile() {
		return mobile;
	}

	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}

	public String getExpertise() {
		return expertise;
	}

	public void setExpertise(String expertise) {
		this.expertise = expertise;
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return expertise;
	}

	@Override
	public String getUniqueKey() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public String getUniqueValue() {

		return name;
	}

	@Override
	public String getLabel() {
		// TODO Auto-generated method stub
		return name;
	}

	@Override
	public LinkedHashMap<String, String> orderBY() {
		LinkedHashMap<String, String> map = new LinkedHashMap<>();
		map.put("expertise", "asc");
		return map;
	}

	@Override
	public LinkedHashMap<String, Object> uniqueKeys() {
		LinkedHashMap<String, Object> map = new LinkedHashMap<>();
		map.put("expertise", expertise);
		return map;

	}

}
