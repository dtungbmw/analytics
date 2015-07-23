package com.gcn.pm;

import javax.persistence.*;

@Entity
@Table(name = "project")
public class Project extends BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = 25552241752889845L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "project_id")
	private int id;

	// @ManyToOne
	// @JoinColumn(name = "customer_id")
	// private Customer customer;

	@Column(name = "project_name")
	private String project_name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}




/*	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}*/

}
