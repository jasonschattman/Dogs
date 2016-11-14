/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediafiletester;

/**
 *
 * @author schattj
 */
public class Song extends MediaFile {
    
    String artist;
    
    public Song (String t, String g, int l, int r, String a) {
        super(t, g, l, r);
        this.artist = a;
    }
    
    public void describe() {
        super.describe();
        System.out.println("Artist: " + artist);
    }
    
}
