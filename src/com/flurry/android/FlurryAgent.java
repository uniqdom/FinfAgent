package com.flurry.android;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import android.view.ViewGroup;
import android.location.Criteria;
import java.util.Map;


public final class FlurryAgent implements android.location.LocationListener {
	
	static byte 	UNKNOWN = -1;
	static byte 	FEMALE = 0;
	static byte 	MALE = 1;
	static int 		MODE_PORTRAIT = 1;
	static int 		MODE_LANDSCAPE = 2;
	static int 		BINDING_VERIFICATION = 0;
	static int 		BINDING_HTML_URL = 1;
	static int 		BINDING_HTML_BLOCK = 2;
	static int 		BINDING_NATIVE_VIDEO = 3;
	static int 		BINDING_3RD_PARTY = 4;
	static int 		BINDING_ACTION = 5;
	static int 		COMBINABLE_OFFERWALL = 1;
	static int 		COMBINABLE_REGULAR = 0;
	static final 	String 	ALIGN_BOTTOM = "b";

	
	public static void onStartSession(android.content.Context cntxt, String apiKey){

	}

	public static void onEndSession(android.content.Context cntxt){

	}

	public static void setVersionName (String versionName){

	}

	public static int getAgentVersion (){
		return(-1);
	}

	public static void setReportLocation (boolean reportLocation){

	}

	public static void setLogEnabled (boolean isEnabled){

	}

	public static void setLogLevel (int logLevel){

	}

	public static void setContinueSessionMillis (long millis){

	}

	public static void setLogEvents (boolean logEvents){

	}
	public static void	setUseHttps (boolean useHttps){

	}

	public static void	setCaptureUncaughtExceptions (boolean isEnabled){

	}

	public static void	logEvent (String eventId){

	}

	public static void	logEvent (String eventId, Map< String, String > parameters){

	}
	
	public static void	logEvent (String eventId, boolean timed){

	}
	
	public static void	logEvent (String eventId, Map< String, String > parameters, boolean timed){

	}
	
	public static void	endTimedEvent (String eventId){

	}
	
	public static void onError (String errorId, String message, String errorClass){

	}
	
	public static void onEvent (String eventId){

	}
	
	public static void onEvent (String eventId, Map< String, String > parameters){

	}
	
	public static void onPageView (){

	}
	
	public static void setAge (int age){
		
	}
	
	public static void setGender (byte gender){

	}
	
	public static void setUserId (String userId){

	}

	public static boolean getAd (Context context, String adSpace, ViewGroup viewGroup, FlurryAdSize size, long timeout){
		return(false);
	}
	
	public static void initializeAds (Context context){

	}
	
	public static boolean isAdAvailable (Context context, String adSpace, FlurryAdSize size, long timeout){
		return (false);
	}
	
	public static boolean fetchAdsForSpace (Context context, String adSpace, FlurryAdSize size){
		return(false);
	}
	
	public static void removeAd (Context context, String adSpace, ViewGroup viewGroup){

	}
	
	public static void enableTestAds (boolean test){

	}
	
	public static void setAdListener (FlurryAdListener listener){

	}
	
	public static void setLocation (float lat, float lon){

	}
	
	/*static void setCustomAdNetworkHandler (ICustomAdNetworkHandler handler){

	}*/
	
	public static void setUserCookies (Map< String, String > userCookies){

	}
	
	public static void clearUserCookies (){

	}
	
	public static void setTargetingKeywords (Map< String, String > targetingKeywords){

	}
	
	public static void clearTargetingKeywords (){

	}

	static void setLocationCriteria (Criteria locationCriteria){
		
	}

	public void onLocationChanged(Location arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onProviderDisabled(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onProviderEnabled(String arg0) {
		// TODO Auto-generated method stub
		
	}

	public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
		// TODO Auto-generated method stub
		
	}
	

}
