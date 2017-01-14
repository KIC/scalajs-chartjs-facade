package chartjs

import chartjs.chart._

import scala.scalajs.js
import scala.scalajs.js.annotation.JSExportAll

@JSExportAll
case class TimeSeriesChart(cnavasId: String, chartType: ChartType) {
  val jsChart = new Chart(cnavasId, ChartParam(chartType, LineChartOptions()))

  def appendDataSet(label: String): Unit = {
    jsChart.data.datasets.append(DataSet(label))
  }

  def append(x: Int, y: Double): Unit = {
    jsChart.data.datasets(0).data.push(js.Dynamic.literal(x = x, y = y))
    jsChart.update()
  }
}
