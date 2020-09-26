package samples.autocomplete

import antd.autocomplete.autoComplete
import antd.select.option
import kotlinext.js.js
import react.*
import styled.css
import styled.styledDiv

interface OptionsCompleteState : RState {
    var result: Array<String>
}

class OptionsComplete : RComponent<RProps, OptionsCompleteState>() {
    private val handleSearch = fun (value: String) {
        val newResult = if (value.isEmpty() || value.contains("@")) {
            emptyArray()
        } else {
            arrayOf("gmail.com", "163.com", "qq.com")
                    .map { domain -> "$value@$domain" }.toTypedArray()
        }

        setState {
            result = newResult
        }
    }

    override fun OptionsCompleteState.init() {
        result = emptyArray()
    }

    override fun RBuilder.render() {
        val children = state.result.map { email ->
            buildElement {
                option {
                    attrs.key = email
                    +email
                }
            }
        }.toTypedArray()

        autoComplete {
            attrs {
                style = js { width = 200 }
                onSearch = handleSearch
                placeholder = "input here"
            }
            childList.add(children)
        }
    }
}

fun RBuilder.optionsComplete() = child(OptionsComplete::class) {}

fun RBuilder.options() {
    styledDiv {
        css { +AutoCompleteStyles.options }
        optionsComplete()
    }
}
