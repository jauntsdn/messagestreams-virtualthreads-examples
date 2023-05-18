![Message-Streams](readme/mstreams.png)

[![Build](https://github.com/jauntsdn/messagestreams-virtualthreads-examples/actions/workflows/ci-build.yml/badge.svg)](https://github.com/jauntsdn/messagestreams-virtualthreads-examples/actions/workflows/ci-build.yml)

### Message-Streams with Virtual Threads

Demo for [Message streams](https://github.com/jauntsdn/rsocket-jvm) services with simple blocking API using jdk's `virtual threads`, 
codegen/protobuf based RPC compatible with GRPC & similar developer experience. 

Example showcases how to transfer plain java calls with virtual threads over TCP, unix sockets, websockets, 
or consume with GRPC clients.

Also It outlines following properties of applications based on Message-Streams:

* Services,APIs / networking,runtime decoupling
* Tiny service Jar & app distribution size
* Fast startup / first request time
* Small memory footprint

### Building

`./gradlew clean build`

Regenerate service/proto stubs (amd64 linux, windows):

`./gradlew clean build -PgenerateProto=true`