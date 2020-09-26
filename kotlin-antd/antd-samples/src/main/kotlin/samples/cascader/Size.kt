package samples.cascader

import antd.cascader.CascaderOptionType
import antd.cascader.cascader
import kotlinext.js.jsObject
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private val cascaderOptions= arrayOf<CascaderOptionType>(
        jsObject {
            value = "zhejiang"
            label = "Zhejiang"
            children = arrayOf(
                    jsObject {
                        value = "hangzhou"
                        label = "Hangzhou"
                        children = arrayOf(
                                jsObject {
                                    value = "xihu"
                                    label = "West Lake"
                                }
                        )
                    }
            )
        },
        jsObject {
            value = "jiangsu"
            label = "Jiangsu"
            children = arrayOf(
                    jsObject {
                        value = "nanjing"
                        label = "Nanjing"
                        children = arrayOf(
                                jsObject {
                                    value = "zhonghuamen"
                                    label = "Zhong Hua Men"
                                }
                        )
                    }
            )
        }
)

private fun handleChange(value: Array<String>, selectedOptions: Array<CascaderOptionType>?) {
    console.log(value)
}

fun RBuilder.size() {
    styledDiv {
        css { +CascaderStyles.size }
        div {
            cascader {
                attrs {
                    size = "large"
                    options = cascaderOptions
                    onChange = ::handleChange
                }
            }
            br {}
            cascader {
                attrs {
                    options = cascaderOptions
                    onChange = ::handleChange
                }
            }
            br {}
            cascader {
                attrs {
                    size = "small"
                    options = cascaderOptions
                    onChange = ::handleChange
                }
            }
        }
    }
}
