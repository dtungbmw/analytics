package com.gcn.pm;

import javax.persistence.*;

/**
 * 
 * @author dtung
 *
 */
@Entity
@Table(name = "site")
public class Site extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5480579724728972805L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "site_id")
	private int id;

	/*@ManyToOne
	@JoinColumn(name = "project_id")
	private Project project;*/

	@Column(name = "site_name")
	private String site_name;

	@Column(name = "address_one")
	private String address_one;

	@Column(name = "address_two")
	private String address_two;

	@Column(name = "city")
	private String city;

	@Column(name = "state")
	private String state;

	@Column(name = "zipcode")
	private String zipcode;

	@Column(name = "longitude")
	private String longitude;

	@Column(name = "latitude")
	private String latitude;

	@Column(name = "picture")
	private String picture;

/*	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}*/

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSite_name() {
		return site_name;
	}

	public void setSite_name(String site_name) {
		this.site_name = site_name;
	}

	public String getAddress_one() {
		return address_one;
	}

	public void setAddress_one(String address_one) {
		this.address_one = address_one;
	}

	public String getAddress_two() {
		return address_two;
	}

	public void setAddress_two(String address_two) {
		this.address_two = address_two;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}
}
