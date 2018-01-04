package com.dogway.bwscout.viewmodel;

import javax.servlet.ServletRequest;

import org.zkoss.bind.annotation.AfterCompose;
import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.NotifyChange;
import org.zkoss.web.fn.ServletFns;
import org.zkoss.web.servlet.Servlets;

public class SidebarViewModel {
	 
    private boolean floatingMenuVisible = true;
    private boolean isMobile = false;
    private String orientation;
    private String windowMode = "embedded";
    private String menuAreaWidth= "200px";
 
    @AfterCompose
    public void init(){
        ServletRequest request = ServletFns.getCurrentRequest();
        // Detect if client is mobile device (such as Android or iOS devices)
        //isMobile = Servlets.getBrowser(request, "mobile") != null;
        //if (isMobile){
            toFloatingMenu();
        //}
    }
 
    @Command
    @NotifyChange("floatingMenuVisible")
    public void toggleMenu(){
        floatingMenuVisible = !floatingMenuVisible;
    }
 
    @Command
    @NotifyChange({"windowMode","menuAreaWidth","floatingMenuVisible"})
    public void updateClientInfo(@BindingParam("orientation") String orientation, @BindingParam("width")int width ){
        if (isMobile){
            if (!orientation.equals(this.orientation)){
                this.orientation = orientation;
                if (orientation.equals("protrait") || width < 800){
                    toFloatingMenu();
                }else{
                    toFixedMenu();
                }
            }
        }
    }
     
    private void toFloatingMenu(){
        floatingMenuVisible = false;
        setWindowMode("overlapped");
        setMenuAreaWidth("0px");
    }
     
    private void toFixedMenu(){
        floatingMenuVisible = true;
        setWindowMode("embedded");
        setMenuAreaWidth("200px");
    }

	public String getWindowMode() {
		return windowMode;
	}

	public void setWindowMode(String windowMode) {
		this.windowMode = windowMode;
	}

	public String getMenuAreaWidth() {
		return menuAreaWidth;
	}

	public void setMenuAreaWidth(String menuAreaWidth) {
		this.menuAreaWidth = menuAreaWidth;
	}

	public boolean isFloatingMenuVisible() {
		return floatingMenuVisible;
	}

	public void setFloatingMenuVisible(boolean floatingMenuVisible) {
		this.floatingMenuVisible = floatingMenuVisible;
	}
}
