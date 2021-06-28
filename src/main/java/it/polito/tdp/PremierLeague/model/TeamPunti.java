package it.polito.tdp.PremierLeague.model;

public class TeamPunti implements Comparable<TeamPunti>{
	
	private Team team;
	private Integer punteggio;
	
	public TeamPunti(Team team, Integer punteggio) {
		super();
		this.team = team;
		this.punteggio = punteggio;
	}

	public Team getTeam() {
		return team;
	}

	public void setTeam(Team team) {
		this.team = team;
	}

	public Integer getPunteggio() {
		return punteggio;
	}

	public void setPunteggio(Integer punteggio) {
		this.punteggio = punteggio;
	}

	@Override
	public int compareTo(TeamPunti other) {
		
		return - (this.punteggio-other.getPunteggio());
	}
	
	
	
	

}
