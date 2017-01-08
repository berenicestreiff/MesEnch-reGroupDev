package com.groupDev.MesEncheres.actions;
import org.springframework.beans.factory.annotation.Autowired;
import com.groupDev.MesEncheres.repositories.ProfessionnalUser_Repository;
import com.groupDev.MesEncheres.usersTypes.ProfessionnalUser;
import com.opensymphony.xwork2.ActionSupport;


public class ProfessionnalUser_Action  extends ActionSupport {


	private static final long serialVersionUID = 1L;

	private String compagny_name;
	private String compagny_adress;
	private String postal_code;
	private String city;
	private String activity_domain;
	private ProfessionnalUser professionnaluser;

	public ProfessionnalUser getProfessionnaluser() {
		return professionnaluser;}
	public void setProfessionnaluser(ProfessionnalUser professionnaluser) {
		this.professionnaluser = professionnaluser;}

	public String getCompagny_name() {
		return compagny_name;}
	public void setCompagny_name(String compagny_name) {
		this.compagny_name = compagny_name;}
	public String getCompagny_adress() {
		return compagny_adress;}
	public void setCompagny_adress(String compagny_adress) {
		this.compagny_adress = compagny_adress;}
	public String getPostal_code() {
		return postal_code;}
	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;}
	public String getCity() {
		return city;}
	public void setCity(String city) {
		this.city = city;}
	public String getActivity_domain() {
		return activity_domain;}

	@Autowired
	ProfessionnalUser_Repository professionnaluserrepositories;

	public ProfessionnalUser_Repository getProfessionnaluserrepositories() {
		return professionnaluserrepositories;}
	public void setProfessionnaluserrepositories(ProfessionnalUser_Repository professionnaluserrepositories) {
		this.professionnaluserrepositories = professionnaluserrepositories;}

	private Iterable <ProfessionnalUser> professionnalUsers;

	public Iterable<ProfessionnalUser> getProfessionnalUsers() {
		return professionnalUsers;}
	public void setProfessionnalUsers(Iterable<ProfessionnalUser> professionnalUsers) {
		this.professionnalUsers = professionnalUsers;}

	public String liste() {
		professionnalUsers = professionnaluserrepositories.findAll();
		return SUCCESS;}

	public String findOne() {
		professionnaluser = professionnaluserrepositories.findOne(getCompagny_name(),getCompagny_adress(),getPostal_code(), getCity(),getActivity_domain());
		return SUCCESS;}
	public String save() {
		ProfessionnalUser p = new ProfessionnalUser(0, getCompagny_name(),getCompagny_adress(),getPostal_code(), getCity(),getActivity_domain(), 0, activity_domain, activity_domain, activity_domain, null, 0, activity_domain, activity_domain, 0, activity_domain, activity_domain);
		professionnalUsers = (Iterable<ProfessionnalUser>) professionnaluserrepositories.save(p);
		return SUCCESS;}


}










