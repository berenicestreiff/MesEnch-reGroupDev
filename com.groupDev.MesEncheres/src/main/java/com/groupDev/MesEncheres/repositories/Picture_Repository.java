package com.groupDev.MesEncheres.repositories;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.groupDev.MesEncheres.auctions.Picture;


public interface Picture_Repository 
extends PagingAndSortingRepository<Picture, Integer>, PictureRepositoryCustom
{

}