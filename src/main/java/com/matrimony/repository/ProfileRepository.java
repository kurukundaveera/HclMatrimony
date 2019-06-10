package com.matrimony.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.matrimony.entity.Profile;

public interface ProfileRepository extends JpaRepository<Profile, Long> {
	Profile findByProfileId(Integer profileId);

//	@Query(value = "Select d from profile d where d.gender =:profileGender", nativeQuery = true)
//	List<Profile> findAllByProfileGender(String profileGender);

	List<Profile> findByGenderNotLike(String profileGender);
}
