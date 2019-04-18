package org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser.services;

import org.academiadecodigo.bootcamp.hackathon.showMeTheWorldUser.model.Guide;

import java.util.ArrayList;
import java.util.List;

public class GuideService {

    private List<Guide> guideList = new ArrayList<>();

    public Guide get(Integer id) {
        return guideList.get(id);
    }

    public List<Guide> getAll() {
        return guideList;
    }

    public void add(Guide guide) {
        guideList.add(guide);
    }

    public void remove(Integer id) {
        guideList.remove(id);
    }

    public byte[] getPhoto(Integer id) {
        return new byte[0];
    }
}
