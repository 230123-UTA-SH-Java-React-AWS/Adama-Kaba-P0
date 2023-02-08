package com.revature.model;

import java.util.ArrayList;

public class Manager {

    //    //Uniquely identifiable field that is numeric
//    private int pokeId;
//
//    //Fields that will be useful to uniquely identify this object
//    private String name;
//    private int level;
//    private int health;
//    private int damage;
//    private int speed;
//
//    //What data structure allows us to add multiple things
    private List<NewUser> ticket;

    //
    public Manager() {
        this.ticket = new ArrayList<String>();
    }

    //    }
//
//
//    @Override
//    public String toString() {
//        return "Pokemon [abilities=" + abilities + ", damage=" + damage + ", health=" + health + ", level=" + level
//                + ", name=" + name + ", pokeId=" + pokeId + ", speed=" + speed + "]";
//    }
//
//
//    //right click, click source action, click generate getters and setters, select all fields, hit ok

    public List<NewUser> getTicket() {
        return ticket;
    }

    public void setTicket(List<NewUser> ticket) {
        this.ticket = ticket;
    }
}
/* establish an enhanced for loop to iterate through each time the manager sees the request then they will have the
option to either accept or deny depending on the ticket number
 */
