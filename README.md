Openfire Out Of Tree Plugin Example
=========

About
-----
[Openfire] is a real time collaboration (RTC) server licensed under the Open Source Apache License. It uses the only widely adopted open protocol for instant messaging, XMPP (also called Jabber). Openfire is incredibly easy to setup and administer, but offers rock-solid security and performance.

This project intends to provide an example standalone project and build script to demonstrate a way in which to develop and maintain an Openfire plugin independently of the Openfire source code.

Building
--------

Building is done using Ant. Before building this project you must:

* Ensure that OPENFIRE_HOME is set to the root directory of an openfire source code repository.

e.g. On Linux #export OPENFIRE_HOME=/home/dan/Sources/Openfire.git#

* Perform a build of the openfire server inside the OPENFIRE_HOME and any related plugins

After building the openfire plugin may be found in the target directory.
