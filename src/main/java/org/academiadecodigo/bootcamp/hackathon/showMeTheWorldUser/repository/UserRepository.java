package org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser.repository;

import org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by codecadet on 17/04/2019.
 */
public interface UserRepository extends JpaRepository<User, Long>{
}
