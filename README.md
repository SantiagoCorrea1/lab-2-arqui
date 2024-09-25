# Aplicaticion de prueba

[![CI/CD Pipeline](https://github.com/SantiagoCorrea1/lab-2-arqui/actions/workflows/build.yml/badge.svg)](https://github.com/SantiagoCorrea1/lab-2-arqui/actions/workflows/build.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=SantiagoCorrea1_lab-2-arqui&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=SantiagoCorrea1_lab-2-arqui)
[![Bugs](https://sonarcloud.io/api/project_badges/measure?project=SantiagoCorrea1_lab-2-arqui&metric=bugs)](https://sonarcloud.io/summary/new_code?id=SantiagoCorrea1_lab-2-arqui)
[![Code Smells](https://sonarcloud.io/api/project_badges/measure?project=SantiagoCorrea1_lab-2-arqui&metric=code_smells)](https://sonarcloud.io/summary/new_code?id=SantiagoCorrea1_lab-2-arqui)
[![Coverage](https://sonarcloud.io/api/project_badges/measure?project=SantiagoCorrea1_lab-2-arqui&metric=coverage)](https://sonarcloud.io/summary/new_code?id=SantiagoCorrea1_lab-2-arqui)
[![Duplicated Lines (%)](https://sonarcloud.io/api/project_badges/measure?project=SantiagoCorrea1_lab-2-arqui&metric=duplicated_lines_density)](https://sonarcloud.io/summary/new_code?id=SantiagoCorrea1_lab-2-arqui)
[![Security Rating](https://sonarcloud.io/api/project_badges/measure?project=SantiagoCorrea1_lab-2-arqui&metric=security_rating)](https://sonarcloud.io/summary/new_code?id=SantiagoCorrea1_lab-2-arqui)
[![Technical Debt](https://sonarcloud.io/api/project_badges/measure?project=SantiagoCorrea1_lab-2-arqui&metric=sqale_index)](https://sonarcloud.io/summary/new_code?id=SantiagoCorrea1_lab-2-arqui)
[![Maintainability Rating](https://sonarcloud.io/api/project_badges/measure?project=SantiagoCorrea1_lab-2-arqui&metric=sqale_rating)](https://sonarcloud.io/summary/new_code?id=SantiagoCorrea1_lab-2-arqui)
[![Vulnerabilities](https://sonarcloud.io/api/project_badges/measure?project=SantiagoCorrea1_lab-2-arqui&metric=vulnerabilities)](https://sonarcloud.io/summary/new_code?id=SantiagoCorrea1_lab-2-arqui)


Implementation of a Simple App with the next operations:
    
	* Get random nations
	* Get random currencies
	* Get random airplanes
	* Get application version
	* health check
	
	Including integration with GitHub Actions, Sonarqube (SonarCloud), Coveralls and Snyk
	
	### Folders Structure
	
	In the folder `src` is located the main code of the app
	
	In the folder `test` is located the unit tests
	
	### How to install it
	
	Execute:
	
	```shell
	$ mvnw spring-boot:run
	```
	to download the node dependencies
	
	### How to test it
	
	Execute:
	
	```shell
	$ mvnw clean install
	```
	
	### How to get coverage test
	
	Execute:
	
	```shell
	$ mvwn -B package -DskipTests --file pom.xml
	```
