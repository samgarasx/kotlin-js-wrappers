package samples.select

import antd.divider.*
import antd.icon.*
import antd.select.*
import antd.select.option
import kotlinext.js.*
import kotlinx.css.Cursor
import kotlinx.css.cursor
import kotlinx.css.padding
import kotlinx.css.px
import react.*
import react.dom.*
import styled.*

fun RBuilder.customDropdownMenu() {
    styledDiv {
        css { +SelectStyles.customDropdownMenu }
        select<String, SelectComponent<String>> {
            attrs {
                defaultValue = "lucy"
                style = js { width = 120 }
                dropdownRender = { menu ->
                    buildElement {
                        div {
                            childList.add(menu)
                            divider {
                                attrs.style = js { margin = "4px 0" }
                            }
                            styledDiv {
                                css {
                                    padding(8.px)
                                    cursor = Cursor.pointer
                                }
                                plusOutlined {}
                                +"Add item"
                            }
                        }
                    }
                }

            }
            option {
                attrs.value = "jack"
                +"Jack"
            }
            option {
                attrs.value = "lucy"
                +"Lucy"
            }
        }
    }
}
