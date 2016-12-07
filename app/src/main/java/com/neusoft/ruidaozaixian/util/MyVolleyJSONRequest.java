package com.neusoft.ruidaozaixian.util;

import java.util.HashMap;
import java.util.Map;

import org.json.JSONObject;

import com.android.volley.AuthFailureError;
import com.android.volley.Response;
import com.android.volley.Response.ErrorListener;
import com.android.volley.Response.Listener;
import com.android.volley.toolbox.JsonObjectRequest;

import android.util.Log;

public class MyVolleyJSONRequest extends JsonObjectRequest{

	private PrefStore pref;

	public MyVolleyJSONRequest(int method, String url, JSONObject jsonRequest, Listener<JSONObject> listener,
							   ErrorListener errorListener) {
		super(method, url, jsonRequest, listener, errorListener);
		// TODO Auto-generated constructor stub
	}

	public MyVolleyJSONRequest(int method, String url, JSONObject jsonRequest, Listener<JSONObject> listener) {
		super(method, url, jsonRequest, listener, new MyErrorListener());
		// TODO Auto-generated constructor stub
	}

	public MyVolleyJSONRequest(String url, JSONObject jsonRequest, Listener<JSONObject> listener,
							   ErrorListener errorListener) {
		super(url, jsonRequest, listener, errorListener);
		// TODO Auto-generated constructor stub
	}

	public MyVolleyJSONRequest(String url, JSONObject jsonRequest, Listener<JSONObject> listener) {
		super(url, jsonRequest, listener, new MyErrorListener());
		// TODO Auto-generated constructor stub
	}

	@Override
	public Map<String, String> getHeaders() throws AuthFailureError {
		// TODO Auto-generated method stub
		pref = PrefStore.getInstance();
		String sessionId=pref.getPref("sessionId", "");
		if (sessionId.length() > 0) {
			HashMap<String, String> headers = new HashMap<String, String>();
			headers.put("cookie", sessionId);
			Log.d("sessionid", "headers----------------" + headers);
			return headers;
		} else {
			return super.getHeaders();
		}
	}


}
