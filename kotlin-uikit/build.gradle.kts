plugins {
    kotlin("js")
    `wrapper-publish`
}

dependencies {
    api(npmPackage("uikit"))
}
