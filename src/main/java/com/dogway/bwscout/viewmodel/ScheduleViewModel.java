package com.dogway.bwscout.viewmodel;

import java.util.List;

import org.restlet.resource.ResourceException;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.Init;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;

import net.apispark.webapi.Sdk;
import net.apispark.webapi.representation.SeasonList;

//import com.dogway.mgscout.client.api.SeasonControllerApi;
//import com.dogway.mgscout.client.handler.ApiException;
//import com.dogway.mgscout.client.model.IterableSeason;
//import com.dogway.mgscout.client.model.Season;

@VariableResolver(DelegatingVariableResolver.class)
public class ScheduleViewModel {
	
	//SeasonControllerApi seasonApiInstance;
	private Sdk seasonApi;
	//IterableSeason seasons;
	SeasonList seasons;
	
	String selectedSeason;
	
	@Init
    public void init(){
		this.seasonApi = new Sdk();
		this.seasonApi.getConfig().setBasePath("http://localhost:8080");
		System.out.println(this.seasonApi.getConfig().toString());
		//seasonApiInstance = new SeasonControllerApi();
		//seasonApiInstance.getApiClient().setDebugging(true);
		//seasonApiInstance.getApiClient().setBasePath("http://localhost:8081");
        try {
        	seasons = seasonApi.season().findAllUsingGET_2();
			//seasons = seasonApiInstance.findAllUsingGET2();
//			System.out.println(seasons.toString());
//		} catch (ApiException e) {
//		    System.err.println("Exception when calling SeasonControllerApi#findAllUsingGET2");
//			e.printStackTrace();
//		}
        	System.out.println(seasons.toString());
        } catch(ResourceException e) {
            System.err.println("Status: " + e.getStatus()); // An exception occurs when getting the company
            e.printStackTrace();
        }
        //selectedSeason = seasons.toString();
        
    }

	public SeasonList getSeasons() {
		return seasons;
	}

	public void setSeasons(SeasonList seasons) {
		this.seasons = seasons;
	}

}
