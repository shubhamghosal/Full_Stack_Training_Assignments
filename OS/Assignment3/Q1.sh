#!/bin/bash
read -p "Enter username: " usrname
var=$(cat /etc/passwd | grep "$usrname")
if [[ -n $var ]]
	then
		echo "User '$usrname'  is present on the system"
	else
		echo "User '$usrname' does not exist"
fi