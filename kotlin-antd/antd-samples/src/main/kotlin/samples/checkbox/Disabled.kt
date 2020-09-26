package samples.checkbox

import antd.checkbox.checkbox
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

fun RBuilder.disabled() {
    styledDiv {
        css { +CheckboxStyles.disabled }
        div {
            checkbox {
                attrs {
                    defaultChecked = false
                    disabled = true
                }
            }
            br {}
            checkbox {
                attrs {
                    defaultChecked = true
                    disabled = true
                }
            }
        }
    }
}
