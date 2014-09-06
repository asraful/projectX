package org.projectx.humanresource.domain;

public class Address {

	private String addressType;
	private String houseNumber;
	private String flatNumber;
	private String road;
	private String areaCode;
	private String postCode;
	private String provinceOrDistrict;
	private String country;
	private String contactNumber;
	private String emergencyNumber;

	public String getAddressType() {
		return addressType;
	}

	public void setAddressType(String addressType) {
		this.addressType = addressType;
	}

	public String getHouseNumber() {
		return houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getFlatNumber() {
		return flatNumber;
	}

	public void setFlatNumber(String flatNumber) {
		this.flatNumber = flatNumber;
	}

	public String getRoad() {
		return road;
	}

	public void setRoad(String road) {
		this.road = road;
	}

	public String getAreaCode() {
		return areaCode;
	}

	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}

	public String getPostCode() {
		return postCode;
	}

	public void setPostCode(String postCode) {
		this.postCode = postCode;
	}

	public String getProvinceOrDistrict() {
		return provinceOrDistrict;
	}

	public void setProvinceOrDistrict(String provinceOrDistrict) {
		this.provinceOrDistrict = provinceOrDistrict;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getEmergencyNumber() {
		return emergencyNumber;
	}

	public void setEmergencyNumber(String emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}

	public Address(String addressType, String houseNumber, String flatNumber, String road, String areaCode,
			String postCode, String provinceOrDistrict, String country, String contactNumber, String emergencyNumber) {
		super();
		this.addressType = addressType;
		this.houseNumber = houseNumber;
		this.flatNumber = flatNumber;
		this.road = road;
		this.areaCode = areaCode;
		this.postCode = postCode;
		this.provinceOrDistrict = provinceOrDistrict;
		this.country = country;
		this.contactNumber = contactNumber;
		this.emergencyNumber = emergencyNumber;
	}

}
