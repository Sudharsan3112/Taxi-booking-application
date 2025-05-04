package Taxi;

import java.util.ArrayList;
import java.util.Scanner;

public class TaxiBookApp {
    static ArrayList<Taxi>taxilist=new ArrayList<>();
    static ArrayList<Taxi>taxiBookingHistory=new ArrayList<>();
    static int CustomerId=1;
    static int taxis=4;

    public static String bookTaxi(char pickupLocation,char dropLocation,int pickuptime) throws CloneNotSupportedException {
        while (taxilist.size()<taxis)
        {
            taxilist.add(new Taxi());
        }
        Taxi taxiReady=null;
        int minDistance=Integer.MAX_VALUE;
        for(Taxi t:taxilist)
        {
            if(t.getDropTime()<=pickuptime)
            {
                int distance=Math.abs(pickupLocation-t.getCurrentLocation());
                if(distance<minDistance||((distance==minDistance)&&(t.getEarnings()<(taxiReady!=null?taxiReady.getEarnings():Integer.MAX_VALUE))))
                {
                    taxiReady=t;
                    minDistance=distance;
                }
            }

        }
        if(taxiReady!=null)
        {
            int traveltime=Math.abs(pickupLocation-dropLocation);
            taxiReady.setTaxiId(taxilist.indexOf(taxiReady)+1);
            taxiReady.setPickUpTime(pickuptime);
            taxiReady.setPickUpLocation(pickupLocation);
            taxiReady.setCustomerId(CustomerId++);
            taxiReady.setCurrentLocation(dropLocation);
            taxiReady.setDropLocation(dropLocation);
            taxiReady.setDropTime(pickuptime+traveltime);
            taxiReady.setEarnings(taxiReady.getEarnings()+((traveltime*15-5)*10)+100);
            taxiBookingHistory.add((Taxi)taxiReady.clone() );
        }
        return (taxiReady!=null)?"Taxi number"+taxiReady.getTaxiId()+" is booked":"Taxi not available";
    }

    static void display()
    {
        System.out.println("- - - - - - - - - ");
         for (Taxi i:taxiBookingHistory)
         {
             System.out.println(i.toString());
             System.out.println("- - - - - - - - - ");
         }
    }

    public static void main(String[] args)throws CloneNotSupportedException {
        Scanner z=new Scanner(System.in);
        boolean loop=true;
        while (loop) {
            System.out.println("1. For Booking Taxi\n2. Displaying TaxiBookings History\n3. Exit");
            System.out.println("Enter Your Choice:");
            int choice = z.nextInt();
            switch (choice) {
                case 1: {
                    System.out.println("Enter pick up Location");
                    char pickup = z.next().charAt(0);
                    System.out.println("Enter Drop Location");
                    char drop = z.next().charAt(0);
                    System.out.println("Enter Pickup Time");
                    int time = z.nextInt();
                    System.out.println(bookTaxi(pickup, drop, time));
                    break;
                }
                case 2: {
                    display();
                    break;
                }
                case 3:
                    loop = false;
                    System.out.println("thank you !!");
                    break;
            }
        }
    }
}
