package com.groupDev.MesEncheres.auctions;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.groupDev.MesEncheres.usersTypes.User;

// reste un pb de mapping entre les classes auction et picture
@Entity
public class Auction implements Serializable {
 
	private static final long serialVersionUID = 1L;
	private int id;
	@Column(nullable=false)
	private String designation;
	@Column(nullable=false)
	private String description;
	@Column(nullable=false)
	private String dimensions;
	@Temporal(TemporalType.DATE)
	private Date start_date;
	@Temporal(TemporalType.DATE)

	@Column(nullable=false)
	private Date end_date;

	@Column(nullable=false)
	private double base_price;
	private double end_price;
	private String currency;
	
	
	private Set <Tag>tags;
	private Categorie categories;
	private Set <Picture> pictures;
	private Set <User> users;

	@Id @GeneratedValue
	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public String getDesignation() {
		return designation;}
	public void setDesignation(String designation) {
		this.designation = designation;}
	public String getDescription() {
		return description;}
	public void setDescription(String description) {
		this.description = description;}
	public String getDimensions() {
		return dimensions;}
	public void setDmensions(String dimensions) {
		this.dimensions = dimensions;}
	public Date getStart_date() {
		return start_date;}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;}
	public Date getEnd_date() {
		return end_date;}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;}
	public double getBase_price() {
		return base_price;}
	public void setBase_price(double base_price) {
		this.base_price = base_price;}
	public double getEnd_price() {
		return end_price;}
	public void setEnd_price(double end_price) {
		this.end_price = end_price;}
	
	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	@ManyToMany
	public Set<Tag> getTags() {
		return tags;}
	public void setTags(Set<Tag> tags) {
		this.tags = tags;}
	@ManyToOne
	public Categorie getCategories() {
		return categories;}
	public void setCategories(Categorie categories) {
		this.categories = categories;}
	@OneToMany//(mappedBy="auctions")
	public Set<Picture> getPictures() {
		return pictures;}
	public void setPictures(Set<Picture> pictures) {
		this.pictures = pictures;}

	public Auction() { this(0, "", "","",null,null,0,0,"");}
	


	public Auction(int id, String designation, String description, String dimensions, Date start_date, Date end_date,
			double base_price, double end_price, String currency) {

		this.id = id;
		this.designation = designation;
		this.description = description;
		this.dimensions = dimensions;
		this.start_date = start_date;
		this.end_date = end_date;
		this.base_price = base_price;
		this.end_price = end_price;
		this.currency = currency;
	
	}

	@ManyToMany
	public Set<User> getUsers() {
		return users;}

	public void setUsers(Set<User> users) {
		this.users = users;}
}




