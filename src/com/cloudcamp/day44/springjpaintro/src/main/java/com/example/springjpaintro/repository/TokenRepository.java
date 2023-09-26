package com.example.springjpaintro.repository;

import com.example.springjpaintro.entity.TokenEntity;
import com.example.springjpaintro.entity.UserEntity;
import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TokenRepository extends JpaRepository<TokenEntity, Integer> {

  boolean existsByToken(String token);

  @Transactional
  long deleteByToken(String token);
}
