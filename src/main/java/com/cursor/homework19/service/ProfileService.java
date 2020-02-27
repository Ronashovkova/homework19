package com.cursor.homework19.service;

import com.cursor.homework19.domain.model.Profile;
import com.cursor.homework19.domain.model.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProfileService {
    @Autowired
    private final ProfileRepository profileRepository;

    public ProfileService(ProfileRepository profileRepository) {
        this.profileRepository = profileRepository;
    }

    public void save(Profile profile) {
        profileRepository.save(profile);
    }

    public Optional<Profile> findProfileById(Integer id) {
        return profileRepository.findById(id);
    }

    public void removeProfileById(Integer id) {
        profileRepository.deleteById(id);
    }

    public List<Profile> findAll() {
        return profileRepository.findAll();
    }
}
