# gwt-titanium

Implementation of Titanium Mobile SDK 1.7.2 in GWT.
Copyright 2011, Uri Shaked. Licensed under the APACHE license.

[Homepage](http://www.iPhoneJava.org/ "The iPhoneJava Project Homepage")

### Features

 - Custom linker to limit GWT bloat
 - Generated code runs directly under the Titanium Mobile SDK
 - Wrappers to the entire Titanium Mobile API
 - Javadocs for most methods and properties
 - Utility classes to perform common tasks (os version detection, timers, etc)
 - Available as a maven package, for quick integration into your automated build process
 
### Limitations

 - Some of the API is still untested
 - No support for direct Java debugging (but we are working on it!)

## Building gwt-titanium

gwt-titanium is built with [Apache Maven](http://maven.apache.org/ "Apache Maven"). Download
and install maven on your system, then execute the following command from the project's root
directory:

	mvn install

If you are using eclipse, you can also have maven automatically generate an eclipse project
file for you. Execute the following command:

	mvn eclipse:eclipse

## Use in your maven project

Follow the tutorial on our blog:

[Step by step tutorial for creating a gwt-titanium project with Apache Maven](http://www.iphonejava.org/2011/07/iphonejava-goes-with-maven/)

Check out the sample "hello-world" application:
[iphonejava-hello-world](https://github.com/urish/iphonejava-hello-world)
