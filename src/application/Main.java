package application;
import java.io.IOException;
import java.util.*;
import java.util.ArrayDeque;

import items.Song;
import loader.SongLoader;
import renderer.GUI;
import renderer.TextInterface;

/**
 * Main Java class for music Shuffler
 * @author jdog0
 *
 */

public class Main {
	
	public static void main(String [ ] args) throws IOException, InterruptedException
	{
		// create a loader
		SongLoader sLoad = new SongLoader();
		//create the gui
		TextInterface t = new TextInterface();
		
		t.welcomeMessage();
		
		// gotta add playlist bit
		
		// load the songs into the songqueue
		ArrayDeque<Song> SongQueue = sLoad.loadQueue();
		
		
		
		// print out the queue
		System.out.println(SongQueue.toString());
		// to do
		// start off with a list / queue
		// load all songs into the array
		// allow multiple ways of sorting (different classes)
		// gui to show songs with colours etc
		// need song objects 
		// need genres etc
		// do we need artists?
		// show the normal shuffle etc	
		
		
		
	}
	
}
