package com.enotes.entity;

import java.util.Date;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;



@MappedSuperclass
public class BaseModel
{
	
private boolean isactive;
	
	private boolean isdeleted;
	
	private Integer createdBy;
	
	
	private Date createdOn;
	
	private Integer updatedBy;
	
	private Date updatedOn;

	public BaseModel()
	{
		super();
	}

	public BaseModel(boolean isactive, boolean isdeleted, Integer createdBy, Date createdOn, Integer updatedBy,
			Date updatedOn) {
		super();
		this.isactive = isactive;
		this.isdeleted = isdeleted;
		this.createdBy = createdBy;
		this.createdOn = createdOn;
		this.updatedBy = updatedBy;
		this.updatedOn = updatedOn;
	}

	public boolean isActive() {
		return isactive;
	}

	public void setActive(boolean isactive) {
		this.isactive = isactive;
	}

	public boolean isDeleted() {
		return isdeleted;
	}

	public void setDeleted(boolean isdeleted) {
		this.isdeleted = isdeleted;
	}

	public Integer getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Integer createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Integer getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Integer updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	
	
     
}
