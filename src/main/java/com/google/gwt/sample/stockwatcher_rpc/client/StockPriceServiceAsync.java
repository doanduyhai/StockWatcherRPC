package com.google.gwt.sample.stockwatcher_rpc.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface StockPriceServiceAsync
{
	void getPrices(String[] symbols, AsyncCallback<StockPrice[]> callback);
}
