#!/bin/bash
read -p "Enter username: " user
var=$(cat /etc/passwd | grep "^$user\>" | cut -d':' -f3)
if [[ -n $var ]]
	then
		echo "Userid is $var."
        else
		echo "User not present"
fi