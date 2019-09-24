# QA-Basic-Automatization
In this repository are the basic configurations to automate a web page

To create a new project we do the following:

In our editor (in my case Eclipse) we go to the option of: 
1) File->New->Other->Maven Project (next)
2) in the next view, fill the next fields: Group Id: com.[companyname].[projectname] and in the field Artifact Id fill with the [functionalityName]

3)
in the pom.xml file we can add all the dependencies needed in the project, which are on the maven page (https://mvnrepository.com/) 

In this case we are going to configure the Selenium library (https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java/3.141.59)

  <!-- https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java -->
<dependencies>
	<dependency>
	    <groupId>org.seleniumhq.selenium</groupId>
	    <artifactId>selenium-java</artifactId>
	    <version>3.141.59</version>
	    <scope>test</scope>
    </dependency>
    <!-- https://mvnrepository.com/artifact/junit/junit -->
	 <dependency>
	    <groupId>junit</groupId>
	    <artifactId>junit</artifactId>
	    <version>4.12</version>
	    <scope>test</scope>
	 </dependency>    
</dependencies>

4) Creanting a new Java class:
package QaBasicAutomatization;

public class GoogleSearchText {

}


With that help us to use, download dependencies that we need later.
