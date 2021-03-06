package samples.table

import antd.table.ColumnType
import antd.table.ColumnsType
import antd.table.TableComponent
import antd.table.table
import kotlinext.js.jsObject
import react.RBuilder
import react.buildElement
import react.dom.a
import styled.css
import styled.styledDiv

private external interface StickyDataItem {
    var key: Number
    var name: String
    var age: Number
    var address: String
}

private val tableColumns = arrayOf<ColumnType<StickyDataItem>>(
    jsObject {
        title = "Full Name"
        width = 100
        dataIndex = "name"
        key = "name"
        fixed = "left"
    },
    jsObject {
        title = "Age"
        width = 100
        dataIndex = "age"
        key = "age"
        fixed = "left"
    },
    jsObject {
        title = "Column 1"
        dataIndex = "address"
        key = "1"
        width = 150
    },
    jsObject {
        title = "Column 2"
        dataIndex = "address"
        key = "2"
        width = 150
    },
    jsObject {
        title = "Column 3"
        dataIndex = "address"
        key = "3"
        width = 150
    },
    jsObject {
        title = "Column 4"
        dataIndex = "address"
        key = "4"
        width = 150
    },
    jsObject {
        title = "Column 5"
        dataIndex = "address"
        key = "5"
        width = 150
    },
    jsObject {
        title = "Column 6"
        dataIndex = "address"
        key = "6"
        width = 150
    },
    jsObject {
        title = "Column 7"
        dataIndex = "address"
        key = "7"
        width = 150
    },
    jsObject {
        title = "Column 8"
        dataIndex = "address"
        key = "8"
    },
    jsObject {
        title = "Action"
        key = "operation"
        fixed = "right"
        width = 100
        render = { _, _, _ ->
            buildElement {
                a { +"action" }
            }
        }
    }
)

private val tableData = (1..100).map { i ->
    jsObject<StickyDataItem> {
        key = i
        name = "Edrward $i"
        age = 32
        address = "London Park no. $i"
    }
}.toTypedArray()

fun RBuilder.sticky() {
    styledDiv {
        css { +TableStyles.sticky }
        table<StickyDataItem, TableComponent<StickyDataItem>> {
            attrs {
                columns = tableColumns.unsafeCast<ColumnsType<StickyDataItem>>()
                dataSource = tableData
                scroll = jsObject { x = 1500 }
                sticky = true
            }
        }
    }
}
