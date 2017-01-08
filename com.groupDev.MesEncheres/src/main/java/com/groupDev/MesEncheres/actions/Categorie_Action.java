package com.groupDev.MesEncheres.actions;

import org.springframework.beans.factory.annotation.Autowired;
import com.groupDev.MesEncheres.auctions.Categorie;
import com.groupDev.MesEncheres.repositories.Categorie_Repository;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Categorie_Action extends ActionSupport implements ModelDriven <Categorie>{
	// Model driven = interface permettant d'implémenter plus facilement les objets
 
	private static final long serialVersionUID = 1L;
	private int id;
	private String category_name;
	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public String getCategory_name() {
		return category_name;}
	public void setCategory_name(String category_name) {
		this.category_name = category_name;}
	
	private Categorie categories;
	
	public Categorie getCategories() {
		return categories;}
	public void setCategories(Categorie categories) {
		this.categories = categories;}
	
	@Autowired
	private Categorie_Repository categorierepositories;
	
	public Categorie_Repository getCategorierepositories() {
		return categorierepositories;}
	public void setCategorierepositories(Categorie_Repository categorierepositories) {
		this.categorierepositories = categorierepositories;}
	@Override
	public Categorie getModel() {
		// TODO Auto-generated method stub
		return null;
	}


	
}
	
	
