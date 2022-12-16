package BlockbusterAssisgnment;
import java.util.ArrayList;

public abstract class Movie {
	
	String title;
	public int runTime;
	public abstract void play();
	ArrayList<String> scenes = new ArrayList<>();
	
	public String getTitle() {
		return title;
	}
		
		public void setTitle(String title) {
			this.title = title;
		}
	
		public String printInfo() {
			return "Movie title =" + title + runTime; 
		}
		public void printScenes() {
			for(int i=0; i <scenes.size(); i++) {
				System.out.println(i + ". " + scenes.get(i));
			}
		}

		
}


////
//Fields + constructor, getters, 
//- title
//-runtTime
//-scenes
//Methods (normal)
//- printInfo
//-printScenes
//Abstract method: play
