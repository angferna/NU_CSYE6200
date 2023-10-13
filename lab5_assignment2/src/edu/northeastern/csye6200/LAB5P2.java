
package edu.northeastern.csye6200;

public class LAB5P2 {
	public static void main(String[] args){
		// TODO: write your code here
		RoomPeople A = new RoomPeople();
		RoomPeople B = new RoomPeople();
		
		System.out.println("Add two to room a and three to room b");
		A.addOneToRoom();
		A.addOneToRoom();
		System.out.println("Room a holds " + A.getNumber());
		B.addOneToRoom();
		B.addOneToRoom();
		B.addOneToRoom();
		System.out.println("Room b holds " + B.getNumber());
		System.out.println("Total in all rooms is " + RoomPeople.getTotal());

        System.out.println();
        
		System.out.println("Remove two from both rooms");
		A.removeOneFromRoom();
		A.removeOneFromRoom();
		System.out.println("Room a holds " + A.getNumber());
		B.removeOneFromRoom();
		B.removeOneFromRoom();
		System.out.println("Room b holds " + B.getNumber());
		System.out.println("Total in all rooms is " + RoomPeople.getTotal());

        System.out.println();
        
		System.out.println("Remove two from room a (should not change the values)");
		A.removeOneFromRoom();
		A.removeOneFromRoom();
		System.out.println("Room a holds " + A.getNumber());
		System.out.println("Room b holds " + B.getNumber());
		System.out.println("Total in all rooms is " + RoomPeople.getTotal());
	}
}

class RoomPeople {
    
	// TODO: write your code here
	int numberInRoom; //the number of people in a room
	static int totalNumber; //the total number of people in all rooms as a static variable
    
    public static int getTotal(){ //a static method that returns the total number of people
    	// TODO: write your code here
    	return totalNumber;
    }
    
    public RoomPeople() { //returns the number of people in the room - constructor?
    	// TODO: write your code here
    	numberInRoom = 0;
    }
    
    public void addOneToRoom(){ //adds a person to the room and increases the value of totalNumber
    	// TODO: write your code here
    	numberInRoom++;
    	totalNumber++;
    	
    }
    
    public void removeOneFromRoom(){ //removes a person from the room, ensuring that numberInRoom does not go below zero,
    	//and decreases the value of totalNumber as needed
    	// TODO: write your code here
    	if(numberInRoom > 0) { // not 1 because 0 is inclusive
	    	numberInRoom--;
	    	totalNumber--;
    	}
    }
    
    public int getNumber(){ //returns the number of people in the room
    	// TODO: write your code here
        return numberInRoom;
    }
}   
