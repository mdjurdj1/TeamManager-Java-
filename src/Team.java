
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */
public class Team {
    private String teamName;
    private ArrayList<Player> players;
    private int maxSize;
    
    public Team(String teamNameAtStart) {
        teamName = teamNameAtStart;
        players = new ArrayList<Player>();
        maxSize = 16;
    }

    public String getName() {
        return teamName;
    }
    
    public void addPlayer(Player playerToAdd) {
        if(players.size() < maxSize) {
            players.add(playerToAdd);
        }
    }
    public void printPlayers() {
        for(Player p : players) {
            System.out.println(p);
        }
    }
    public void setMaxSize(int maxTeamSize) {
        maxSize = maxTeamSize;
    }
    public int size() {
        return players.size();
    }
    public int goals() {
        int total = 0;
        for(Player p : players) {
            total += p.goals();
        }
        return total;
    }
    
}
