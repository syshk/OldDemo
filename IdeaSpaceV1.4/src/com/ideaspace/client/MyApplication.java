package com.ideaspace.client;

import com.ideaspace.data.DataModel;

import android.app.Application;

public class MyApplication extends Application {
	public DataModel dataModel;
	public String IP;

	@Override
	public void onCreate() {
		super.onCreate();
		dataModel = new DataModel();
	}
}
