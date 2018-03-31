package com.cherkashyn.vitalii.computer_shop.rediscount.domain;

// Generated 14.09.2013 14:22:22 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Class generated by hbm2java
 */
@Entity
@Table(name = "CLASS")
public class Class implements java.io.Serializable {

	private int kod;
	private String name;
	private String note;
	private Date dateWrite;

	public Class() {
	}

	public Class(int kod) {
		this.kod = kod;
	}

	public Class(int kod, String name, String note, Date dateWrite) {
		this.kod = kod;
		this.name = name;
		this.note = note;
		this.dateWrite = dateWrite;
	}

	@Id
	@Column(name = "KOD", unique = true, nullable = false)
	public int getKod() {
		return this.kod;
	}

	public void setKod(int kod) {
		this.kod = kod;
	}

	@Column(name = "NAME")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "NOTE")
	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATE_WRITE", length = 19)
	public Date getDateWrite() {
		return this.dateWrite;
	}

	public void setDateWrite(Date dateWrite) {
		this.dateWrite = dateWrite;
	}

}