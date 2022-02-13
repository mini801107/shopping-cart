
rootProject.name = "shopping-cart"

plugins {
    id("com.gradle.enterprise") version "3.7"
    id("nu.studer.build-scan.teamcity") version "1.1"
}
gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
    }
}