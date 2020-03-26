/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package otobus;

/**
 *
 * @author Musab
 */
public class Seat {
    public Seat() {
        id = ++lastID;
    }

    static int lastID;
    private int id;

    public int getId() {
        return id;
    }
    private Passenger passenger;

    
    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }
}
