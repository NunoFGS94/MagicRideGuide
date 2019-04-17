package org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser;

import org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser.model.Guide;
import org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser.repository.GuideRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by codecadet on 17/04/2019.
 */
@RestController
@RequestMapping("/api")
public class restController {

    @Autowired
    private GuideRepository guideRepository;

    @GetMapping("/guides")
    public List<Guide> getAllGuides(){
        return guideRepository.findAll();
    }

    @GetMapping("/guides/{id}")
    public ResponseEntity<Guide> getGuideById(@PathVariable(value = "id") Long guideId) throws Exception{
        Guide guide = guideRepository.findById(guideId).orElseThrow(()-> new Exception("User not found"));
        return ResponseEntity.ok().body(guide);
    }

    @PostMapping("/guides")
    public Guide createGuide(@Valid @RequestBody Guide guide){
        return guideRepository.save(guide);
    }


}
