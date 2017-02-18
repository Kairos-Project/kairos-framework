# kairos-framework
Kairos lets you build JavaFX applications using Activities and Fragments as Android, creating an awesome UI with Material Design 

* **Material design ready**:  Make a material design style app using the built-in theme and components as well as customize easily the color palette. 
* **Enhanced Workflow** : Works with gradle to help you to manage dependencies and use beautiful tasks that provide a professional deploy.
* **Reusable and Modular Code** : Whether you come from the android developer world, you are in the right place. Improve your JavaFX apps using Activities and Fragments

## Installing Kairos

Kairos utilizes Gradle to manage its dependencies and enhance the development tasks. If you are using Gradle you must replace one line of code in the top of your **build.gradle**

```gradle
apply plugin: 'java'

```
To

```gradle
apply from: 'http://dl.bintray.com/content/shemnon/javafx-gradle/8.1.1/javafx.plugin'
apply plugin:'maven'
```
Thanks to shemnon to provide this amazing gradle plugin.

### Gradle Installation (Gradle Repository)

First you need add JitPack in the gradle repositories. 

```gradle
repositories {
   maven { url "https://jitpack.io" }
   mavenCentral()
}
```

Finally add the framework to the gradle dependencies

```gradle
dependencies {
   compile 'com.github.marconi1992:kairos-framework:0.5'
}
```

### Gradle Installation (With JAR)

Download the Jar Library and add in the gradle dependencies

https://github.com/Kairos-Project/kairos-framework/releases/download/0.5/kairos-all-0.5.jar

I had to create a folder called libs in the root of the project but you can choose any name, then place the jar inside of the folder and add the next dependency in gradle.

```gradle
dependencies {
   compile files ('libs/kairos-all-0.5.jar')
}
```

## Installing with IDE
Using the default build tool of your favorite IDE the process could be different. But don't worry if in the past you had installed another java library , the process is the same.
	
### Intellij IDE
Place the file inside of your ja	va project.

* Go to File -> Project Structure 
* Select the Module section
* In the dependencies  tab select the plus green icon and select Jars or Directories
* In the file chooser select the jar , confirm and apply

### NetBeans IDE

* Go to the Projects Section
* In the project tree, right click in Libraries
* Select Add JAR/Folder
* In the File Chooser select the jar and confirm

## <a name="v1-projects"></a>Example Projects

<!-- AUTO-GENERATED-CONTENT:START (GENERATE_SERVERLESS_PLUGIN_TABLE)-->
| Project Name | Author |
|:-------|:------:|
| **[SlidingTab](https://github.com/Kairos-Project/kairos-example/tree/master/SlidingTab)** <br/> Comple SlidingTab Example Project with Drawing Menu| [kairos](https://github.com/Kairos-Project) | 
<!-- AUTO-GENERATED-CONTENT:END -->


