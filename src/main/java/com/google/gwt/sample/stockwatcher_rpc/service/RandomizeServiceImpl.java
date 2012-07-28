package com.google.gwt.sample.stockwatcher_rpc.service;

import java.util.Random;

import com.google.gwt.sample.stockwatcher_rpc.client.RandomizeService;

public class RandomizeServiceImpl implements RandomizeService
{

	@Override
	public Integer getRandomNumber()
	{
		Random rand = new Random();
		return rand.nextInt();
	}

}
