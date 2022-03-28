/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;
import org.primefaces.model.chart.AxisType;
import org.primefaces.model.chart.ChartSeries;
import org.primefaces.model.chart.LineChartModel;

/**
 *
 * @author erixo
 */
@Named(value = "chartbean")
@RequestScoped
public class ChartBean {
    
    private final LineChartModel chartModel;

    /**
     * Creates a new instance of ChartBean
     */
    public ChartBean() {
        chartModel = new LineChartModel();
        chartModel.setLegendPosition("w");
        chartModel.getAxis(AxisType.X).setLabel("Angle [*]");
        chartModel.getAxis(AxisType.Y).setLabel("Value");
        chartModel.setZoom(true);
        
        ChartSeries sin = new ChartSeries();
        ChartSeries cos = new ChartSeries();
        sin.setLabel("sin(x)");
        cos.setLabel("cos(x)");
        
        for (int deg = 0; deg <= 360; deg += 10) {
            double rad = Math.toRadians(deg);
            sin.set(deg, Math.sin(rad));
            cos.set(deg, Math.cos(rad));
        }
        
        chartModel.addSeries(sin);
        chartModel.addSeries(cos);
    }

    /**
     * @return the chartModel
     */
    public LineChartModel getChartModel() {
        return chartModel;
    }
}
