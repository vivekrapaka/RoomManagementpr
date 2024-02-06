package room;

public class room {
	private int id;
	private String name;
	private String work;
	room(int id, String name, String work) {
		
		this.id = id;
		this.name = name;
		this.work = work;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public String toString() {
		return "the id of the person was "+id+" the name of the person "+name+" the work of the person was "+work;
	}
}
