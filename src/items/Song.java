package items;
/**
 * Song Object Class
 * @author jdog0
 *
 */
public class Song {
	String name;
	public Song(String n) {
		this.name = n;
	}
	@Override
	public String toString() {
		return "Song [name=" + name + "]";
	}
	
}
