package com.groupDev.MesEncheres.actions;
import java.awt.Image;
import com.groupDev.MesEncheres.auctions.Picture;
import com.groupDev.MesEncheres.repositories.Picture_Repository;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class Picture_Action extends ActionSupport implements ModelDriven <Picture>{

	
	private static final long serialVersionUID = 1L;
	private int id;
	private String title;
	private String legend;
	private Image picture;
	
	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public String getTitle() {
		return title;}
	public void setTitle(String title) {
		this.title = title;}
	public String getLegend() {
		return legend;}
	public void setLegend(String legend) {
		this.legend = legend;}
	public Image getPicture() {
		return picture;}
	public void setPicture(Image picture) {
		this.picture = picture;}
	

 Picture_Repository picturerepositories;

public Picture_Repository getPicturerepositories() {
	return picturerepositories;}
public void setPicturerepositories(Picture_Repository picturerepositories) {
	this.picturerepositories = picturerepositories;}


private Iterable <Picture> pictures;

public Iterable<Picture> getPictures() {
	return pictures;
}

public void setPictures(Iterable<Picture> pictures) {
	this.pictures = pictures;
}

@Override
public Picture getModel() {
	// TODO Auto-generated method stub
	return null;}
}

	
	
	