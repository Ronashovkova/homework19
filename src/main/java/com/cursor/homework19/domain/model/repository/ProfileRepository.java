package com.cursor.homework19.domain.model.repository;

import com.cursor.homework19.domain.model.Profile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProfileRepository extends JpaRepository<Profile, Integer> {
    Optional<Profile> findById(Integer id);

    List<Profile> findByUserName(String userName);

    List<Profile> findByJobTitle(String jobTitle);

    List<Profile> findByDepartment(String department);

    List<Profile> findDistinctByCompany (String company);

    List<Profile> findBySkillOrderByDepartment (String skill, String department);

    List<Profile> getAllProfiles();
}
