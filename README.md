# Transporte de logs da aplicação Siga para Elasticsearch/Kibana 

## Referências

- https://event-driven.io/en/tricks_on_how_to_set_up_related_docker_images/
- https://github.com/EventStore/samples
- https://www.elastic.co/guide/en/beats/filebeat/8.3/_step_2_exclude_all_processed_files.html

## Fluxo

- Entrada: Filebeat lê arquivos de log no formato log.json gerados pelo Log4j contidos no diretório de configuração de input (filestream)
- Saída: Filebeat envia os registros de log lidos para um servidor Elasticsearch
- Apresentação: Kibana apresenta os registros de log indexados no Elasticsearch

## Requisitos
- Docker
- Docker Compose
- Arquivos de log no formato log.json armazenados no diretório configurado como input no Filebeat