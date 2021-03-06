package antd.avatar

import antd.ReactNode
import react.Component
import react.RProps
import react.RState
import react.ReactElement

external object GroupComponent : Component<GroupProps, RState> {
    override fun render(): ReactElement
}

external interface GroupProps : RProps {
    var className: String?
    var children: ReactNode?
    var style: dynamic
    var prefixCls: String?
    var maxCount: Number?
    var maxStyle: dynamic
    var maxPopoverPlacement: String? /* "top" | "bottom" */
    var size: AvatarSize?
}
