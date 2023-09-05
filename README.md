# Springboot-PostgreSQL-K8S

---
<img src="img/springboot_postgres_k8s.png" />

## Deps Download
- [Minikube](https://minikube.sigs.k8s.io/docs/start/)
- [Kubectl](https://kubernetes.io/docs/tasks/tools/install-kubectl-windows/)

> - I have used **HyperV** driver to create minikube K8S Cluster, So it isn't necessary to have Docker Desktop in local
> - Enable HyperVirtualization from windows Features.
> - If Windows feature wasn't there,  [Check this](https://www.xda-developers.com/how-to-install-hyper-v-windows-11-home/)

## Steps
- Start Minikube `minikube start --driver=hyperv`
- Check Status `minikube status`
- Then apply all the kustomize files
`kubectl apply -f <config.yml>`
- To access the service, needs to get the ip addrs
`minikube ip`
- To access the dashboard use `minikube dashboard`

| <img src='img/minikube.png' />                         | <img src='img/kubectl.png' /> |
|--------------------------------------------------------|-------------------------------|
| <img src='img/webapp.png' />                           | <img src='img/postgres.png'/> |
 <img src='img/kube-dashboard.png'/>
