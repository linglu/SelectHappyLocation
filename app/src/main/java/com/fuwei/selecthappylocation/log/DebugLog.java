package com.fuwei.selecthappylocation.log;

import android.util.Log;

public class DebugLog {

	public final static String TAG = "DebugLog";
	
//	public static boolean isDebugMode = false;
	public static boolean isDebugMode = true;

	public static void d(String tag, String msg) {
		if(isDebugMode) 
			Log.d(tag, msg);
	}

	public static void e(String tag, String msg) {
		if(isDebugMode) 
			Log.e(tag, msg);
	}
	
	public static void i(String tag, String msg) {
		if(isDebugMode) 
			Log.i(tag, msg);
	}
	
	public static void w(String tag, String msg) {
		if(isDebugMode) 
			Log.i(tag, msg);
	} 
}
