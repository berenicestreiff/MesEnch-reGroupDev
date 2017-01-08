package com.groupDev.MesEncheres.usersTypes;



import javax.persistence.Column;
import javax.persistence.Entity;



@Entity
public class AdminUsers extends User {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Column(nullable=false,length=15)
	private String admin_name;
	public String getAdmin_name() {
		return admin_name;}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;}

	public AdminUsers(){this("");}
	public AdminUsers(String string) {
		// TODO Auto-generated constructor stub
	}


	}

	
	



