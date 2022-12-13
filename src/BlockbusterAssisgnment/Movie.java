package BlockbusterAssisgnment;
import java.util.ArrayList;

public abstract class Movie {
	private String title;
	public abstract double runTime();
	public abstract void play();
	ArrayList<String> scenes = new ArrayList<>();
	
		public String getTitle() {
			return title;
		}
		
		public void setTitle(String title) {
			this.title = title;
		}
	
		public String printInfo() {
			return "Movie title =" + getTitle() + runTime(); 
		}
		public String printScenes() {
			return "";
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
