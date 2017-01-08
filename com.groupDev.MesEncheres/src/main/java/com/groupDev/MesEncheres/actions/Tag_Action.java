package com.groupDev.MesEncheres.actions;

import org.springframework.beans.factory.annotation.Autowired;
import com.groupDev.MesEncheres.auctions.Tag;
import com.groupDev.MesEncheres.repositories.Tag_Repository;
import com.opensymphony.xwork2.ActionSupport;


public class Tag_Action extends ActionSupport  {


	private static final long serialVersionUID = 1L;
	private static final String SUCCESS = null;
	private int id;
	private String tag_name;
	private Tag tag;

	public Tag getTag() {
		return tag;}
	public void setTag(Tag tag) {
		this.tag = tag;}
	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public String getTag_name() {
		return tag_name;}
	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;}

	@Autowired
	Tag_Repository tagrepositories;

	public Tag_Repository getTagrepository() {
		return tagrepositories;}
	public void setTagrepository(Tag_Repository tagrepository) {
		this.tagrepositories = tagrepository;}
	private Iterable <Tag> tags;
	public Iterable<Tag> getTags() {
		return tags;}
	public void setTags(Iterable<Tag> tags) {
		this.tags = tags;}
	public String liste() {
		tags = tagrepositories.findAll();
		return SUCCESS;}
	public String findOne() {
		tag = tagrepositories.findOne(getId());
		return SUCCESS;}
	public String save() {
		Tag t = new Tag(getId(), getTag_name());
		tag = tagrepositories.save(t);
		return SUCCESS;
	}
}


