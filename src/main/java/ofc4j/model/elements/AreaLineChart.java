/*! ******************************************************************************
 *
 * Pentaho
 *
 * Copyright (C) 2026 by Pentaho Canada Inc. : http://www.pentaho.com
 *
 * Use of this software is governed by the Business Source License included
 * in the LICENSE.TXT file.
 *
 * Change Date: 2030-06-15
 ******************************************************************************/
package ofc4j.model.elements;

import ofc4j.model.metadata.Alias;

public class AreaLineChart extends LineChart {
	private static transient final Float DEFAULT_ALPHA = 0.35f;
    
    @Alias("fill-alpha") private Float fillAlpha;
    private String fill;
    
    public AreaLineChart() {
        super("area_line");
        setFillAlpha(DEFAULT_ALPHA);
    }

    public Float getFillAlpha() {
        return fillAlpha;
    }

    public AreaLineChart setFillAlpha(Float fillAlpha) {
        this.fillAlpha = fillAlpha;
        return this;
    }
    
    public void setFill(String fill) {
        this.fill = fill;
    }

    public String getFill() {
        return fill;
    }
}
