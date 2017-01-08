package com.groupDev.MesEncheres.actions;
import org.springframework.beans.factory.annotation.Autowired;
import com.groupDev.MesEncheres.repositories.Group_Repository;
import com.groupDev.MesEncheres.usersTypes.Group;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class Group_Action extends ActionSupport implements ModelDriven <Group>{
	// Model driven = interface permettant d'implémenter plus facilement les objets



	private static final long serialVersionUID = 1L;


	private int id;
	private String label;

	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public String getLabel() {
		return label;}
	public void setLabel(String label) {
		this.label = label;}

	private Group group;

	public Group getGroup() {
		return group;}
	public void setGroup(Group group) {
		this.group = group;}

	@Autowired
	private Group_Repository grouprepositories;

	public Group_Repository getGrouprepository() {
		return grouprepositories;}
	public void setGrouprepository(Group_Repository grouprepository) {
		this.grouprepositories = grouprepository;}

	private Iterable <Group> groups;

	public Iterable<Group> getGroups() {
		return groups;}
	public void setGroups(Iterable<Group> groups) {
		this.groups = groups;}

	
	
	
	
	
	public String liste() {
		groups = grouprepositories.findAll();
		return SUCCESS;}
	public String findOne() {
		Group group = grouprepositories.findOne(getId());
		return SUCCESS;}
	public String save() {
		Group g = new Group(getId(), getLabel());
		Group group = grouprepositories.save(g);
		return SUCCESS;
	}
	
	//String show(){ ??
	
	@Override
	public Group getModel() {
		// TODO Auto-generated method stub
		return null;
	}
}



