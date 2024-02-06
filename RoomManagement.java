package room;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class RoomManagement {
	private ArrayList<room> roomList;
	Scanner dinesh ;
	RoomManagement(){
		roomList = new ArrayList<room>();
		dinesh = new Scanner(System.in);
	}
	public void addRoomMate() {
		System.out.println("enter the id");
		int id = dinesh.nextInt();
		System.out.println("enter the name");
		String name = dinesh.next();
		System.out.println("enter the work");
		String work = dinesh.next();
		room Room = new  room(id, name, work);
		roomList.add(Room);
	}
	public void viewRoomMate() {
		if(roomList.isEmpty()) {
			System.out.println("their is no Roommates are added inthis");
		}else {
			for(room str : roomList) {
				System.out.println(str);
			}
		}
	}
	public static void main(String[] args) {
		RoomManagement roomManagement = new RoomManagement();
		System.out.println("enter the number what you want");
		int choice ;
		do {
			Scanner s = new Scanner(System.in);
			System.out.println("enter the 1 number to add the roommate");
			System.out.println("enter the 2 number to view the roommate");
			System.out.println("enter the 3 number to delect the roommate");
			choice = s.nextInt();
			switch(choice) {
			case 1 : roomManagement.addRoomMate();
			break;
			case 2 : roomManagement.viewRoomMate();
			break;
			default: System.out.println("enter the valid number");
			}
		}while(choice != 4);
	}
}
