# gbs-plus

Training repo for GB Plus


## Setup the development environment

### Git

[Download Git](https://git-scm.com/downloads)

### Java

Java version `11` is used to develop the demos. You need to have Java `1.8` or above to use these demos without any trouble.

[Download JDK 11](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)

Setup **JAVA_HOME**
- Install JDK 11 into your system.
- Copy the installed JDK path.
- Create a new environment variable **JAVA_HOME** and set it to the installed JDK path.
- Update the PATH variable by adding the path to the JDK bin folder.
- Set JAVA_HOME in windows via command prompt.
    ```bash
    # The setx command permanently updates the environment variables.

    setx JAVA_HOME "C:\Program Files\Java\jdk-11.0.2" # assuming JDK 11 is installed in C:\Program Files\Java\jdk-11.0.2
    setx PATH "%PATH%;%JAVA_HOME%\bin"; # add the path to the JDK bin folder

    # You can use the -m switch along with setx command if you are trying to the set the enviroment varibles for whole system. 
    # This require administratir privileages.

    setx -m JAVA_HOME "C:\Program Files\Java\jdk-11.0.2" # assuming JDK 11 is installed in C:\Program Files\Java\jdk-11.0.2
    setx -m PATH "%PATH%;%JAVA_HOME%\bin"; # add the path to the JDK bin folder
    ```
- Check this [tutorial](https://youtu.be/nNKMplW-Tmw) if you are having trouble.
- To verify the JAVA_HOME variable is properly set, run the following command.
    ```bash
    java -version
    javac -version
    ```

### Maven

We are using maven to build our java applications. Maven version `3.8` is used, minimum required version is `3.6.3`.

[Download Maven](https://dlcdn.apache.org/maven/maven-3/3.8.2/binaries/apache-maven-3.8.2-bin.zip)

Setup **MAVEN_HOME**
- Install Maven into your system.
- Set MAVEN_HOME in windows via command prompt.
    ```bash
    setx MAVEN_HOME "C:\Apache\apache-maven-3.8.2" # assuming Maven 3.8.2 is installed in C:\Apache\apache-maven-3.8.2
    setx PATH "%PATH%;%MAVEN_HOME%\bin"; # add the path to the Maven bin folder
    ```
- To verify the MAVEN_HOME variable is properly set, run the following command.
    ```bash
    mvn -version
    ```

### Node JS

[Download Node JS](https://nodejs.org/en/download/)

Once downloaded installation is straight forward.

### IDE - VS Code

[Download VS Code](https://code.visualstudio.com/download)

Setup **VS Code** for Java development
- Install VS Code into your system.
- Install the following plugins into VS Code.
  - [Extention Pack For Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
  - [Spring Boot Extension Pack](https://marketplace.visualstudio.com/items?itemName=Pivotal.vscode-boot-dev-pack)
- [Getting Started with Java in VS Code](https://code.visualstudio.com/docs/java/java-tutorial) follow this link to know more.

```

### Additional references

- [VSCode Java Support](https://code.visualstudio.com/docs/languages/java)
