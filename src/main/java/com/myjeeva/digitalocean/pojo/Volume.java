package com.myjeeva.digitalocean.pojo;

import java.util.Date;
import java.util.Set;

import com.google.gson.annotations.SerializedName;

public class Volume extends RateLimitBase {

	private static final long serialVersionUID = 3274091633535612517L;

	private String id;
	
	private Region region;
	
	@SerializedName("droplet_ids")
	private Set<Integer> dropletIds;
	
	private String name;
	
	private String description;
	
	@SerializedName("size_gigabytes")
	private Double sizeGigabytes;
	
	@SerializedName("created_at")
	private Date createdDate;
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Set<Integer> getDropletIds() {
		return dropletIds;
	}

	public void setDropletIds(Set<Integer> dropletIds) {
		this.dropletIds = dropletIds;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getSizeGigabytes() {
		return sizeGigabytes;
	}

	public void setSizeGigabytes(Double sizeGigabytes) {
		this.sizeGigabytes = sizeGigabytes;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

}