package com.dogway.bwscout.viewmodel;

import org.restlet.resource.ResourceException;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;

import net.apispark.webapi.Sdk;
import net.apispark.webapi.representation.SeasonList;
import net.apispark.webapi.representation.GameList;
import net.apispark.webapi.representation.Season;
import net.apispark.webapi.representation.Team;

//import com.dogway.mgscout.client.api.SeasonControllerApi;
//import com.dogway.mgscout.client.handler.ApiException;
//import com.dogway.mgscout.client.model.IterableSeason;
//import com.dogway.mgscout.client.model.Season;

@VariableResolver(DelegatingVariableResolver.class)
public class ScheduleViewModel {
	
	//SeasonControllerApi seasonApiInstance;
	private Sdk seasonApi;
	private Sdk gamesApi;
	//IterableSeason seasons;
	Season season;
	GameList games;
	
	private String preferredTeam = "Test A Team";
	
	String selectedSeason = "2007";
	
	@Init
    public void init(){
		this.seasonApi = new Sdk();
		this.gamesApi  = new Sdk();
		this.gamesApi.getConfig().setBasePath("http://localhost:8080");
		System.out.println(this.gamesApi.getConfig().toString());
		//seasonApiInstance = new SeasonControllerApi();
		//seasonApiInstance.getApiClient().setDebugging(true);
		//seasonApiInstance.getApiClient().setBasePath("http://localhost:8081");
        try {
        	//SeasonList seasons = seasonApi.season().findAllUsingGET_3();
        	//season = seasons.get(0);
        	games = gamesApi.scheduleTeamnameSeasonGames(preferredTeam, selectedSeason).findAllUsingGET_2();
        	//games = (GameList) season.getGames();
        	//System.out.println(games.get(0).getAwayTeam().getName());
        	//games = gamesApi.scheduleTeamnameSeasonGames("Test A Team", "2007").findAllUsingGET_2();
			//seasons = seasonApiInstance.findAllUsingGET2();
//			System.out.println(seasons.toString());
//		} catch (ApiException e) {
//		    System.err.println("Exception when calling SeasonControllerApi#findAllUsingGET2");
//			e.printStackTrace();
//		}
        	System.out.println(games.toString());
        } catch(ResourceException e) {
            System.err.println("Status: " + e.getStatus()); // An exception occurs when getting the company
            e.printStackTrace();
        }
        //selectedSeason = seasons.toString();
        
    }

	public GameList getGames() {
		return games;
	}

	public void setGames(GameList games) {
		this.games = games;
	}

}
