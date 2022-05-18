package BlockBusterLab;

import java.util.ArrayList;

public class VHS extends Movie {
	public VHS(ArrayList<String> scenes, String title, int runTime){
		super.scenes = scenes;
		super.title = title;
		super.runTime = runTime;
		
	}
	int currentTime = 0;
	public void play() {
		int maxTime = super.scenes.size();
		if(currentTime < maxTime) {
			System.out.println();super.scenes.get(currentTime);
			currentTime += 1;
		}else {
			rewind();
		}
	}
	public void rewind() {
		currentTime = 0;
	}

}
