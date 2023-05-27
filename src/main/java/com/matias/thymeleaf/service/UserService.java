package com.matias.thymeleaf.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.matias.thymeleaf.model.UserEntity;
import com.matias.thymeleaf.repository.IUserRepository;
import com.matias.thymeleaf.service.abs.IUserService;

@Service
public class UserService implements IUserService {

  @Autowired
  private IUserRepository userRepository;

  @Override
  public List<UserEntity> getAll() {
    return userRepository.findAll();
  }

}
