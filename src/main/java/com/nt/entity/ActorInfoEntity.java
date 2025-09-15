package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.Data;

@Entity
@Table(name="REST_ACTORINFO")
@Data
public class ActorInfoEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private  Integer  Aid;
	public Integer getAid() {
		return Aid;
	}
	public void setAid(Integer aid) {
		this.Aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getAddrs() {
		return addrs;
	}
	public void setAddrs(String addrs) {
		this.addrs = addrs;
	}
	public Double getRemuneration() {
		return remuneration;
	}
	public void setRemuneration(Double remuneration) {
		this.remuneration = remuneration;
	}
	public String getActive_SW() {
		return active_SW;
	}
	public void setActive_SW(String active_SW) {
		this.active_SW = active_SW;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public String getUpdatedBy() {
		return updatedBy;
	}
	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}
	public LocalDateTime getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(LocalDateTime creationDate) {
		this.creationDate = creationDate;
	}
	public LocalDateTime getUpdationDate() {
		return updationDate;
	}
	public void setUpdationDate(LocalDateTime updationDate) {
		this.updationDate = updationDate;
	}
	public Integer getUpdationCount() {
		return updationCount;
	}
	public void setUpdationCount(Integer updationCount) {
		this.updationCount = updationCount;
	}
	@Column(length = 30)
	private  String  aname;
	@Column(length = 30)
	private   String  addrs;
	private   Double   remuneration;
	@Column(length = 10)
	private    String  active_SW;
	//meta data
	@Column(length = 30,insertable = true ,updatable = false)
	private    String  createdBy;
	@Column(length = 30,insertable = false,updatable = true)
	private    String   updatedBy;
	@CreationTimestamp
	@Column(updatable = false,insertable = true)
	private    LocalDateTime   creationDate;
	@UpdateTimestamp
	@Column(insertable = false,updatable = true)
	private    LocalDateTime    updationDate;
    @Version
	private   Integer  updationCount;

}

