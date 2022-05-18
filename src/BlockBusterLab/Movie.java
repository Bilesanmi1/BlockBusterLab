package BlockBusterLab;

import java.util.ArrayList;

public abstract class Movie {

	String title;
	int runTime;
	ArrayList<String> scenes;
	public void printInfo() {
		System.out.printf("Title: %s\nRunTime: %d\n", title, runTime);
		}
	public void printScenes() {
		for(String scene: scenes) {
			System.out.printf("Scene: %s \nIndex: %d\n\n",scene, scenes.indexOf(scene));		
		}
	}
	public abstract void play();
	
	}


