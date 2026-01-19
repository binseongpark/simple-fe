```bash
./gradlew wrapper --gradle-version 8.14 --distribution-type bin
```bash
```
```bash
kubectl create namespace 
```

```bash
kubectl get all -n frontend
kubectl get pod -n frontend -o wide
```

```bash
# 1. 기존 배포된 리소스 정리 (삭제)
skaffold delete

# 2. Gradle 빌드 폴더 정리 (옛날 클래스 파일 삭제)
./gradlew clean
```

```bash
curl -i http://192.168.41.32:30080/ping
```

```bash
http://simple-fe.local/ping
```

```bash
# 다른 namespace 찾아가기
http://simple-be.<네임스페이스>.svc.cluster.local
```