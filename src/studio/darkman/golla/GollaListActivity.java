package studio.darkman.golla;

import studio.darkman.golla.network.GsonRequest;
import studio.darkman.golla.object.GollaPost;
import android.os.Bundle;
import android.util.Log;

import com.actionbarsherlock.app.SherlockActivity;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.Volley;
import com.googlecode.androidannotations.annotations.EActivity;

@EActivity(R.layout.activity_golla_main_list)
public class GollaListActivity extends SherlockActivity {
	private RequestQueue mRequestQueue;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		String url = "http://ip.jsontest.com";
		mRequestQueue =  Volley.newRequestQueue(this);
		GsonRequest<GollaPost> request = new GsonRequest<GollaPost>(Request.Method.GET, url, GollaPost.class, null, new Response.Listener<GollaPost>() {

			@Override
			public void onResponse(GollaPost gollaPost) {
//				Toast.makeText(GollaListActivity.this, "arg0 : " + gollaPost.toString(), Toast.LENGTH_LONG);
				Log.e("dacechee", "arg0 : " + gollaPost.ip + ", " + gollaPost.toString());
			}
		}, new Response.ErrorListener() {

			@Override
			public void onErrorResponse(VolleyError error) {
//				Toast.makeText(GollaListActivity.this, "arg0 : " + arg0.getLocalizedMessage(), Toast.LENGTH_LONG);
				Log.e("dacechee", "arg0 : " + error.getLocalizedMessage() + ", " + error.toString());
			}
		});
//		JsonObjectRequest jor = new JsonObjectRequest(Request.Method.GET, url, null, new Response.Listener<JSONObject>() {
//
//			@Override
//			public void onResponse(JSONObject arg0) {
//				Toast.makeText(GollaListActivity.this, "arg0 : " + arg0.toString(), Toast.LENGTH_LONG);
//				Log.e("dacechee", "arg0 : " + arg0.toString());
//			}
//		}, new Response.ErrorListener() {
//
//			@Override
//			public void onErrorResponse(VolleyError arg0) {
//				Toast.makeText(GollaListActivity.this, "arg0 : " + arg0.getLocalizedMessage(), Toast.LENGTH_LONG);
//				Log.e("dacechee", "arg0 : " + arg0.getLocalizedMessage() + ", " + arg0.toString());
//			}
//		});
		
		mRequestQueue.add(request);
	}
	
	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
	}
}
