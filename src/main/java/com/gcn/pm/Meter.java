package com.gcn.pm;

import javax.persistence.*;


/**
 * 
 * @author dtung
 *
 */
@Entity
@Table(name = "meter")
public class Meter extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2051033929568723866L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "meter_id")
	private int id;

	//@ManyToOne
	//@JoinColumn(name = "site_id")
	//private Site site;

	@Column(name = "meter_name")
	private String name;

	@Column(name = "total_savings")
	private String total_savings;

	@Column(name = "currency")
	private String currency;

	@Column(name = "currency_symbol")
	private String currency_symbol;

	@Column(name = "inverter_size_kw")
	private Integer inverterSizeKw;

	@Column(name = "battery_size_kwh")
	private Integer batterySizeKwh;

	@Column(name = "status")
	private String status;

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTotal_savings() {
		return total_savings;
	}

	public void setTotal_savings(String total_savings) {
		this.total_savings = total_savings;
	}

	public String getCurrency_symbol() {
		return currency_symbol;
	}

	public void setCurrency_symbol(String currency_symbol) {
		this.currency_symbol = currency_symbol;
	}

	public Integer getInverterSizeKw() {
		return inverterSizeKw;
	}

	public void setInverterSizeKw(Integer inverterSizeKw) {
		this.inverterSizeKw = inverterSizeKw;
	}

	public Integer getBatterySizeKwh() {
		return batterySizeKwh;
	}

	public void setBatterySizeKwh(Integer batterySizeKwh) {
		this.batterySizeKwh = batterySizeKwh;
	}

/*	public Site getSite() {
		return site;
	}

	public void setSite(Site site) {
		this.site = site;
	}*/

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}
