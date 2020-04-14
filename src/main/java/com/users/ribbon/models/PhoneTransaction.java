package com.users.ribbon.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class PhoneTransaction {
	
	@Id
	@GeneratedValue
	private Long id;
	
	public PhoneTransaction() {}
	public PhoneTransaction(Long id, Long fromnumber, Long tonumber, Double amttransfered) {
		super();
		this.id = id;
		this.fromnumber = fromnumber;
		this.tonumber = tonumber;
		this.amttransfered = amttransfered;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getFromnumber() {
		return fromnumber;
	}
	public void setFromnumber(Long fromnumber) {
		this.fromnumber = fromnumber;
	}
	public Long getTonumber() {
		return tonumber;
	}
	public void setTonumber(Long tonumber) {
		this.tonumber = tonumber;
	}
	public Double getAmttransfered() {
		return amttransfered;
	}
	public void setAmttransfered(Double amttransfered) {
		this.amttransfered = amttransfered;
	}
	private Long fromnumber;
	private Long tonumber;
	private Double amttransfered;

}
