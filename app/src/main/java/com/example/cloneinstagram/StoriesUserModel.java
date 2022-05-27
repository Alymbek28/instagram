package com.example.cloneinstagram;

import java.util.List;

public class StoriesUserModel {
    private String userName;
    private int userImage;
    private List<Integer> images;
    private boolean isAddStory;

    public StoriesUserModel(Boolean isAddStory) {
        this.isAddStory = isAddStory;
    }

    public StoriesUserModel(String userName, int userImage, List<Integer> images, Boolean isAddStory) {
        this.userName = userName;
        this.userImage = userImage;
        this.images = images;
        this.isAddStory = isAddStory;
    }

    public String getUserName() {
        return userName;
    }

    public int getUserImage() {
        return userImage;
    }

    public List<Integer> getImages() {
        return images;
    }

    public Boolean getAddStory() {
        return isAddStory;
    }
}
