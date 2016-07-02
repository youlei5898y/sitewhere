/*
 * Copyright (c) SiteWhere, LLC. All rights reserved. http://www.sitewhere.com
 *
 * The software in this package is published under the terms of the CPAL v1.0
 * license, a copy of which has been included with this distribution in the
 * LICENSE.txt file.
 */
package com.sitewhere.rest.model.tenant;

import java.io.Serializable;

import com.sitewhere.rest.model.common.MetadataProviderEntity;
import com.sitewhere.spi.tenant.ITenantGroup;

/**
 * Model object for a tenant group.
 * 
 * @author Derek
 */
public class TenantGroup extends MetadataProviderEntity implements ITenantGroup, Serializable {

	/** Serial version UID */
	private static final long serialVersionUID = 8286511120595519596L;

	/** Unique tenant group id */
	private String id;

	/** Group name */
	private String name;

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sitewhere.spi.tenant.ITenantGroup#getId()
	 */
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.sitewhere.spi.tenant.ITenantGroup#getName()
	 */
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}