# Gateway

## Build

`./gradlew clean build`

`./gradlew bootRun`

`./gradlew containerize -Pversion=${version}`

## Run container

`docker run -p 8082:8082 -t com.dubyatoo/gateway:${version}`
