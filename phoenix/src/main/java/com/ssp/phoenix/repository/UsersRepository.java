package com.ssp.phoenix.repository;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.ssp.phoenix.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {

	Users findByUser_id(String user_id);

	@Modifying
	@Transactional
	@Query(value = "delete from Users u where u.USER_ID = ?1", nativeQuery = true)
	void deleteByUser_id(String user_id);

	@Modifying
	@Transactional
	@Query(value = "update Users p set p.PHONE_NUMBER = :mobileNumber,p.BLOOD_GROUP = :bloodGroup,"
			+ "p.EMAIL = :email,p.AGE = :age,p.PASSWORD = :password,p.ADDRESS = :address,p.NAME = :name "
			+ "where p.USER_ID = :userId", nativeQuery = true)
	void updateUser(@Param("mobileNumber") String mobileNumber, @Param("bloodGroup") String bloodGroup,
			@Param("email") String email, @Param("age") String age, @Param("password") String password,
			@Param("address") String address, @Param("name") String name, @Param("userId") String userId);

	@Modifying
	@Transactional
	@Query(value = "select * from Users u where u.BLOOD_GROUP = :bloodGroup and u.address = :address", nativeQuery = true)
	Collection<Users> getBloodFinderUsers(@Param("bloodGroup") String bloodGroup, @Param("address") String address);

	@Modifying
	@Transactional
	@Query(value = "insert into Blood_Finder_History(REQUESTER_NAME,BLOOD_GROUP,REQUESTER_MOBILE,NOTE, ADDRESS) values(:name,:bloodGroup,:mobileNumber,:note,:address)", nativeQuery = true)
	void insertBloodFinderHistoryTbl(@Param("name") String name, @Param("bloodGroup") String bloodGroup,
			@Param("mobileNumber") String mobileNumber, @Param("note") String note, @Param("address") String address);

}
