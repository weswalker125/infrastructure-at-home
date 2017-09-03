# Run gateway/registry environment

build java projects, build docker images
```
./gradlew containerize -Pversion=${version}
```


run both images in new containers
```
docker run  -d --name=registry -p 8761:8761 com.dubyatoo/registry:${version}
docker run  -d --name=gateway -p 8082:8082 com.dubyatoo/gateway:${version}
```
