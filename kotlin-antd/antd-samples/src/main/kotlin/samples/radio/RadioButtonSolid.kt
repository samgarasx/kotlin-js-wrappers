package samples.radio

import antd.radio.*
import kotlinx.css.marginTop
import kotlinx.css.px
import react.*
import react.dom.*
import styled.*

fun RBuilder.radioButtonSolid() {
    styledDiv {
        css { +RadioStyles.radioButtonSolid }
        div {
            div {
                radioGroup {
                    attrs {
                        defaultValue = "a"
                        buttonStyle = "solid"
                    }
                    radioButton {
                        attrs.value = "a"
                        +"Hangzhou"
                    }
                    radioButton {
                        attrs.value = "b"
                        +"Shanghai"
                    }
                    radioButton {
                        attrs.value = "c"
                        +"Beijing"
                    }
                    radioButton {
                        attrs.value = "d"
                        +"Chengdu"
                    }
                }
            }
            styledDiv {
                css { marginTop = 16.px }
                radioGroup {
                    attrs {
                        defaultValue = "a"
                        buttonStyle = "solid"
                    }
                    radioButton {
                        attrs.value = "a"
                        +"Hangzhou"
                    }
                    radioButton {
                        attrs {
                            value = "b"
                            disabled = true
                        }
                        +"Shanghai"
                    }
                    radioButton {
                        attrs.value = "c"
                        +"Beijing"
                    }
                    radioButton {
                        attrs.value = "d"
                        +"Chengdu"
                    }
                }
            }
        }
    }
}
