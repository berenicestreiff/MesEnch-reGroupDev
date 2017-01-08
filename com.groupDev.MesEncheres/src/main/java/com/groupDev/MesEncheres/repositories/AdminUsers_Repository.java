package com.groupDev.MesEncheres.repositories;

import org.springframework.data.repository.CrudRepository;

import com.groupDev.MesEncheres.usersTypes.AdminUsers;


public interface AdminUsers_Repository extends CrudRepository <AdminUsers, Integer> {

	AdminUsers findOne(String admin_name);



}
