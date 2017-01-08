package com.groupDev.MesEncheres.usersTypes;




import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;


@Entity
public class ProfessionnalUser extends User {
	
	private static final long serialVersionUID = 1L;
	@Column(nullable=false,length=20)
	private String compagny_name;
	@Column(nullable=false,length=50)
	private String compagny_adress;
	@Column(nullable=false,length=20)
	private int postal_code;
	@Column(nullable=false,length=15)
	private String city;
	@Column(nullable=false,length=20)
	private String activity_domain;


	public String getCompagny_name() {
		return compagny_name;}
	public void setCompagny_name(String compagny_name) {
		this.compagny_name = compagny_name;}
	public String getCompagny_adress() {
		return compagny_adress;}
	public void setCompagny_adress(String compagny_adress) {
		this.compagny_adress = compagny_adress;}
	public int getPostal_code() {
		return postal_code;}
	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;}
	public String getCity() {
		return city;}
	public void setCity(String city) {
		this.city = city;}
	public String getActivity_domain() {
		return activity_domain;}
	public void setActivity_domain(String activity_domain) {
		this.activity_domain = activity_domain;}

	@Override
	public String toString() {
		return "ProfessionnalUser [compagny_name=" + compagny_name + ", compagny_adress=" + compagny_adress
				+ ", postal_code=" + postal_code + ", city=" + city + ", activity_domain=" + activity_domain + "]";}

	public ProfessionnalUser(){

	}
	public ProfessionnalUser(int id, String username, String password, String surname, String firstname, String adress,
			int postal_code, String city, String pays, String email, Date birthdayDate, int phoneNumber,
			String compagny_name, String compagny_adress, int postal_code2, String city2, String activity_domain) {
		super(id, username, password, surname, firstname, adress, postal_code, city, pays, email, birthdayDate,
				phoneNumber);
		this.compagny_name = compagny_name;
		this.compagny_adress = compagny_adress;
		postal_code = postal_code2;
		city = city2;
		this.activity_domain = activity_domain;
	}
}

