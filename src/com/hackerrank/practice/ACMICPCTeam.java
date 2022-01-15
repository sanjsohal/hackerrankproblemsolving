package com.hackerrank.practice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ACMICPCTeam {
	public static void main(String...args) {
		
	}
	public static List<Integer> acmTeam(List<String> topic) {
	    List<Integer> listToReturn = new ArrayList<>(2);
	    Map<String,Integer> teamsWithKnownTopics = new HashMap<>();
	    for(int i = 0;i<topic.size();i++) {
	    	for(int j = i+1;j<topic.size();j++) {
	    		String topicOfFirstTeam = topic.get(i);
	    		String topicOfSecondTeam = topic.get(j);
	    		int countOfTopicsOfTeam=0;
	    		for(int k = 0;k<topicOfFirstTeam.length();k++) {
	    			if(topicOfFirstTeam.charAt(k)=='1' || topicOfSecondTeam.charAt(k)=='1') {
	    				countOfTopicsOfTeam++;
	    			}
	    		}
	    		teamsWithKnownTopics.put(i+"_"+j, countOfTopicsOfTeam);
	    	}
	    }
	    int maximumTopics = 0;
	    for(Map.Entry<String, Integer> map:teamsWithKnownTopics.entrySet()) {
	    	if(map.getValue()>maximumTopics) {
	    		maximumTopics = map.getValue();
	    	}
	    }
	    int numberOfTeams = 0;
	    for(Map.Entry<String, Integer> map:teamsWithKnownTopics.entrySet()) {
	    	if(map.getValue()==maximumTopics) {
	    		numberOfTeams++;
	    	}
	    }
		return null;
	}
}
