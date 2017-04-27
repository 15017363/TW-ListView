package com.myapplicationdev.android.tw_listview;

/**
 * Created by 15017363 on 27/4/2017.
 */

public class Module {


    private String moduleName;
    private boolean progMod;

    public Module(String moduleName, boolean progMod){
        this.moduleName = moduleName;
        this.progMod = progMod;
    }
    public String getName(){
        return moduleName;
    }
    public boolean isProgMod(){
        return progMod;
    }
}
