#!/bin/bash
read -p "Enter the string: " name
echo " "

name1=$(echo $name | rev)
if [ "$name" == "$name1" ]
then
echo "**$name is palindrome**"
else
echo "**$name is not a palindrome**"
fi