#!/bin/bash

read -p "Enter the path: " pth

if [[ -d $pth ]]
then
	echo "$pth is a directory"
elif [[ -f $pth ]]
then
 	echo "$pth is a file"
else
 	echo "$pth is not valid file or directory"

fi