package com.securerestservice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.securerestservice.model.Asset;

@Service
public class AssetServiceImpl implements AssetService{
	
	private static List<Asset> assetList = new ArrayList<>();
	
	static {
		Asset asset1 = new Asset(1, "Access Point", "Cisco", "AD10", "intermec", "Is3203", "System Room", "10.18.9.9", "10:223:3A:BC:56");
		Asset asset2 = new Asset(2, "Terminal", "Intermec 9745", "AD20", "intermec", "Is3203", "Ops Room", "10.18.9.6", "10:223:3A:cc:78");
		assetList.add(asset1);
		assetList.add(asset2);
	}

	@Override
	public List<Asset> getAllAssets() {
		// TODO Auto-generated method stub
		return assetList;
	}

}
