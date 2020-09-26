package samples.backtop

import antd.backtop.backTop
import kotlinext.js.js
import react.RBuilder
import react.dom.div
import react.dom.jsStyle
import react.dom.strong
import styled.css
import styled.styledDiv

fun RBuilder.basic() {
    styledDiv {
        css { +BackTopStyles.basic }
        div {
            backTop {}
            +"Scroll down to see the bottom-right"
            strong {
                attrs.jsStyle = js { color = "rgba(64, 64, 64, 0.6)" }
                +" gray "
            }
            +"button."
        }
    }
}
