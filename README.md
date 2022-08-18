# Transporte de logs da aplicação Siga para Elasticsearch/Kibana 

## Fluxo

- Entrada: Filebeat lê arquivos de log no formato log.json gerados pelo Log4j contidos no diretório de configuração de input (filestream)
- Saída: Filebeat envia os registros de log lidos para um servidor Elasticsearch
- Apresentação: Kibana apresenta os registros de log indexados no Elasticsearch

## Requisitos
- Docker
- Docker Compose
- Arquivos de log no formato log.json armazenados no diretório configurado como input no Filebeat