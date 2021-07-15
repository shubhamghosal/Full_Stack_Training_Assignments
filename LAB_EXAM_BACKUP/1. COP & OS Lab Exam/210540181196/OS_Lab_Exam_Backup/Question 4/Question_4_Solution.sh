#!/bin/bash

read -p "Enter the number1: " num1
read -p "Enter the number2: " num2

echo  "Enter your choice:"
echo "1 for add"
echo "2 for substract"
echo "3 for multiply"
read -p "Enter your choice" ch

#Function to add numbers
Addition()
{
var1=$(($num1 + $num2))
echo "Addition of numbers is $var1"
}
#Function to subtract numbers
Subtraction()
{
var2=$(($num1 - $num2))
echo "Subtraction of numbers is $var2"
}
#Function to multiply numbers
Multiplication()
{
var3=$(($num1 * $num2))
echo "Addition of numbers is $var3"
}


case "$ch" in
	1)Addition $num1 $num2
	;;

	2)Subtraction $num1 $num2
	;;

	3)Multiplication $num1 $num2
	;;

	*)echo "Wrong input"
	;;
esac