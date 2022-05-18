package BlockBusterLab;
import java.util.ArrayList;
import java.util.Scanner;
public class DVD extends Movie{
public	DVD(ArrayList<String> scenes, String title, int runTime){
		super.scenes = scenes;
		super.title = title;
		super.runTime = runTime;
		
	}
	Scanner input = new Scanner(System.in);
	public void play() {
		System.out.println("What Scene would you like to watch(Enter index)");
		printScenes();
		int index = input.nextInt();
		System.out.println(super.scenes.get(index));		
	}
	
	

}
