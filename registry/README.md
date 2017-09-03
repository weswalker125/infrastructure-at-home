# Registry

## Build

`./gradlew clean build`

`./gradlew bootRun`

`./gradlew containerize -Pversion=${version}`

## Run container

`docker run -p 8761:8761 -t com.dubyatoo/registry:${version}`
