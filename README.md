# raunit_giri_app

A new Flutter project with custom name and icon.
Three application flavors:

Development (dev)
Staging (staging)
Production (prod)
#Installation

##Clone the repository:

git clone https://github.com/<your-username>/flutter-my-profile-app.git
cd flutter-my-profile-app

##Install dependencies:

flutter pub get

Generate the flavor configuration (if required):

dart run flutter_flavorizr

#Running the Application
##Development
flutter run --flavor dev
##Staging
flutter run --flavor staging
##Production
flutter run --flavor prod
