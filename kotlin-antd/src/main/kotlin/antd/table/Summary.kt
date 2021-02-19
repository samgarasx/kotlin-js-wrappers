package antd.table

import react.Component
import react.RProps
import react.RState
import react.ReactElement

external interface Summary {
    val Cell: SummaryCellComponent
    val Row: SummaryRowComponent
}

external object SummaryCellComponent : Component<SummaryCellProps, RState> {
    override fun render(): ReactElement?
}

external object SummaryRowComponent : Component<SummaryRowProps, RState> {
    override fun render(): ReactElement?
}

external interface SummaryCellProps : RProps {
    var className: String?
    var children: Any? /* String | ReactElement */
    var index: Number
    var colSpan: Number?
    var rowSpan: Number?
    var align: AlignType?
}

external interface SummaryRowProps : RProps {
    var children: Any? /* String | ReactElement */
    var className: String?
    var style: dynamic
}
