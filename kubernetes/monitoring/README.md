# Controls
- kubectl apply -f prometheus.yaml 
- kubectl apply -f alert-manager.yaml 
- kubectl apply -f grafana.yaml 
- kubectl -n monitoring port-forward svc/prometheus-service 9090
- kubectl -n monitoring port-forward svc/alertmanager 9093
- kubectl -n monitoring port-forward svc/grafana-service 3000

# Links
- https://devopscube.com/setup-prometheus-monitoring-on-kubernetes/
- https://devopscube.com/alert-manager-kubernetes-guide/
- https://app.brevo.com/settings/keys/smtp
- https://devopscube.com/setup-grafana-kubernetes/