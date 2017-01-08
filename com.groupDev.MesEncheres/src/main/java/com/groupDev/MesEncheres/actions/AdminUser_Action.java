package com.groupDev.MesEncheres.actions;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import com.groupDev.MesEncheres.repositories.AdminUsers_Repository;
import com.groupDev.MesEncheres.usersTypes.AdminUsers;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class AdminUser_Action extends ActionSupport implements ModelDriven <AdminUsers>{
// Model driven = interface permettant d'implémenter plus facilement les objets

	private static final long serialVersionUID = 1L;

	private AdminUsers adminuser;
	private int id;
	private String admin_name;
	List <AdminUsers> adminusers;
	
	public List<AdminUsers> getAdminusers() {
		return adminusers;
	}
	public void setAdminusers(List<AdminUsers> adminusers) {
		this.adminusers = adminusers;
	}


	boolean sucessOperation;

	public String getAdmin_name() {
		return admin_name;}
	public void setAdmin_name(String admin_name) {
		this.admin_name = admin_name;}
	public AdminUsers getAdminuser() {
		return adminuser;}
	public void setAdminuser(AdminUsers adminuser) {
		this.adminuser = adminuser;}


	@Autowired
	private AdminUsers_Repository adminuserrepositories;

	public AdminUsers_Repository getAdminuserrepositories() {
		return adminuserrepositories;}
	public void setAdminuserrepositories(AdminUsers_Repository adminuserrepositories) {
		this.adminuserrepositories = adminuserrepositories;}

	private Iterable<AdminUsers> adminUsers;
	public Iterable<AdminUsers> getAdminUsers() {
		return adminUsers;}
	
	String insert(){
		AdminUsers a = adminuserrepositories.save(adminuser);
		boolean isSucessOperation;
		if (a==null)
			isSucessOperation = false;
		return SUCCESS;
	}
	
	String delete(){
		adminuserrepositories.delete(adminusers.getId());
		return SUCCESS;
	}
	
	String update(){
		Article a = articleRepository.save(article);
		if (a==null)
			sucessOperation = false;
		return SUCCESS;
	}
	String show(){
		Article a = articleRepository.findOne(article.getId());
		if (a==null)
			return SUCCESS;
		getModel().setId(a.getId());
		getModel().setDescription(a.getDescription());
		getModel().setEnchereMinimum(a.getEnchereMinimum());
		getModel().setMiseDeDepart(a.getMiseDeDepart());
		getModel().setNom(a.getNom());
		sucessOperation = true;
		return SUCCESS;
	}
	
	public String liste(){
		adminUsers = adminuserrepositories.findAll();
		return SUCCESS;}
	
	public String findOne(){
		adminuser = adminuserrepositories.findOne(getAdmin_name());
		return SUCCESS;}


	@Override
	public AdminUsers getModel() {
		// TODO Auto-generated method stub
		return null;
	}
}



