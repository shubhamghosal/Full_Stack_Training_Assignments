#!/bin/bash
# Script to add a user including passsword

if [ $(id -u) -eq 0 ]; then
	read -p "Enter username : " username
	egrep "^$username" /etc/passwd >/dev/null
	if [ $? -eq 0 ]; then
		echo "$username exists!"
		exit 1
	else
		pass=$username
		useradd -m -p "$pass" "$username"
		[ $? -eq 0 ] && echo "User has been added to system!" || echo "Failed to add a user!"
		usermod -s /sbin/nologin $username
	fi
else
	echo "Only root may add a user to the system."
	exit 2
fi