package org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser.repository;

import org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser.model.Guide;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by codecadet on 17/04/2019.
 */
public interface GuideRepository extends JpaRepository<Guide, Long> {
}
