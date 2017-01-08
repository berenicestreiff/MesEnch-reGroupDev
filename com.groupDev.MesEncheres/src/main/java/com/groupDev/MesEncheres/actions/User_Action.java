package com.groupDev.MesEncheres.actions;

import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;
import com.groupDev.MesEncheres.repositories.User_Repository;
import com.groupDev.MesEncheres.usersTypes.User;
import com.opensymphony.xwork2.ActionSupport;


public class User_Action extends ActionSupport {
	private static final long serialVersionUID = 1L;

	private int id;
	private String username;
	private String password;
	private String surname;
	private String firstname;
	private String adress;
	private int postal_code;
	private String city;
	private String pays;
	private String email;
	private Date birthdayDate;
	private int phoneNumber;
	private User user;


	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public String getUsername() {
		return username;}
	public void setUsername(String username) {
		this.username = username;}
	public String getPassword() {
		return password;}
	public void setPassword(String password) {
		this.password = password;}
	public String getSurname() {
		return surname;}
	public void setSurname(String surname) {
		this.surname = surname;}
	public String getFirstname() {
		return firstname;}
	public void setFirstname(String firstname) {
		this.firstname = firstname;}
	public String getAdress() {
		return adress;}
	public void setAdress(String adress) {
		this.adress = adress;}
	public int getPostal_code() {
		return postal_code;}
	public void setPostal_code(int postal_code) {
		this.postal_code = postal_code;}
	public String getCity() {
		return city;}
	public void setCity(String city) {
		this.city = city;}
	public String getPays() {
		return pays;}
	public void setPays(String pays) {
		this.pays = pays;}
	public String getEmail() {
		return email;}
	public void setEmail(String email) {
		this.email = email;}
	public Date getBirthdayDate() {
		return birthdayDate;}
	public void setBirthdayDate(Date birthdayDate) {
		this.birthdayDate = birthdayDate;}
	public int getPhoneNumber() {
		return phoneNumber;}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;}

	public User getUser() {
		return user;}
	public void setUser(User user) {
		this.user = user;}
	
	@Autowired
	User_Repository userrepositories;

	public User_Repository getUserrepository() {
		return userrepositories;}
	public void setUserrepository(User_Repository userrepository) {
		this.userrepositories = userrepository;}
	public static long getSerialversionuid() {
		return serialVersionUID;}

	private Iterable <User>users;
	public Iterable<User> getUsers() {
		return users;}
	public void setUsers(Iterable<User> users) {
		this.users = users;}

	public String liste() {
		users = userrepositories.findAll();
		return SUCCESS;}
	public String findOne() {
		user = userrepositories.findOne(getId());
		return SUCCESS;}
	public String save() {
		User u = new User(getId(), getUsername(), getPassword(),getSurname(),getFirstname(),getAdress(),getPostal_code(),getCity(),getPays(),getEmail(),getBirthdayDate(),getPhoneNumber());
		user = userrepositories.save(u);
		return SUCCESS;
	}
	

}
	
	
	
	
	


	









