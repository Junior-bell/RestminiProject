package com.nt.Binding;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ActorData {

	private Integer aid;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
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
	private String aname;
	private String addrs;
	private Double remuneration;
	private String active_SW;
}
