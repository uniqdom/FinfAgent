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

	static void setVersionName (String versionName){

	}

	static int getAgentVersion (){
		return(-1);
	}

	static void setReportLocation (boolean reportLocation){

	}

	static void setLogEnabled (boolean isEnabled){

	}

	static void setLogLevel (int logLevel){

	}

	static void setContinueSessionMillis (long millis){

	}

	static void setLogEvents (boolean logEvents){

	}
	static void	setUseHttps (boolean useHttps){

	}

	static void	setCaptureUncaughtExceptions (boolean isEnabled){

	}

	static void	logEvent (String eventId){

	}

	static void	logEvent (String eventId, Map< String, String > parameters){

	}
	
	static void	logEvent (String eventId, boolean timed){

	}
	
	static void	logEvent (String eventId, Map< String, String > parameters, boolean timed){

	}
	
	static void	endTimedEvent (String eventId){

	}
	
	static void onError (String errorId, String message, String errorClass){

	}
	
	static void onEvent (String eventId){

	}
	
	static void onEvent (String eventId, Map< String, String > parameters){

	}
	
	static void onPageView (){

	}
	
	static void setAge (int age){
		
	}
	
	static void setGender (byte gender){

	}
	
	static void setUserId (String userId){

	}

	static boolean getAd (Context context, String adSpace, ViewGroup viewGroup, FlurryAdSize size, long timeout){
		return(false);
	}
	
	static void initializeAds (Context context){

	}
	
	static boolean isAdAvailable (Context context, String adSpace, FlurryAdSize size, long timeout){
		return (false);
	}
	
	static boolean fetchAdsForSpace (Context context, String adSpace, FlurryAdSize size){
		return(false);
	}
	
	static void removeAd (Context context, String adSpace, ViewGroup viewGroup){

	}
	
	static void enableTestAds (boolean test){

	}
	
	static void setAdListener (FlurryAdListener listener){

	}
	
	static void setLocation (float lat, float lon){

	}
	
	/*static void setCustomAdNetworkHandler (ICustomAdNetworkHandler handler){

	}*/
	
	static void setUserCookies (Map< String, String > userCookies){

	}
	
	static void clearUserCookies (){

	}
	
	static void setTargetingKeywords (Map< String, String > targetingKeywords){

	}
	
	static void clearTargetingKeywords (){

	}

	static void setLocationCriteria (Criteria locationCriteria){
		
	}

	@Override
	public void onLocationChanged(Location arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderDisabled(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onProviderEnabled(String arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStatusChanged(String arg0, int arg1, Bundle arg2) {
		// TODO Auto-generated method stub
		
	}
	

}
