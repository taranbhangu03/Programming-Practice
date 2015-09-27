package com.main;
	import java.io.BufferedReader;
	import java.io.IOException;
	import java.io.InputStreamReader;

	public class InputusingConsole {
	    public static void main(String[] args) throws IOException {

		// Get BufferedReader for System.in.
		BufferedReader in = new BufferedReader(
		    new InputStreamReader(System.in));

		// Read line from console.
		String line = in.readLine();
		System.out.println("You typed " + line);
	    }
	}

