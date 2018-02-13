package unityltd.houseinspection.Model;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by mo on 2/13/18.
 */

public class Report {

    private House house;
    private Date date;
    private ArrayList<Room> rooms;

    public Report(House house, Date date) {
        this.house = house;
        this.date = date;
    }

    public House getHouse() {
        return house;
    }

    public void setHouse(House house) {
        this.house = house;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    public void setRooms(ArrayList<Room> rooms) {
        this.rooms = rooms;
    }

    public void addRoom(String name){
        Room room = new Room(name);
        this.rooms.add(room);
    }
}
