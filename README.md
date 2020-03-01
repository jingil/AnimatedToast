# Animated Toast
Animated Toast Library using Lottie animation and Typewriter animation


To get this library into your build:

Step 1. Add this repository to your build file

Add it in your root build.gradle at the end of repositories:

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.jingil:AnimatedToast:V1.0.0'
	}


Use:
	
Then you can just call the show toast method by syntax

 	makeToast(Context context, String message, int duration) 
 
 	or
 
 	makeToast(Context context, String message, int duration, int style)
 
 	or
  
 	makeToast(Context context, String message, int duration, int style, int gravity)
  
  	or
  
 	makeToast(Context context, String message, int duration, int style, int gravity, String backgroundcolor)
 
		
Examples:
	
	new AnimatedToast.makeToast(MainActivity.this, "This is a sample success toast!", AnimatedToast.LENGTH_LONG, AnimatedToast.SUCCESS, AnimatedToast.TOP).show();
	 
	new AnimatedToast.makeToast(MainActivity.this, "This is a sample failure toast!", AnimatedToast.LENGTH_LONG, AnimatedToast.FAILURE, AnimatedToast.BOTTOM).show();
         
	new AnimatedToast.makeToast(MainActivity.this, "This is a sample warning toast!", AnimatedToast.LENGTH_LONG, AnimatedToast.WARNING, AnimatedToast.CENTER).show();
                
	new AnimatedToast.makeToast(MainActivity.this, "This is a sample info toast!", AnimatedToast.LENGTH_LONG, AnimatedToast.INFO, AnimatedToast.TOP).show();


Please check the sample project for more details.

This project is licensed under Apache License 2.0. 
Commercial use, Modification, Distribution, Private use are permitted.

Please feel free to contact me on jingilandroid@gmail.com if any help needed. 

Enjoy :)
