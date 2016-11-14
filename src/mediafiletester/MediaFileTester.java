
package mediafiletester;


public class MediaFileTester {

    
    public static void main(String[] args) {

        Song s = new Song("Ashley", "Hip hop", 360, 3, "Big Sean");
        s.describe();
        
        Song[] myPlayList = new Song[2];
        myPlayList[0] = new Song("Yo!", "Hip hop", 490, 1, "Math Attack Schattman");
        myPlayList[1] = s;
        
        for (int i = 0; i < myPlayList.length; i++) {
            myPlayList[i].describe();
            
        }
        
    }
}
