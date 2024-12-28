package com.nj.simple;
import java.util.*;

class TournamentWinnerSolution1 {
    public static void main(String[] args){
        ArrayList<ArrayList<String>> competitions=new ArrayList<ArrayList<String>>();
        ArrayList<String> group1=new ArrayList<>();
        group1.add("html");
        group1.add("c#");

        ArrayList<String> group2=new ArrayList<>();
        group2.add("c#");
        group2.add("python");

        ArrayList<String> group3=new ArrayList<>();
        group3.add("python");
        group3.add("html");

        competitions.add(group1);
        competitions.add(group2);
        competitions.add(group3);

        ArrayList<Integer> results=new ArrayList<>();
        results.add(0);
        results.add(0);
        results.add(1);

        System.out.println("Winner:"+tournamentWinner(competitions,results));

    }

    public static String tournamentWinner(
            ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results
    ) {
        HashMap<String,Integer> teamScore=new HashMap<String,Integer>();

        for(int i=0;i<competitions.size();i++){
            ArrayList<String> group=competitions.get(i);
            String homeTeam=group.get(0);
            String awayTeam=group.get(1);
            Integer gameResult=results.get(i);
            int homeScore=0; int awayScore=0;
            if(gameResult==1){homeScore=3;}else{awayScore=3;}

            if(teamScore.containsKey(homeTeam)){
                int existingScore=teamScore.get(homeTeam);
                int updatedHomeScore=existingScore+homeScore;
                teamScore.put(homeTeam,updatedHomeScore);
            }else{
                teamScore.put(homeTeam,homeScore);
            }

            if(teamScore.containsKey(awayTeam)){
                int existingScore=teamScore.get(awayTeam);
                int updatedAwayScore=existingScore+awayScore;
                teamScore.put(awayTeam,updatedAwayScore);
            }else{
                teamScore.put(awayTeam,awayScore);
            }
        }

        String maxEntry = Collections.max(teamScore.entrySet(), Map.Entry.comparingByValue()).getKey();
        return maxEntry;
  /*   Integer max = Collections.max(teamScore.values());

    for(Entry<String, Integer> entry : teamScore.entrySet()) {
        Integer value = entry.getValue();
        if(null != value && max == value) {
            maxEntry = entry;
        }*/
    }


  /* int maxValueInMap=(Collections.max(teamScore.values()));  // This will return max value in the HashMap
        for (Entry<String, Integer> entry : teamScore.entrySet()) {  // Iterate through HashMap
            if (entry.getValue()==maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
              return entry.getKey();
            }
        }*/


}
