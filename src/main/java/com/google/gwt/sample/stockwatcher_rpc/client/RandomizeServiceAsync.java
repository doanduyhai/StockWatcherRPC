package com.google.gwt.sample.stockwatcher_rpc.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface RandomizeServiceAsync
{
	void getRandomNumber(AsyncCallback<Integer> callback);
}
