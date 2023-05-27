package com.matias.thymeleaf.service.abs;

import java.util.List;
import com.matias.thymeleaf.model.UserEntity;

public interface IUserService {

  List<UserEntity> getAll();
  
}
