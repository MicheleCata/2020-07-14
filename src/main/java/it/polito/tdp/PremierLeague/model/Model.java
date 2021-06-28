package it.polito.tdp.PremierLeague.model;

import java.util.HashMap;
import java.util.Map;

import org.jgrapht.Graph;
import org.jgrapht.Graphs;
import org.jgrapht.graph.DefaultWeightedEdge;
import org.jgrapht.graph.SimpleDirectedWeightedGraph;

import it.polito.tdp.PremierLeague.db.PremierLeagueDAO;

public class Model {
	
	private Graph<Team, DefaultWeightedEdge> grafo;
	private PremierLeagueDAO dao;
	private Map<Integer,Team> idMap;
	
	public Model() {
		dao = new PremierLeagueDAO();
		idMap=new HashMap<>();
		dao.listAllTeams(idMap);
	}
	
	public void creaGrafo(Map<Integer,Team> idMap) {
		grafo = new SimpleDirectedWeightedGraph<Team, DefaultWeightedEdge>(DefaultWeightedEdge.class);
		Graphs.addAllVertices(grafo, idMap.values());
		
		
		System.out.format("Grafo creato con %d vertici\n",
 				this.grafo.vertexSet().size()); 
	}
	
	public int getNumVertici() {
		return this.grafo.vertexSet().size();
	}
	
}
