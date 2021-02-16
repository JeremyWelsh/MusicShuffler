package renderer;

import java.util.Scanner;

/**
 * Text Interface Class
 * @author jdog0
 *
 */
public class TextInterface {
	
	// messages for when the app opens
	public static void welcomeMessage() throws InterruptedException {
		Thread.sleep(500);
		System.out.println("Welcome to Music Shuffler by Jeremy Welsh");
		Thread.sleep(1500);
		System.out.println("The aim of this shuffler is to show the effectiveness of different shuffling techniques on music playists");
		Thread.sleep(3250);
	}
	
	// get the user to choose their playlist to shuffle
	public static int choosePlaylist() {
		Scanner s = new Scanner(System.in);
		System.out.println("what Playlist would you like to select?");
		System.out.println("0 = all, 1 = house, 2 = dnb");
		int pNum = s.nextInt();
		if( pNum !=0) {
			pNum = 0;
		}
		return pNum;
		
	}
}
