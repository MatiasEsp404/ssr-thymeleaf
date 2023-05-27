package com.matias.thymeleaf.util.seeder;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;
import com.matias.thymeleaf.model.UserEntity;
import com.matias.thymeleaf.repository.IUserRepository;

@Component
public class UserSeeder {

  @Autowired
  private IUserRepository userRepository;
  
  @EventListener
  public void seed(ContextRefreshedEvent event) {
    createUsers();
  }

  private void createUsers() {
    List<UserEntity> users = new ArrayList<>();
    users.add(UserEntity.builder().name("Matias").email("matias@gmail.com").build());
    users.add(UserEntity.builder().name("Fernando").email("fernando@gmail.com").build());
    users.add(UserEntity.builder().name("Jere").email("jere@gmail.com").build());
    users.add(UserEntity.builder().name("Agustin").email("agus@gmail.com").build());
    users.add(UserEntity.builder().name("Emma").email("emma@gmail.com").build());
    userRepository.saveAll(users);
  }
  
}
