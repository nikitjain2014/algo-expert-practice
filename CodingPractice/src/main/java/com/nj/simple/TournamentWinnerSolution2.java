package com.nj.simple;
import java.util.*;
public class TournamentWinnerSolution2 {

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
        String bestTeam="";
        int bestScore=0;
        for(int i=0;i<competitions.size();i++){
            ArrayList<String> match=competitions.get(i);
            String homeTeam=match.get(0);
            String awayTeam=match.get(1);
            Integer matchResult=results.get(i);

            int homeScore=0; int awayScore=0;
            String winningTeam="";
            if(matchResult==1){
                homeScore=3;
                winningTeam=homeTeam;
            }else
            {awayScore=3;
                winningTeam=awayTeam;
            }

            if(teamScore.containsKey(homeTeam)){
                int existingScore=teamScore.get(homeTeam);
                int updatedHomeScore=existingScore+homeScore;
                if(updatedHomeScore>bestScore){bestScore=updatedHomeScore;bestTeam=homeTeam;}
                teamScore.put(homeTeam,updatedHomeScore);
            }else{
                if(homeScore>bestScore){bestScore=homeScore;bestTeam=homeTeam;}
                teamScore.put(homeTeam,homeScore);
            }

            if(teamScore.containsKey(awayTeam)){
                int existingScore=teamScore.get(awayTeam);
                int updatedAwayScore=existingScore+awayScore;
                if(updatedAwayScore>bestScore){bestScore=updatedAwayScore;bestTeam=awayTeam;}
                teamScore.put(awayTeam,updatedAwayScore);
            }else{
                if(awayScore>bestScore){bestScore=awayScore;bestTeam=awayTeam;}
                teamScore.put(awayTeam,awayScore);
            }

        }


        return bestTeam;
    }
}
