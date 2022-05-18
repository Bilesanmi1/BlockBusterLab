package BlockBusterLab;
import java.util.Scanner;
import java.util.ArrayList;

public class BlockBusterApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int choice;
				
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		ArrayList<String> scenes1 = new ArrayList<String>();
		ArrayList<String> scenes2 = new ArrayList<String>();
		ArrayList<String> scenes3 = new ArrayList<String>();
		ArrayList<String> scenes4 = new ArrayList<String>();
		ArrayList<String> scenes5 = new ArrayList<String>();
		ArrayList<String> scenes6 = new ArrayList<String>();
		scenes1.add("Part1");
		scenes1.add("Part2");
		scenes1.add("Part3");
		scenes2.add("Start");		
		scenes2.add("Middle");
		scenes2.add("End");
		scenes3.add("Beg");		
		scenes3.add("Mid");
		scenes3.add("Ending");
		scenes4.add("Scene1");
		scenes4.add("Scene2");
		scenes4.add("Scene3");
		scenes5.add("Start");		
		scenes5.add("Middle");
		scenes5.add("End");
		scenes6.add("Beg");		
		scenes6.add("Mid");
		scenes6.add("Ending");
		movieList.add(new VHS(scenes1, "Movie1", 40));
		movieList.add(new VHS(scenes2, "Movie2", 50));
		movieList.add(new VHS(scenes3, "Movie3", 60));
		movieList.add(new DVD(scenes4, "Movie4", 70));
		movieList.add(new DVD(scenes5, "Movie5", 80));
		movieList.add(new DVD(scenes6, "Movie6", 90));
		
		for(Movie movie :movieList) {
			movie.printInfo();
		}
		System.out.println("What movie would you like to watch. (1-6)");
		choice = input.nextInt();
		
		
		
		
		
		
	}

}
