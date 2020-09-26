package samples.dropdown

import antd.dropdown.dropdown
import antd.icon.icon
import antd.menu.menu
import antd.menu.menuDivider
import antd.menu.menuItem
import kotlinx.html.classes
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private val menu = buildElement {
    menu {
        menuItem {
            attrs.key = "0"
            a {
                attrs.href = "http://www.alipay.com/"
                +"1st menu item"
            }
        }
        menuItem {
            attrs.key = "1"
            a {
                attrs.href = "http://www.taobao.com/"
                +"2nd menu item"
            }
        }
        menuDivider {}
        menuItem {
            attrs.key = "3"
            +"3rd menu item"
        }
    }
}

fun RBuilder.trigger() {
    styledDiv {
        css { +DropdownStyles.trigger }
        dropdown {
            attrs {
                overlay = menu
                trigger = arrayOf("click")
            }
            a {
                attrs {
                    classes = setOf("ant-dropdown-link")
                    href = "#"
                }
                +"Click me "
                icon {
                    attrs.type = "down"
                }
            }
        }
    }
}
