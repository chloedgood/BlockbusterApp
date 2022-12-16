package BlockbusterAssisgnment;

import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {
	public static void main (String[] args) {
		ArrayList<Movie> movies = new ArrayList<>();
		
		VHS vh1 = new VHS();
        vh1.title = "Field of Dreams";
        vh1.runTime = 130;
        vh1.scenes.add("If you build it they will come");
        vh1.scenes.add("Starts building the ballpark");
        vh1.scenes.add("Players come out of cornfield");
        vh1.scenes.add("Ray learns who his dad is");
        vh1.scenes.add("Ray plays catch with his dad");
        
        VHS vh2 = new VHS();
        vh2.title = "Lion King";
        vh2.runTime = 130;
        vh2.scenes.add("Simba becomes prince");
        vh2.scenes.add("Mufasa dies");
        vh2.scenes.add("Timon and Pumba find Simba");
        vh2.scenes.add("Nala convinces Simba to go home");
        vh2.scenes.add("Simba becomes king of pride rock");
        
        VHS vh3 = new VHS();
        vh3.title = "Twister";
        vh3.runTime = 130;
        vh3.scenes.add("Cast is introduced as scientists");
        vh3.scenes.add("Twister sucks up dorothy machine");
        vh3.scenes.add("Movie theater torn apart");
        vh3.scenes.add("Make dorothy 2.0");
        vh3.scenes.add("Everyone gets rich");
        
        DVD dvd1 = new DVD();
        dvd1.title = "The Pacifier";
        dvd1.scenes.add("Father dies");
        dvd1.scenes.add("Seal sent to live with children");
        dvd1.scenes.add("Seal finds GHOST project");
        dvd1.scenes.add("GHOST goes to government");
        
        DVD dvd2 = new DVD();
        dvd2.title = "Ever After";
        dvd2.scenes.add("Child sent to live with stepmother");
        dvd2.scenes.add("Child meets prince");
        dvd2.scenes.add("Child gets help from Da Vinci");
        dvd2.scenes.add("Child goes to ball");
        dvd2.scenes.add("Child becomes queen");
        
        DVD dvd3 = new DVD();
        dvd3.title = "The Santa Claus 2";
        dvd3.scenes.add("Santa learns he needs to have a wife");
        dvd3.scenes.add("Finds out Charlie on naughty list");
        dvd3.scenes.add("Santa starts dating");
        dvd3.scenes.add("Santa falls for Charlie's principal");
        dvd3.scenes.add("Santa regains North Pole");
        
        
        Scanner scan = new Scanner (System.in);
        System.out.println("Welcome to GC Blockbuster!");
        
        for (Movie movie : movies) {
        	System.out.println((movies.indexOf(movie) + 1) + ")" + movie.getTitle());
        	}
        System.out.println("Please select a movie:");
        int userInput = scan.nextInt();
        Movie movieSelection = movies.get(userInput - 1);
        movieSelection.printInfo();
        System.out.println("Do you want to watch this movie?");
        char userResponse = scan.next().charAt(0);
        if (userResponse == 'y' || userResponse =='Y') {
        	movieSelection.play();
        } else {
        	System.out.println("Bye!");
        }
        	scan.close();
		
	}

}
