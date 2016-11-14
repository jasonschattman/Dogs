
package mediafiletester;


public class MediaFile {

    String title;
    String genre;
    int length;
    int rating;
    
    public MediaFile( String t, String g, int l, int r) {
        this.title = t;
        this.genre = g;
        this.length = l;
        this.rating = r;
    }
    
    public void describe() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Length: " + length);
        System.out.println("Rating: " + rating);
    }
    
}
