package com.dogway.bwscout.viewmodel;


import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;

public class MainViewModel {
	
	 private boolean sideBarMenuVisible = false;
	 private String currentIncludeZul = null;
	
	@AfterCompose
    public void init(){
     //   ServletRequest request = ServletFns.getCurrentRequest();
		this.setSideBarMenuVisible(false);
		this.setCurrentIncludeZul("schedule.zul");
		
    }
	
	@Command
    @NotifyChange("sideBarMenuVisible")
    public void toggleMenu() {
        this.setSideBarMenuVisible(!this.isSideBarMenuVisible());
    }
	
	@Command
    @NotifyChange({"sideBarMenuVisible", "currentIncludeZul"})
	public void centerToScheduleZul() {
		this.setCurrentIncludeZul("schedule.zul");
		this.toggleMenu();
	}
	
	@Command
    @NotifyChange({"sideBarMenuVisible", "currentIncludeZul"})
	public void centerToStartGameZul() {
		this.setCurrentIncludeZul("testVM.zul");
		this.toggleMenu();
	}
	
	@Command
    @NotifyChange({"sideBarMenuVisible", "currentIncludeZul"})
	public void centerToSettingsZul() {
		this.setCurrentIncludeZul("settings.zul");
		this.toggleMenu();
	}

	public boolean isSideBarMenuVisible() {
		return sideBarMenuVisible;
	}

	public void setSideBarMenuVisible(boolean sideBarMenuVisible) {
		this.sideBarMenuVisible = sideBarMenuVisible;
	}

	public String getCurrentIncludeZul() {
		return currentIncludeZul;
	}

	public void setCurrentIncludeZul(String currentIncludeZul) {
		this.currentIncludeZul = currentIncludeZul;
	}

}
