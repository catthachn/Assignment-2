
public class Car {

    int gear = 1;
    int location;
    int speed = 0;
    int destination = 250;

    void reverseGear (){
        gear = -1;
    }

    void gearUp (){
        if (gear == 6)
            System.out.println("cannot increase gear anymore");

        else if (gear == -1)
            gear = 1;
        else
            gear = gear + 1;
    }

    void gearDown (){
        if (gear == 1)
            System.out.println("cannot decrease gear anymore");
        if (gear == -1)
            System.out.println("cannot decrease gear because gear is in reverse");
        else
        	gear = gear - 1;
    }

    int reportGear(){
        return gear;

    }

    int reportLocation(){
        return location; 
    }

    int reportRemaining(){
        int destination= 250;
        return destination - location;
    }

    void moveByTime (int time){
        if (time < 0);
        System.out.println("time should be positive");
        if (time >= 0)
        speed = gear * 20;
        int delta = speed * time;
        location=location + delta;
    }

    boolean isArrived (){
        if(location >= 250){
            return true;
        }
        else {
            return false;

        }
    }
}
