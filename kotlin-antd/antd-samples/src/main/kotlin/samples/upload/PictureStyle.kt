package samples.upload

import antd.button.button
import antd.icon.icon
import antd.upload.UploadFile
import antd.upload.upload
import kotlinext.js.jsObject
import react.*
import react.dom.*
import styled.css
import styled.styledDiv

private val fileList = arrayOf<UploadFile>(
        jsObject {
            uid = "-1"
            name = "xxx.png"
            status = "done"
            url = "https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png"
            thumbUrl = "https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png"
        },
        jsObject {
            uid = "-2"
            name = "yyy.png"
            status = "done"
            url = "https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png"
            thumbUrl = "https://zos.alipayobjects.com/rmsportal/jkjgkEfvpUPVyRjUImniVslZfWPnJuuZ.png"
        }
)

fun RBuilder.pictureStyle() {
    styledDiv {
        css { +UploadStyles.pictureStyle }
        div {
            upload {
                attrs {
                    action = "//jsonplaceholder.typicode.com/posts/"
                    listType = "picture"
                    defaultFileList = fileList
                }
                button {
                    icon {
                        attrs.type = "upload"
                    }
                    +"Upload"
                }
            }
            br {}
            br {}
            upload {
                attrs {
                    action = "//jsonplaceholder.typicode.com/posts/"
                    listType = "picture"
                    defaultFileList = fileList
                    className = "upload-list-inline"
                }
                button {
                    icon {
                        attrs.type = "upload"
                    }
                    +"Upload"
                }
            }
        }
    }
}
