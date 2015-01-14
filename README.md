Synopsis
========

This is the example created for the [E-POST Meetup](http://www.meetup.com/eposttechtalk/) tech talk **"Self-describing REST-Services with RAML and BPMN"**

It consist of a Spring Boot Application with Jersey starter module and the presented *RAML to JAX-RS* and *brainslug BPMN renderer* plugins.


After a run of

    mvn clean install

the HTML documentation based on the RAML file will be generated in `target/raml/music.raml.html` and
the generated BPMN files will go to `target/flows`.

The application might be run with

    mvn spring:boot run

LICENSE
=======

MIT, see LICENSE file.