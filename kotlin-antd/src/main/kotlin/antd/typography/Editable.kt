package antd.typography

import antd.configprovider.DirectionType
import react.*

external object EditableComponent : Component<EditableProps, RState> {
    override fun render(): ReactElement?
}

external interface EditableProps : RProps {
    var prefixCls: String?
    var value: String?
    var onSave: (value: String) -> Unit
    var onCancel: () -> Unit
    var className: String?
    var style: dynamic
    var direction: DirectionType?
    var maxLength: Number?
    var autoSize: Any? /* Boolean | AutoSizeType */
}
