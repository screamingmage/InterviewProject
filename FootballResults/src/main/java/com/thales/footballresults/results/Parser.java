package com.thales.footballresults.results;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

import com.thales.footballresults.model.FootballResults;


public class Parser {
	
	public FootballResults parseResults() throws IOException {
		
		BufferedReader resultsReader = new BufferedReader(new FileReader(new File("results.txt")));
		
		String result;
		while ((result = resultsReader.readLine()) != null) {
			System.out.println(result);
		}
		resultsReader.close();
		
		return new FootballResults();
	}
	
}
