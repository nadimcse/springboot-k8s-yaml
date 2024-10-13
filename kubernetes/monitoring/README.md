# Controls
- kubectl apply -f prometheus.yaml 
- kubectl apply -f alert-manager.yaml 
- kubectl -n monitoring port-forward svc/prometheus-service 9090
- kubectl -n monitoring port-forward svc/alertmanager 9093

# Links
- https://devopscube.com/setup-prometheus-monitoring-on-kubernetes/
- https://devopscube.com/alert-manager-kubernetes-guide/
- https://app.brevo.com/settings/keys/smtp