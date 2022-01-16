# jee8project-archetype
Maven archetype for building a basic Jakarta EE 8 project with JDK 11.

## Build & install
To build and install locally do

    mvn clean install

## Usage
To create a project from the archetype (after installing it locally) do

    mvn archetype:generate -B -DarchetypeCatalog=local \
    -DarchetypeGroupId=org.dirtylabcoat -DarchetypeArtifactId=jee8project-archetype \
    -DarchetypeVersion=1.3 -DgroupId=com.example -DartifactId=myapp

