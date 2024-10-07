# Controls
- kind create cluster --name butterfly-cluster --image kindest/node:v1.23.5

- image create: ./mvnw clean compile jib:build -Djib.to.tags=latest -Djib.to.auth.username=doc185174 -Djib.to.auth.password=

- Deploy and run
    ```
    cd springboot-k8s
    kubectl apply -f deployment.yaml
    kubectl delete -f deployment.yaml
    curl -k https://pink.butterfly-np.com/message
    ```
