# ColorChange-Android-Lib
A Library to chnage the color of any view in the background for Android

To use this library in your project

<img src="https://github.com/nasirbashak/ColorChange-Android-Lib/blob/master/Screenshots/2dzx9y.gif"/>

<img src="https://github.com/nasirbashak/ColorChange-Android-Lib/blob/master/Screenshots/2dzxr4.gif"/>

<img src="https://github.com/nasirbashak/ColorChange-Android-Lib/blob/master/Screenshots/2dzxcf.gif"/>

Step 1. Add the JitPack repository to your build file

      Add it in your root build.gradle at the end of repositories:
      
      allprojects {
	
	repositories {
	     ...
 	      maven { url 'https://jitpack.io' }
		}
	}
  
Step 2. Add the dependency 
  
  dependencies {
  
		implementation 'com.github.nasirbashak:ColorChange-Android-Lib:3.0.0'

	}

<a href="https://github.com/nasirbashak/ColorChange-Android-Lib/blob/master/app/src/main/java/com/nasirbashak007gmail/colorchange/MainActivity.java">Sample code</a>

Provide the start and end range of colors of ur choice to get required color splashing,
the delays are optional. While initializing the object pass the Application Context as the argument
