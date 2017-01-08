package com.groupDev.MesEncheres.repositories;

import org.springframework.data.repository.CrudRepository;

import com.groupDev.MesEncheres.usersTypes.ProfessionnalUser;


public interface ProfessionnalUser_Repository extends CrudRepository <ProfessionnalUser, Integer> {

	ProfessionnalUser findOne(String compagny_name, String compagny_adress, String postal_code, String city,
			String activity_domain);

}
