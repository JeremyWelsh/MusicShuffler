package loader;

import java.util.ArrayDeque;

import items.Song;

/**
 * Song loader class
 * @author jdog0
 *
 */
public class SongLoader {
	public ArrayDeque<Song> loadQueue(){
		ArrayDeque<Song> mainQueue = new ArrayDeque<Song>();
		// substitute for loading actual songs atm
		mainQueue.add(new Song("DNB1"));
		mainQueue.add(new Song("DNB2"));
		mainQueue.add(new Song("HOUSE1"));
		mainQueue.add(new Song("HOUSE2"));
		
		return mainQueue;
		
		
		
	}
}
