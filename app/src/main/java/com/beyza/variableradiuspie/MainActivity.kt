package com.beyza.variableradiuspie


import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.highsoft.highcharts.common.hichartsclasses.HIOptions
import com.highsoft.highcharts.common.hichartsclasses.HITitle
import com.highsoft.highcharts.common.hichartsclasses.HITooltip
import com.highsoft.highcharts.common.hichartsclasses.HIVariablepie
import com.highsoft.highcharts.core.HIChartView
import kotlin.collections.ArrayList
import kotlin.collections.HashMap


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val chartView: HIChartView = findViewById(R.id.hc)
        chartView.plugins = ArrayList(listOf("variable-pie"))
        val options = HIOptions()
        val title = HITitle()
        title.text = "Countries compared by population density and total area."
        options.title = title
        val tooltip = HITooltip()
        tooltip.headerFormat = ""
        tooltip.pointFormat = "<span style=\"color:{point.color}\"></span> <b> {point.name}</b><br/>Area (square km): <b>{point.y}</b><br/>Population density (people per square km): <b>{point.z}</b><br/>"
        options.tooltip = tooltip
        val series1 = HIVariablepie()
        series1.minPointSize = 10
        series1.innerSize = "20%"
        series1.zMin = 0
        series1.name = "countries"
        val map0: HashMap<String, Any> = HashMap()
        map0["name"] = "Spain"
        map0["y"] = 505370
        map0["z"] = 92.9
        val map1: HashMap<String, Any> = HashMap()
        map1["name"] = "Spain"
        map1["y"] = 505370
        map1["z"] = 92.9
        val map2: HashMap<String, Any> = HashMap()
        map2["name"] = "France"
        map2["y"] = 551500
        map2["z"] = 118.7
        val map3: HashMap<String, Any> = HashMap()
        map3["name"] = "Poland"
        map3["y"] = 312685
        map3["z"] = 124.6
        val map4: HashMap<String, Any> = HashMap()
        map4["name"] = "Czech Republic"
        map4["y"] = 78867
        map4["z"] = 137.5
        val map5: HashMap<String, Any> = HashMap()
        map5["name"] = "Italy"
        map5["y"] = 301340
        map5["z"] = 201.8
        val map6: HashMap<String, Any> = HashMap()
        map6["name"] = "Switzerland"
        map6["y"] = 41277
        map6["z"] = 214.5
        val map7: HashMap<String, Any> = HashMap()
        map7["name"] = "Germany"
        map7["y"] = 357022
        map7["z"] = 235.6
        series1.data = ArrayList(listOf(map0, map1, map2, map3, map4, map5, map6, map7))
        options.series = ArrayList(listOf(series1))
        chartView.options = options
    }
}