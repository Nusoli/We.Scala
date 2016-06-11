# We.Scala

https://www.valtech.fr/

This is an AEM 6.2 sample implementation for Scala developpement in AEM.
The project is based on the we.retail implementation from Adobe.

## Modules

The main parts of the template are:

* core: Scala bundle containing core functionality like OSGi services, servlet and Models.
* content.apps: contains the /apps and install folder for the needed bundle library

## How to build

To build all the modules run in the project root directory the following command with Maven 3:

    mvn clean install

If you have a running AEM instance you can build and package the whole project and deploy into AEM with  

    mvn clean install -PautoInstallPackage

    
Or to deploy only the bundle to the author, run

    mvn clean install -PautoInstallBundle

To build a single package

    mvn clean install -PbuildSinglePackage

To install single package on an AEM instance

    mvn clean install -PbuildSinglePackage -PautoInstallSinglePackage

## Maven settings

The project comes with the auto-public repository configured. To setup the repository in your Maven settings, refer to:

    http://helpx.adobe.com/experience-manager/kb/SetUpTheAdobeMavenRepository.html

## Credit
https://www.valtech.fr/