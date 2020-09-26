package samples.table

import antd.pagination.PaginationConfig
import antd.table.ColumnProps
import antd.table.TableComponent
import antd.table.table
import kotlinext.js.jsObject
import react.RBuilder
import styled.css
import styled.styledDiv

private interface FixedHeaderTableDataItem {
    var key: String
    var name: String
    var age: Number
    var address: String
}

private val tableColumns = arrayOf<ColumnProps<FixedHeaderTableDataItem>>(
        jsObject {
            title = "Name"
            dataIndex = "name"
            width = 150
        },
        jsObject {
            title = "Age"
            dataIndex = "age"
            width = 150
        },
        jsObject {
            title = "Address"
            dataIndex = "address"
        }
)

private val data = (0..100).map { i ->
    jsObject<FixedHeaderTableDataItem> {
        key = "$i"
        name = "Edward King $i"
        age = 32
        address = "London, Park Lane no. $i"
    }
}.toTypedArray()

fun RBuilder.fixedHeader() {
    styledDiv {
        css { +TableStyles.fixedHeader }
        table<FixedHeaderTableDataItem, TableComponent<FixedHeaderTableDataItem>> {
            attrs {
                columns = tableColumns
                dataSource = data
                pagination = jsObject<PaginationConfig> { pageSize = 50 }
                scroll = jsObject { y = 240 }
            }
        }
    }
}
