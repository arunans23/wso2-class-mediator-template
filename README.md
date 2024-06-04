# WSO2 Class Mediator Template

A sample `WSO2 Class Mediator` temlate to get started.


### Build Project

Clone or download and the class mediator implementation and make the related chanages to the Mediation flow and build the project.

Use the following command to build the project

```sh
mvn clean package
```

After a successful build, copy the JAR artifact fromt the `/target` folder and place it inside the `<WSO2-SERVER>/repository/components/lib` directory.

### Design In-Sequence

Design an `in-sequence` flow to invoke the class mediator implementation to connect and communicate with the defined external datasource. Given below is a sample `in-sequence` ...

```xml
<sequence xmlns="http://ws.apache.org/ns/synapse" name="dasample">
    <!-- defining the class mediator -->
    <class name="com.sample.mediator.MyMediator" />
</sequence>
```
