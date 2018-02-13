package unityltd.houseinspection.Model;

import android.media.Image;

import java.util.ArrayList;

/**
 * Created by mo on 2/13/18.
 */

public class Room {
    private String name;
    private ArrayList<Image> photos;
    private String comments;

    public Room(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Image> getPhotos() {
        return photos;
    }

    public void setPhotos(ArrayList<Image> photos) {
        this.photos = photos;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public void addPhoto(Image photo){
        this.photos.add(photo);
    }

    public void deletePhoto(int index){
        this.photos.remove(index);
    }

}
