# spring-boot-timesample

### Dockerize
Create `Dockerfile` like the one in this repo
    mvn package
    docker build -t spring-boot-timesample .

### Push image
    docker tag spring-boot-timesample jaimegag/spring-boot-timesample
    docker push jaimegag/spring-boot-timesample

### Run in Docker
    docker run -ti --rm -p 8080:8080 jaimegag/spring-boot-timesample

### Deploy in Kubernetes
