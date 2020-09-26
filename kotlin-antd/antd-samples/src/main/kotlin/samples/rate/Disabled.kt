package samples.rate

import antd.rate.rate
import react.*
import styled.css
import styled.styledDiv

fun RBuilder.disabled() {
    styledDiv {
        css { +RateStyles.disabled }
        rate {
            attrs {
                disabled = true
                defaultValue = 2
            }
        }
    }
}
