package com.thales.footballresults.results;

import org.junit.Test;

import com.thales.footballresults.model.FootballResults;

public class ParserTest {
	
	@Test
	public void testParser() throws Exception {
		Parser parser = new Parser();
		FootballResults footballResults = parser.parseResults();
	}
	
}
