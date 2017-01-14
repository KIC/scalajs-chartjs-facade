package chartjs

import chartjs.chart.{DataSet, Line}

import scala.scalajs.js.JSApp
import scala.scalajs.js.annotation.JSExport

/**
  * Created by kic on 14.01.17.
  */
object App extends JSApp {
  def main(): Unit = {
    chart()
  }

  @JSExport
  def chart(): Any = {
    val tsc = TimeSeriesChart("chart", Line)
    tsc.appendDataSet("TTEst")
    tsc.append(1, 1)
    tsc.append(2, 2)
    tsc.append(3, 3)
    tsc.append(4, 3)
  }
}
