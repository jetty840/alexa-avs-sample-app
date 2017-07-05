#!/bin/sh
install -Dm644 ./npm.service /usr/lib/systemd/system/npm.service
mkdir -p /etc/systemd/system/npm.service.d/
systemctl daemon-reload
systemctl enable npm.service

install -Dm644 ./mvn.service /usr/lib/systemd/system/mvn.service
mkdir -p /etc/systemd/system/mvn.service.d/
systemctl daemon-reload
systemctl enable mvn.service

install -Dm644 ./wakeword.service /usr/lib/systemd/system/wakeword.service
mkdir -p /etc/systemd/system/wakeword.service.d/
systemctl daemon-reload
systemctl enable wakeword.service
