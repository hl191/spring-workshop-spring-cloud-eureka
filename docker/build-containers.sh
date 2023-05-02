#!/bin/bash

docker build -t getting-things-done/query-service ../gtd-query-service
docker build -t getting-things-done/command-service ../gtd-command-service