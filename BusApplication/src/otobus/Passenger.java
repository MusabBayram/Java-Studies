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
public class Passenger {

    public Passenger(String name, String surname, boolean gender, int countryCode, String number) {
        phone = new Phone(countryCode, number);
        this.name = name;
        this.surname = surname;
        this.gender = gender;
        this.id = ++lastID;
    }
    static int lastID;
    
    private int id;

    public int getid() {
        return id;
    }
    private String name;
    private String surname;
    private boolean gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }
    public Phone phone;
}
