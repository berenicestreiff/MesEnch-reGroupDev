package com.mesEncheresV2.filRouge.metier;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Group {

	private int id;

	@Column(nullable=false,length=20)
	private String label;
	private Set <User> users;

	@Id @GeneratedValue
	public int getId() {	return id;}
	public void setId(int id) {
		this.id = id;}
	public String getLabel() {return label;}
	public void setLabel(String label) {
		this.label = label;}

	@OneToMany
	public Set<User> getUsers() {
		return users;
	}

	public void setUsers(Set<User> users) {
		this.users = users;}
	@Override
	public String toString() {
		return "Groups [id=" + id + ", label=" + label + "]";}

	public Group(int id, String label) {
		super();
		this.id = id;
		this.label = label;
	}

	public Group(){

	}
}



