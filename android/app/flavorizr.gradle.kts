import com.android.build.gradle.AppExtension

val android = project.extensions.getByType(AppExtension::class.java)

android.apply {
    flavorDimensions("Raunit")

    productFlavors {
        create("dev") {
            dimension = "Raunit"
            applicationId = "com.raunit.myprofileapp.dev"
            resValue(type = "string", name = "app_name", value = "Raunit Dev")
        }
        create("staging") {
            dimension = "Raunit"
            applicationId = "com.raunit.myprofileapp.staging"
            resValue(type = "string", name = "app_name", value = "Raunit Staging")
        }
        create("prod") {
            dimension = "Raunit"
            applicationId = "com.raunit.myprofileapp"
            resValue(type = "string", name = "app_name", value = "Raunit")
        }
    }

    buildFeatures.resValues = true
}