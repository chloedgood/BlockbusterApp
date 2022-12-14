package BlockbusterAssisgnment;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.jupiter.api.Test;

class MovieTests {

	 @Test
	    void testDVD () {
	        ArrayList<String> DVD = new ArrayList<>(Arrays.asList());

	        DVD dvd1 = new DVD();
	        dvd1.title = "Spongebob Squarepants Movie";

	      assertEquals("Spongebob Squarepants Movie", dvd1.title);
	    }
	 
	 @Test
	    void testDVDTitleSetter() {

	        ArrayList<String> DVD = new ArrayList<>(Arrays.asList());

	        DVD dvd1 = new DVD();
	        dvd1.title ="Spongebob";

	       assertEquals("Spongebob",dvd1.title);
	    }

	    @Test
	    void testDVDRuntimeSetter() {

	        ArrayList<String> DVD = new ArrayList<>(Arrays.asList());

	        Movie dvd1 = new DVD();
	        dvd1.title = "Spongebob Squarepants Movie";
	        dvd1.runTime = 130;

	       assertEquals(130, dvd1.runTime);
	    }

	    @Test
	    void testVHSInstance() {

	        ArrayList<String> VHS = new ArrayList<>(Arrays.asList());

	        VHS vhs1 = new VHS();
	        vhs1.title = "Lion King";
	        vhs1.runTime = 130;
	        vhs1.scenes.add("Mufasa dies");
	        vhs1.play();

	        assertEquals(0, vhs1.currentTime);
	    }

	    @Test
	    void testVHSTitleSetter() {

	        ArrayList<String> VHS = new ArrayList<>(Arrays.asList());

	        VHS vhs1 = new VHS();
	        vhs1.title = "Lion King";
	        vhs1.runTime = 130;
	        vhs1.scenes.add("Simba becomes king of pride rock");
	        vhs1.title ="A";

	      assertEquals("A", vhs1.title);
	    }

	    @Test
	    void testVHSRuntimeSetter() {

	        ArrayList<String> VHS = new ArrayList<>(Arrays.asList());

	        Movie vhs1 = new VHS();
	        vhs1.title = "Lion King";
	        vhs1.runTime = 130;
	        vhs1.scenes.add("Simba becomes king of pride rock");
	        vhs1.runTime = 100;

	       assertEquals(100, vhs1.runTime);
	    }

	    @Test
	    void testVHSCurrentTime() {

	        ArrayList<String> VHS = new ArrayList<>(Arrays.asList());

	        VHS vhs1 = new VHS();
	        vhs1.title = "Lion King";
	        vhs1.runTime = 130;
	        vhs1.scenes.add("Simba becomes king of pride rock");
	        vhs1.currentTime=0;

	        assertEquals(0, vhs1.currentTime);
	    }

	    @Test
	    void testVHSPlayMethod() {

	        ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList());

	        VHS vhs1 = new VHS();
	        vhs1.title = "Lion King";
	        vhs1.runTime = 130;
	        vhs1.scenes.add("Simba becomes king of pride rock");
	        vhs1.play();
	        vhs1.play();
	        vhs1.play();

	        assertEquals(0, vhs1.currentTime);
	    }

	    @Test
	    void testVHSRewindMethod() {

	        ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList());

	        VHS vhs1 = new VHS();
	        vhs1.title = "Lion King";
	        vhs1.runTime = 130;
	        vhs1.scenes.add("Simba becomes king of pride rock");
	        vhs1.rewind();


	        assertEquals(0, vhs1.currentTime);
	    }

	    @Test
	    void testVHSRewindMethod2() {

	        ArrayList<String> TILLScenes = new ArrayList<>(Arrays.asList());

	        VHS vhs1 = new VHS();
	        vhs1.title = "Lion King";
	        vhs1.runTime = 130;
	        vhs1.scenes.add("Simba becomes king of pride rock");
	        vhs1.play();
	        vhs1.play();
	        vhs1.play();
	        vhs1.play();

	        assertEquals(0, vhs1.currentTime);
	    }

	
	}
	 
	
	
	


