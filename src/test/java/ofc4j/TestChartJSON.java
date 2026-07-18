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
package ofc4j;

import ofc4j.model.Chart;
import ofc4j.model.Text;
import ofc4j.model.elements.FilledBarChart;

import org.junit.Test;

public class TestChartJSON {
  @Test
   public void testToString() {
     Chart chart = new Chart();
     //chart.setTooltip(new Tooltip());
     chart.setTitle(new Text("Testing"));
     FilledBarChart bar = new FilledBarChart();
     chart.addElements(bar);
     
     System.out.println(chart.toString());
   }
}
