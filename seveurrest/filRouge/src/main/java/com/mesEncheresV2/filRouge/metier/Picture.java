package com.mesEncheresV2.filRouge.metier;

import java.io.Serializable;

import javax.persistence.ManyToOne;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Picture implements Serializable{

	private static final long serialVersionUID = 1L;
	private int id;
	@Column(nullable=false, length=50)
	private String title;
	@Column(nullable=false,length=500)
	private String lengend;
	private Auction auctions;


	public Picture(){}


	@Id @GeneratedValue
	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public String getTitle() {
		return title;}
	public void setTitle(String title) {
		this.title = title;}
	public String getLengend() {
		return lengend;}
	public void setLengend(String lengend) {
		this.lengend = lengend;}

	@ManyToOne
	public Auction getAuctions() {
		return auctions;}
	public void setAuctions(Auction auctions) {
		this.auctions = auctions;}

	public Picture(int id, String title, String lengend, Auction auctions) {
		super();
		this.id = id;
		this.title = title;
		this.lengend = lengend;
		this.auctions = auctions;
	}

	@Override
	public String toString() {
		return "Picture [id=" + id + ", title=" + title + ", lengend=" + lengend
				+ ", auctions=" + auctions + "]";
	}


}
