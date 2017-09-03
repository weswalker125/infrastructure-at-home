# Run gateway/registry environment

`./gradlew containerize -Pversion=${version}`
`docker run  -d --name=registry -p 8761:8761 com.dubyatoo/registry:${version}`
`docker run  -d --name=gateway -p 8082:8082 com.dubyatoo/gateway:${version}`