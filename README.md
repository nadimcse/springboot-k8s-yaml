# Minikube 
- minikube start --driver=docker --alsologtostderr
- minikube service (service name) --url

# Kind
- kind get clusters
- kind create cluster --name butterfly-cluster --image kindest/node:v1.23.5
- kind delete cluster --name kind-test-cluster

# Kubernetes
- kubectl delete --all pods --n test
- kubectl delete all --all -n test
- kubectl exec -it spring-boot-k8s-76d4d66fcb-59bss -n test  -- /bin/sh
- kubectl config  use-context minikube
- kubectl auth can-i get pods -n test --as=system:serviceaccount:test:spring-boot-k8s-sa
- kubectl get endpoints | grep kubernetes
- kubectl port-forward -n test svc/springboot-k8s-svc 8080
- kubectl config get-contexts

# steps to deploy
```
 1. deploy nginx ingress
 2. deploy cert manager
 3. deploy spring app 
```
