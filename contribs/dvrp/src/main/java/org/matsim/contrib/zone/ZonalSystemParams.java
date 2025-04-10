/*
 * *********************************************************************** *
 * project: org.matsim.*
 * *********************************************************************** *
 *                                                                         *
 * copyright       : (C) 2019 by the members listed in the COPYING,        *
 *                   LICENSE and WARRANTY file.                            *
 * email           : info at matsim dot org                                *
 *                                                                         *
 * *********************************************************************** *
 *                                                                         *
 *   This program is free software; you can redistribute it and/or modify  *
 *   it under the terms of the GNU General Public License as published by  *
 *   the Free Software Foundation; either version 2 of the License, or     *
 *   (at your option) any later version.                                   *
 *   See also COPYING, LICENSE and WARRANTY file                           *
 *                                                                         *
 * *********************************************************************** *
 */

package org.matsim.contrib.zone;

import org.matsim.core.config.ReflectiveConfigGroup;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.PositiveOrZero;

public final class ZonalSystemParams extends ReflectiveConfigGroup {
	public static final String SET_NAME = "ZonalSystemParams";

	@Parameter
	@Comment("An XML file specifying the zonal system")
	@NotBlank
	private String zonesXmlFile;

	@Parameter
	@Comment("A shape file specifying the geometries of zones")
	@NotBlank
	private String zonesShpFile;

	@Parameter
	@Comment("Expands the envelope by a given distance in all directions."
			+ " Used in ZoneFinderImpl.findZone(). The default value is 0")
	@PositiveOrZero
	private double expansionDistance = 0;

	public ZonalSystemParams() {
		super(SET_NAME);
	}

	public @NotBlank String getZonesXmlFile() {
		return zonesXmlFile;
	}

	public void setZonesXmlFile(@NotBlank String zonesXmlFile) {
		this.zonesXmlFile = zonesXmlFile;
	}

	public @NotBlank String getZonesShpFile() {
		return zonesShpFile;
	}

	public void setZonesShpFile(@NotBlank String zonesShpFile) {
		this.zonesShpFile = zonesShpFile;
	}

	@PositiveOrZero
	public double getExpansionDistance() {
		return expansionDistance;
	}

	public void setExpansionDistance(@PositiveOrZero double expansionDistance) {
		this.expansionDistance = expansionDistance;
	}
}
