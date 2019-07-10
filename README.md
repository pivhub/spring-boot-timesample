# spring-boot-timesample

### Dockerize
Create `Dockerfile` like the one in this repo

    mvn package
    docker build -t spring-boot-timesample .

### Push image
    docker tag spring-boot-timesample pkhamdee/spring-boot-timesample
    docker push pkhamdee/spring-boot-timesample

### Run in Docker
    docker run -ti --rm -p 8080:8080 pkhamdee/spring-boot-timesample
