#!/bin/bash

echo "Enter a String"
read text

# Counting words
word=$(echo -n "$text" | wc -w)
# Counting characters
char=$(echo -n "$text" | wc -c)

# Counting Number of white spaces
# sed "s/ change this to whitespace//g"
space=$(expr length "$text" - length `echo "$text" | sed "s/ //g"`)

# Counting special characters
special=$(expr length "${text//[^\~!@#$&*()]/}")

# Output
echo "Number of Words = $word"
echo "Number of Characters = $char"
echo "Number of White Spaces = $space"
echo "Number of Special symbols = $special"