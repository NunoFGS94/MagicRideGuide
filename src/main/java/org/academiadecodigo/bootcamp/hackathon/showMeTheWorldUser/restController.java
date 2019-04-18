package org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser;

import org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser.model.Guide;
import org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser.model.User;
import org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser.repository.GuideRepository;
import org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * Created by codecadet on 17/04/2019.
 */
@CrossOrigin("*")
@RestController
@RequestMapping("/api")
public class restController {

    @Autowired
    private GuideRepository guideRepository;

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/guides")
    public List<Guide> getAllGuides(){
        return guideRepository.findAll();
    }

    @GetMapping("/guides/{id}")
    public ResponseEntity<Guide> getGuideById(@PathVariable(value = "id") Long guideId) throws Exception{
        Guide guide = guideRepository.findById(guideId).orElseThrow(()-> new Exception("Guide not found"));
        return ResponseEntity.ok().body(guide);
    }

    @PostMapping("/guides")
    public Guide createGuide(@Valid @RequestBody Guide guide){
        return guideRepository.save(guide);
    }

    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }

    @GetMapping("/users/{id}")
    public ResponseEntity<User> getUserById(@PathVariable(value = "id") Long userId) throws Exception{
        User user = userRepository.findById(userId).orElseThrow(()-> new Exception("User notFound"));
        return ResponseEntity.ok().body(user);
    }

    @PostMapping("/users")
    public User createUser(@Valid @RequestBody User user){
        return userRepository.save(user);
    }



}
