
# Overview

Test task to find a tree's maximum height.

## Build docker image

```bash
$> ./mvnw clean package docker:build
```

## Package, verify and run

```bash
$> ./mvnw clean package verify; and java -jar target/tree-height-1.0.0.jar
```
