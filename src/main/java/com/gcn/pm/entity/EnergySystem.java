package com.gcn.pm.entity;

import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;

@Entity
@Table(name = "energy_system")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler" })
public class EnergySystem extends BaseEntity {

	private static final long serialVersionUID = 5586346958841L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "system_id")
	private long system_id;

	@ManyToOne
	@JoinColumn(name = "meter_id")
	@Column(name = "meter_id")
	private Meter meter;

	@Column(name = "system_name")
	private long system_name;

	@Column(name = "inverter_size_kw")
	private Integer inverter_size_kw;

	@Column(name = "battery_size_kwh")
	private Integer battery_size_kwh;

	@Column(name = "status")
	private String status;

	@Column(name = "vendor")
	private String vendor;

	@Column(name = "availability")
	private String availability;

	@Column(name = "cost")
	private Float cost;

	@Column(name = "currency")
	private String currency;

	@Column(name = "currency_symbol")
	private String currency_symbol;

	public long getSystem_id() {
		return system_id;
	}

	public void setSystem_id(long system_id) {
		this.system_id = system_id;
	}

	public long getSystem_name() {
		return system_name;
	}

	public void setSystem_name(long system_name) {
		this.system_name = system_name;
	}

	public Integer getInverter_size_kw() {
		return inverter_size_kw;
	}

	public void setInverter_size_kw(Integer inverter_size_kw) {
		this.inverter_size_kw = inverter_size_kw;
	}

	public Integer getBattery_size_kwh() {
		return battery_size_kwh;
	}

	public void setBattery_size_kwh(Integer battery_size_kwh) {
		this.battery_size_kwh = battery_size_kwh;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	public String getAvailability() {
		return availability;
	}

	public void setAvailability(String availability) {
		this.availability = availability;
	}

	public Float getCost() {
		return cost;
	}

	public void setCost(Float cost) {
		this.cost = cost;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getCurrency_symbol() {
		return currency_symbol;
	}

	public void setCurrency_symbol(String currency_symbol) {
		this.currency_symbol = currency_symbol;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

}
