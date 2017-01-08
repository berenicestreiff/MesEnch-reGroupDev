package com.groupDev.MesEncheres.actions;

import java.util.Date;

import com.groupDev.MesEncheres.auctions.Auction;
import com.groupDev.MesEncheres.repositories.Auction_Repository;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;


public class Auction_Action  extends ActionSupport implements ModelDriven <Auction>{
		// Model driven = interface permettant d'implémenter plus facilement les objets

	private static final long serialVersionUID = 1L;

	private int id;
	private String designation;
	private String description;
	private String dimensions;
	private Date start_date;
	private Date end_date;
	private double base_price;
	private double end_price;


	private Auction auction;
	
	
	
	public Auction getAuction() {
		return auction;}
	public void setAuction(Auction auction) {
		this.auction = auction;}
	public int getId() {
		return id;}
	public void setId(int id) {
		this.id = id;}
	public String getDesignation() {
		return designation;}
	public void setDesignation(String designation) {
		this.designation = designation;}
	public String getDescription() {
		return description;}
	public void setDescription(String description) {
		this.description = description;}
	public String getDimensions() {
		return dimensions;}
	public void setDimensions(String dimensions) {
		this.dimensions = dimensions;}
	public Date getStart_date() {	return start_date;}
	public void setStart_date(Date start_date) {
		this.start_date = start_date;}
	public Date getEnd_date() {
		return end_date;}
	public void setEnd_date(Date end_date) {
		this.end_date = end_date;}
	public double getBase_price() {
		return base_price;}
	public void setBase_price(double base_price) {
		this.base_price = base_price;}
	public double getEnd_price() {
		return end_price;}
	public void setEnd_price(double end_price) {
		this.end_price = end_price;}


	


	private Auction_Repository auctionrepositories;

	public Auction_Repository getAuctionrepositories() {
		return auctionrepositories;}
	public void setAuctionrepositories(Auction_Repository auctionrepositories) {
		this.auctionrepositories = auctionrepositories;}
	
	private Iterable <Auction> auctions;
	public Iterable<Auction> getAuctions() {
		return auctions;}
	public void setAuctions(Iterable<Auction> auctions) {
		this.auctions = auctions;}

	public String liste() {
		auctions = auctionrepositories.findAll();
		return SUCCESS;}
	public String findOne() {
		auction = auctionrepositories.findOne(getId());
		return SUCCESS;}
	
		@Override
		public String toString() {
			return "Auctions [id=" + id + ", designation=" + designation + ", description=" + description + ", dimensions="
					+ dimensions + ", start_date=" + start_date + ", end_date=" + end_date + ", base_price=" + base_price
					+ ", end_price=" + end_price + "]";}
		@Override
		public Auction getModel() {
			// TODO Auto-generated method stub
			return null;
		}
	

}

	
