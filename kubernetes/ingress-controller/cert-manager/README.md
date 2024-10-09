# Generate crt
- cd cert-manager
- OpenSSL genrsa -out ca.key 2048
- openssl req -x509 -new -nodes  -days 8650 -key ca.key -out ca.crt -subj "/CN=pink.butterfly-np.com"

# install cert manager
- helm repo add jetstack https://charts.jetstack.io --force-update
- helm install cert-manager jetstack/cert-manager --namespace cert-manager --create-namespace --version v1.16.0 --set crds.enabled=true
- helm uninstall cert-manager -n cert-manager

[//]: # (- kubectl apply -f https://github.com/jetstack/cert-manager/releases/download/v1.16.0/cert-manager.yaml)

[//]: # (- kubectl delete -f https://github.com/jetstack/cert-manager/releases/download/v1.16.0/cert-manager.yaml)

# deploy cert
- kubectl apply -f self-signed-tls-cert-manager.yaml 
