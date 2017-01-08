package com.groupDev.MesEncheres.auctions;
import java.io.Serializable;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;
	@Column(nullable=false, length=25)

	private String tag_name;
	private Set <Auction>auctions;

	@Id @GeneratedValue
	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public String getTag_name() {
		return tag_name;}
	public void setTag_name(String tag_name) {
		this.tag_name = tag_name;}

	@ManyToMany
	public Set<Auction> getAuctions() {
		return auctions;}
	public void setAuctions(Set<Auction> auctions) {
		this.auctions = auctions;}
	public Tag(){this(0,"");}

	@Override
	public String toString() {
		return "Tags [id=" + id + ", tag_name=" + tag_name + "]";}


	public Tag(int id, String tag_name) {
		super();
		this.id = id;
		this.tag_name = tag_name;}
}

