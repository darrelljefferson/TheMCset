package com.redlake.themcset.core;

import java.util.ArrayList;
import java.util.Date;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;
import com.redlake.themcset.model.Chapter;
import com.redlake.themcset.model.Event;

import android.app.Fragment;
import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Activity which displays a login screen to the user, offering registration as
 * well.
 */

public class SearchEventsFragments extends Fragment  {

	private ArrayList <Event> eventList;
	public View rootView;
	public GoogleMap googleMap;
	public SearchEventsFragments(){}
    // GPSTracker class
    GPSTracker gps;
    
    
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        
    }


	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		 rootView = inflater.inflate(R.layout.search_club_map_fragment, container, false);

		try {
            // Loading map
            initilizeMap();
 
        } catch (Exception e) {
            e.printStackTrace();
        }
 return rootView;
}
	
	private void initilizeMap() {
        if (googleMap == null) {
            googleMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
            
            gps = new GPSTracker(rootView.getContext());
            
            new APIgetEvents().execute();
            
            
            // check if GPS enabled     
            if(gps.canGetLocation()){
                 
                double latitude = gps.getLatitude();
                double longitude = gps.getLongitude();
                
                MarkerOptions marker = new MarkerOptions().position(new LatLng(latitude, longitude)).title("You Here");

                
                
             // adding marker
             googleMap.addMarker(marker);
             
             
             for ( Event ev : eventList) 
             {
            	 MarkerOptions markerclub = new MarkerOptions().position(new LatLng(ev.getLatitude(), ev.getLongitude())).title(ev.getClub_Name());
            	 googleMap.addMarker(markerclub);
             }
             
             
             CameraPosition cameraPosition = new CameraPosition.Builder().target(
                     new LatLng(latitude, longitude)).zoom(16).build();
      
             googleMap.animateCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

                 
                // \n is for new line
                Toast.makeText(rootView.getContext(), "Your Location is - \nLat: " + latitude + "\nLong: " + longitude, Toast.LENGTH_LONG).show();    
            }else{
                // can't get location
                // GPS or Network is not enabled
                // Ask user to enable GPS/network in settings
                gps.showSettingsAlert();
            }
           
 
            // check if map is created successfully or not
            if (googleMap == null) {
                Toast.makeText(rootView.getContext(),
                        "Sorry! unable to create maps", Toast.LENGTH_SHORT)
                        .show(); 
            } 
        }
    }
	
	
	public void onCreateOptionsMenu(Menu menu,  MenuInflater menuinflater) {
		menuinflater.inflate(R.menu.map_option, menu);
		    super.onCreateOptionsMenu(menu, menuinflater);
    
	}
	
	
	
	public boolean onOptionsItemSelected(MenuItem item) {
		
		switch (item.getItemId()) {
        case R.id.map:
        	initilizeMap();
        return true;
        case R.id.ph_1:
          
        return true;
        case R.id.list:
        
        return true;        
        default:
        return super.onOptionsItemSelected(item); 
        } 
	 
	} 

	
    @Override
	public void onResume() {
        super.onResume();
        initilizeMap();
    }
 

	
private class APIgetEvents extends AsyncTask<Void, Void, Void> {
	 
    private static final String URL_EVENT = "http://www.themcset.com/api/RetreiveEvents.php";
    //private static final String URL_CLUBS = "http://api.androidhive.info/contacts/";
    private ArrayList <Event> eventList;
    ProgressDialog pDialog;

	@Override
    protected void onPreExecute() {
        super.onPreExecute();
        Log.i("JSON ", " made it to onPreExec APIgetEvents");
        
        
        pDialog = new ProgressDialog(getActivity());
        pDialog.setMessage("Fetching near by Club Events...");
        pDialog.setCancelable(false);
        pDialog.show(); 
 
    }
 
    @Override
    protected Void doInBackground(Void... arg0) {
        ServiceHandler jsonParser = new ServiceHandler();
        String json = jsonParser.makeServiceCall(URL_EVENT, ServiceHandler.POST);
 
        Log.i("INFO ", "made it to inBackground in APIgetClubs Class");
 
        if (json != null) {
            try {
                JSONObject jsonObj = new JSONObject(json);
                if (jsonObj != null) {
                    JSONArray localevents = jsonObj
                            .getJSONArray("events");                        
 
                    for (int i = 0; i < localevents.length(); i++) {
                        JSONObject catObj = (JSONObject) localevents.get(i);
                        
  //(String event_title, Date event_date, String event_descr, String event_addr1 ,String event_addr2 , double latitude, double longitude )
                        
                        Event event = new Event(catObj.getString("event_title"),catObj.getString("event_date"),catObj.getString("event_descr"),
                        		catObj.getString("event_addr1"),catObj.getString("event_addr2"),
                                catObj.getDouble("latitude"), catObj.getDouble("longitude"));
                        eventList.add(event);
                    }
                }
 
            } catch (JSONException e) {
                e.printStackTrace();
            }
 
        } else {
            Log.e("JSON Data", "Didn't receive any data from server!");
        }
 
        return null;
    }
 
    @Override
    protected void onPostExecute(Void result) {
        super.onPostExecute(result);
        
         if (pDialog.isShowing())
            pDialog.dismiss(); 
        //populateSpinner();
    }
 
}	
}	
	