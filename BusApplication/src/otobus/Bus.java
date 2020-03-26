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
public class Bus {
    private String plate;

    public Bus(String plate, int seatCount) {
        this.plate = plate;
        
        seats = new Seat[seatCount];
        
        for (int i = 0; i < seatCount; i++) {
            seats[i] = new Seat();
        }
    }
    private Seat []seats;

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }
    public void displpayAllSeats(){
        
        for (int i = 0; i < seats.length; i++) {
            System.out.println(seats[i].getId()+ " " + (seats[i].getPassenger()==null ? "Boş": 
                    seats[i].getPassenger().getName()+" "+seats[i].getPassenger().getSurname()));
        }
    }
    
    public void book(int seatsID, Passenger passenger){
        
        for (int i = 0; i < seats.length; i++) {
            if(seats[i].getId() == seatsID && seats[i].getPassenger() ==null){
                seats[i].setPassenger(passenger);
                System.out.println(passenger.getName()+ " " + passenger.getSurname()+ " " +"Booked Seccessfully");
                break;
            }
        }
    }
    
}
