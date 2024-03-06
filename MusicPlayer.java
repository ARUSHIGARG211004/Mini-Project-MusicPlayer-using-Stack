import java.util.*;

public class MusicPlayer{
    public Stack<String> playlist;
    public Scanner sc;
    
    public MusicPlayer(){
        this.playlist= new Stack<>();
        this.sc=new Scanner(System.in);
    }
    
    public void addSong(String songName){
        playlist.push(songName);
    }
    
    public String playNextSong(){
        if(playlist.isEmpty()){
            return "No playlist available. Playlist is empty";
        }
        return playlist.pop();
    }
    public String currentlyPlayingSong(){
        if(playlist.isEmpty()){
            return "Playlist in empty";
        }
        return playlist.peek();
    }
    public void user(){
        while(true){
            System.out.println("\n1. Add Song\n2. Play next Song\n3. Currently Playing\n4. Exit");
            System.out.print("Enter your choice:");
            
            int choice;
        try {
            choice = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid integer choice.");
            sc.nextLine(); 
            continue; 
        }
        
        sc.nextLine();
            
            switch(choice){
                case 1:
                    System.out.print("Enter song name to add:");
                    String songName=sc.nextLine();
                    addSong(songName);
                    break;
                case 2:
                    System.out.println("playing next:"+playNextSong());
                    break;
                case 3:
                    System.out.println("Currently Playing"+currentlyPlayingSong());
                    break;
                case 4:
                    System.out.println("Exiting....");
                    sc.close();
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
                
                
            }
        }
    

	public static void main(String[] args) {
		MusicPlayer play=new MusicPlayer();
		play.user();
		
	}
}
