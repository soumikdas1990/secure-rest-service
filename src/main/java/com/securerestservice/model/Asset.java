package com.securerestservice.model;

public class Asset {
	
	
	private long id;
	
	
    private String assetType;
	
    private String subType;
	
    private String serialNumber;
	
    private String vendorName;
	
    private String mfgrModelNumber;
	
    private String location;
	
    private String ipAddress;
	
    private String macAddress;
    
    

	public Asset(long id, String assetType, String subType, String serialNumber, String vendorName,
			String mfgrModelNumber, String location, String ipAddress, String macAddress) {
		super();
		this.id = id;
		this.assetType = assetType;
		this.subType = subType;
		this.serialNumber = serialNumber;
		this.vendorName = vendorName;
		this.mfgrModelNumber = mfgrModelNumber;
		this.location = location;
		this.ipAddress = ipAddress;
		this.macAddress = macAddress;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAssetType() {
		return assetType;
	}

	public void setAssetType(String assetType) {
		this.assetType = assetType;
	}

	public String getSubType() {
		return subType;
	}

	public void setSubType(String subType) {
		this.subType = subType;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getVendorName() {
		return vendorName;
	}

	public void setVendorName(String vendorName) {
		this.vendorName = vendorName;
	}

	public String getMfgrModelNumber() {
		return mfgrModelNumber;
	}

	public void setMfgrModelNumber(String mfgrModelNumber) {
		this.mfgrModelNumber = mfgrModelNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getIpAddress() {
		return ipAddress;
	}

	public void setIpAddress(String ipAddress) {
		this.ipAddress = ipAddress;
	}

	public String getMacAddress() {
		return macAddress;
	}

	public void setMacAddress(String macAddress) {
		this.macAddress = macAddress;
	}
    
    
	
}
