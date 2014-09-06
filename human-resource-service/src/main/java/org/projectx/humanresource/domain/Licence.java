package org.projectx.humanresource.domain;

import java.util.Date;

public class Licence {
	private Date awardedDate;
	private Date expiryDate;
	private String licenceCode;
	private String licenceGivenBy;
	private String licenceName;
	private String licenceDescription;

	public Date getAwardedDate() {
		return awardedDate;
	}

	public void setAwardedDate(Date awardedDate) {
		this.awardedDate = awardedDate;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getLicenceCode() {
		return licenceCode;
	}

	public void setLicenceCode(String licenceCode) {
		this.licenceCode = licenceCode;
	}

	public String getLicenceGivenBy() {
		return licenceGivenBy;
	}

	public void setLicenceGivenBy(String licenceGivenBy) {
		this.licenceGivenBy = licenceGivenBy;
	}

	public String getLicenceName() {
		return licenceName;
	}

	public void setLicenceName(String licenceName) {
		this.licenceName = licenceName;
	}

	public String getLicenceDescription() {
		return licenceDescription;
	}

	public void setLicenceDescription(String licenceDescription) {
		this.licenceDescription = licenceDescription;
	}

	public Licence(Date awardedDate, Date expiryDate, String licenceCode, String licenceGivenBy, String licenceName,
			String licenceDescription) {
		super();
		this.awardedDate = awardedDate;
		this.expiryDate = expiryDate;
		this.licenceCode = licenceCode;
		this.licenceGivenBy = licenceGivenBy;
		this.licenceName = licenceName;
		this.licenceDescription = licenceDescription;
	}

}
