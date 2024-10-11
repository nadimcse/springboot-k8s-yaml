# Controls
- kubectl apply -f deployment.yaml
- kubectl exec -it metrics-scraper -n metrics-scraper  -- sh
- curl for metrics
 ```
  curl \
  --cacert /var/run/secrets/kubernetes.io/serviceaccount/ca.crt \
  -H "Authorization: Bearer $(cat /var/run/secrets/kubernetes.io/serviceaccount/token)"  \
  https://kubernetes.default.svc/metrics
 ```
# Link
- https://yuki-nakamura.com/2023/10/10/get-kube-apiservers-metrics-manually/