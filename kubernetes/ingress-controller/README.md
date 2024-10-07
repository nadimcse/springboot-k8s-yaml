# Controls
- kind create cluster --name butterfly-cluster --image kindest/node:v1.23.5

- cd kubernetes
- docker run -it --rm -v ${HOME}:/root/ -v ${PWD}:/work -w /work --net host alpine sh
- cd ingress-controller
- install curl: apk add --no-cache curl
- install kubectl
  ```
  curl -LO https://storage.googleapis.com/kubernetes-release/release/`curl -s https://storage.googleapis.com/kubernetes-release/release/stable.txt`/bin/linux/amd64/kubectl
  chmod +x ./kubectl
  mv ./kubectl /usr/local/bin/kubectl

  ```
- install helm
  ```
  curl -o /tmp/helm.tar.gz -LO https://get.helm.sh/helm-v3.10.1-linux-amd64.tar.gz
  tar -C /tmp/ -zxvf /tmp/helm.tar.gz
  mv /tmp/linux-amd64/helm /usr/local/bin/helm
  chmod +x /usr/local/bin/helm
  ```  
- installation YAML  
  ```
    helm repo add ingress-nginx https://kubernetes.github.io/ingress-nginx
  
    helm search repo ingress-nginx --versions
  
    mkdir -p ./nginx/manifests/
  
    kubectl create namespace butterfly
  
    helm template ingress-nginx ingress-nginx \
  --version ${CHART_VERSION} \
  --namespace butterfly --insecure-skip-tls-verify \
  > ./nginx/manifests/nginx-ingress.${APP_VERSION}.yaml
  
  ```    
- Deploy ingress controller:  kubectl apply -f ./nginx/manifests/nginx-ingress.${APP_VERSION}.yaml
- 
- verify ingress
   ``` 
   kubectl -n butterfly get pods
   kubectl -n butterfly get svc
   kubectl -n butterfly port-forward svc/ingress-nginx-controller 443
  ```