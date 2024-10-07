package com.spring.board.vo;

import java.util.Map;

public class CareerVo {

	private String carseq;
	private String seq;
	private String compname;
	private String careerlocation;
	private String startperiod;
	private String endperiod;
	private String task;
	private String salary;
	public String getCarseq() {
		return carseq;
	}
	public void setCarseq(String carseq) {
		this.carseq = carseq;
	}
	public String getSeq() {
		return seq;
	}
	public void setSeq(String seq) {
		this.seq = seq;
	}
	public String getCompname() {
		return compname;
	}
	public void setCompname(String compname) {
		this.compname = compname;
	}
	public String getCareerlocation() {
		return careerlocation;
	}
	public void setCareerlocation(String careerlocation) {
		this.careerlocation = careerlocation;
	}
	public String getStartperiod() {
		return startperiod;
	}
	public void setStartperiod(String startperiod) {
		this.startperiod = startperiod;
	}
	public String getEndperiod() {
		return endperiod;
	}
	public void setEndperiod(String endperiod) {
		this.endperiod = endperiod;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	
	  public static CareerVo fromMap(Map<String, Object> map) {
	        CareerVo careerVo = new CareerVo();
	        careerVo.setCompname((String) map.get("compname"));
	        careerVo.setCareerlocation((String) map.get("careerlocation"));
	        careerVo.setStartperiod((String) map.get("startperiod"));
	        careerVo.setEndperiod((String) map.get("endperiod"));
	        careerVo.setTask((String) map.get("task"));
	        return careerVo;
	    }
}