# Set jaeger operator
- create namespace observability
- install jaeger operator: kubectl apply -f https://github.com/jaegertracing/jaeger-operator/releases/download/v1.36.0/jaeger-operator.yaml -n observability

# Deploy jaeger components
- kubectl apply -f jaeger-jaeger-simple-prod.yaml

# Links
- https://faun.pub/how-to-deploy-jaeger-on-kubernetes-69cf48447182
- https://medium.com/cloud-native-daily/how-to-send-traces-from-spring-boot-to-jaeger-229c19f544db
- https://medium.com/@akashjoffical08/implement-distributed-tracing-with-jaeger-opentelemetry-on-kubernetes-3e35cb77b536
- https://blog.searce.com/jaeger-a-distributed-tracing-system-by-uber-technologies-e312c4b21475