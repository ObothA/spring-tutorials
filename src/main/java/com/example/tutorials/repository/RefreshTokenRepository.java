package com.example.tutorials.repository;

import java.util.Optional;

import com.example.tutorials.model.RefreshToken;
import com.example.tutorials.model.UserModel;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

@Repository
public interface RefreshTokenRepository extends JpaRepository<RefreshToken, Long> {
    Optional<RefreshToken> findByToken(String token);

    Optional<RefreshToken> findByUser(UserModel user);

    Boolean existsByUser(UserModel user);

    @Transactional
    void deleteById(long id);

    int deleteByUser(UserModel user);
}
