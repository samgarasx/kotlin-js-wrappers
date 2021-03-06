import org.jetbrains.kotlin.gradle.dsl.KotlinJsCompile
import org.jetbrains.kotlin.gradle.dsl.KotlinJsProjectExtension
import org.jetbrains.kotlin.gradle.plugin.KotlinJsPluginWrapper

plugins {
    kotlin("js") apply false
}

subprojects {
    group = "io.github.samgarasx"
    version = if (!project.name.contains("samples")) {
        version(project.name)
    } else "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
        maven("https://maven.pkg.jetbrains.space/public/p/kotlinx-html/maven")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/kotlin/kotlin-js-wrappers")
    }

    plugins.withType<KotlinJsPluginWrapper> {
        extensions.configure<KotlinJsProjectExtension> {
            if (project.name.contains("samples")) {
                js(IR) {
                    browser {
                        commonWebpackConfig {
                            cssSupport.enabled = true
                        }
                    }

                    binaries.executable()
                }
            } else  {
                js(BOTH) {
                    browser()
                }
            }
        }

        tasks.withType<KotlinJsCompile>().configureEach {
            kotlinOptions {
                if (name == "compileKotlinJs") {
                    sourceMapEmbedSources = "always"
                    sourceMap = true
                } else {
                    sourceMap = false
                }
            }
        }
    }
}

tasks.wrapper {
    distributionType = Wrapper.DistributionType.ALL
}
