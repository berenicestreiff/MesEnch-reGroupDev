package com.mesEncheresV2.filRouge.metier;
import java.io.Serializable;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Categorie implements Serializable {

	private static final long serialVersionUID = 1L;
	private int id;

	@Column(nullable=false, length=30)
	private String category_name;
	private Set <Auction>auctions;
	@Id @GeneratedValue
	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public String getCategory_name() {
		return category_name;}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;}

	@OneToMany
	public Set<Auction> getAuctions() {
		return auctions;}
	public void setAuctions(Set<Auction> auctions) {
		this.auctions = auctions;}

	@Override
	public String toString() {
		return "Categories [id=" + id + ", category_name=" + category_name + "]";}
	public Categorie(int id, String category_name, Set<Auction> auctions) {
		super();
		this.id = id;
		this.category_name = category_name;
		this.auctions = auctions;}


	public Categorie(){}

}


