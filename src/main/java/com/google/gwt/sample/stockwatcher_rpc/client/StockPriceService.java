package com.google.gwt.sample.stockwatcher_rpc.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("rpc/stockPrices")
public interface StockPriceService extends RemoteService
{
	StockPrice[] getPrices(String[] symbols);
}
