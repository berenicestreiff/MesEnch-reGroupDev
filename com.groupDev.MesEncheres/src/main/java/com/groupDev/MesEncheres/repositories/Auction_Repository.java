package com.groupDev.MesEncheres.repositories;

import org.springframework.data.repository.CrudRepository;

import com.groupDev.MesEncheres.auctions.Auction;


public interface Auction_Repository extends CrudRepository<Auction, Integer> {

}
