package Lib;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

import org.testng.annotations.Test;

import com.sun.jna.platform.win32.WinUser.INPUT;

public class RandomNumber {
	public RandomNumber() {
		
		System.out.println("Question_Number_2");
	}
	@Test
	public static void R_Number() {
		
		List<Integer> randomNumbers= new ArrayList<>();
		for(int i=0;i<15;i++) {
			randomNumbers.add(ThreadLocalRandom.current().nextInt(0, 500));
		}
		
		for(Integer i:randomNumbers) {
			System.out.println(i);
		}
		
		Integer min=Collections.min(randomNumbers);
		System.out.println("Minimum number was: "+ min);


	   	
	   	
   	
		
		}



		  
		
		
		
	}

	
	
	
	
