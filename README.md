# Awsome-Toast
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
	        implementation 'com.github.jingil:Awsome-Toast:1.0.1'
	}


Use:

First import

	import support.fuchsia.animatedtoast.AnimatedToast;
	
Then you can just call the show toast method by syntax

	AnimatedToast.showToast(context,message, duration_of_message, toast_type);
	
Examples:
	
	 AnimatedToast.showToast(getApplicationContext(), "This is a sample success toast!", AnimatedToast.LENGTH_LONG, AnimatedToast.SUCCESS);
	 
	 
	 AnimatedToast.showToast(getApplicationContext(), "This is a sample failure toast!", AnimatedToast.LENGTH_LONG, AnimatedToast.ERROR);
			 
         
	 AnimatedToast.showToast(getApplicationContext(), "This is a sample info toast!", AnimatedToast.LENGTH_LONG, AnimatedToast.INFO);
		
         
	 AnimatedToast.showToast(getApplicationContext(), "This is a sample warning toast!", AnimatedToast.LENGTH_LONG, AnimatedToast.WARNING);



Please check the sample project for more details.


This project is licensed under Apache License 2.0. 
Commercial use, Modification, Distribution, Private use are permitted.

Enjoy :)
