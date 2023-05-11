#!/bin/bash

docker build -t getting-things-done/eureka/query-service ../gtd-query-service
docker build -t getting-things-done/eureka/command-service ../gtd-command-service
docker build -t getting-things-done/eureka/discovery-service ../gtd-discovery-service