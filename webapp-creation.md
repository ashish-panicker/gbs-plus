# Creating Java web application using maven

Command to create java based web application using mvn.

```sh
mvn archetype:generate
-DarchetypeArtifactId="maven-archetype-webapp"
-DarchetypeGroupId="org.apache.maven.archetypes"
-DarchetypeVersion="1.4"
-DgroupId="com.gbs.plus"
-DartifactId="web-app-name"
```

## Setting up the pom file

### Dependencies

Servlet API

```xml
    <dependency>
      <groupId>javax.servlet</groupId>
      <artifactId>javax.servlet-api</artifactId>
      <version>3.1.0</version>
      <scope>provided</scope>
    </dependency>
```

### Build Plugins

```xml

    <!-- mvm compiler plugin -->
    <plugin>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.8.1</version>
        <configuration>
            <release>11</release>
        </configuration>
    </plugin>

    <!-- mvn war plugin -->
    <plugin>
        <artifactId>maven-war-plugin</artifactId>
        <version>3.2.3</version>
    </plugin>

    <!-- eclipse jetty plugin -->
    <plugin>
        <groupId>org.eclipse.jetty</groupId>
        <artifactId>jetty-maven-plugin</artifactId>
        <version>10.0.0</version>
        <configuration>
          <scanIntervalSeconds>10</scanIntervalSeconds>
          <webApp> 
            <!-- provide a context path starting with / -->
            <contextPath></contextPath>
          </webApp>
          <httpConnector>
            <!-- provide a prort number -->
            <port></port>
          </httpConnector>
        </configuration>
    </plugin>
```

## Setting up the **Standard Deployment Descriptor** web.xml file

```xml
<?xml version="1.0" encoding="UTF-8"?>
<web-app xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" 
    xmlns="http://xmlns.jcp.org/xml/ns/javaee" 
    xsi:schemaLocation="http://xmlns.jcp.org/xml/ns/javaee http://xmlns.jcp.org/xml/ns/javaee/web-app_3_1.xsd" 
    id="WebApp_ID" version="3.1">

  <display-name></display-name>

  <welcome-file-list>
    <welcome-file></welcome-file>
  </welcome-file-list>
</web-app>
```
