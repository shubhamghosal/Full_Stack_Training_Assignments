Day 13


Before completing the pending work , please follow this sequence

0. Revise today's work by importing eclipse projects

Create a new eclipse project
1. Store book details in a library in hashing based data structure : HashSet
Book details : title(string),category(enum),price(double),publishDate,authorName(string),quantity(int)
Unique ID : book title
Accept at least 5 book details from user & confirm if hash set is working in a correct manner.

2. Store book details in a library in hashing based data structure : HashMap<String,Book>

Book details : title(string),category(enum),price(double),publishDate,authorName(string),quantity(int)
Unique ID : book title
Create a pre-populated map with sample data.(put) : 5 entries
Supply following options
2.1 Add book.
I/P Book details
(containsKey/get)
title --(containsKey:false) doesn't exist --prompt for remaining book details
exists --(containsKey:true ) ---prompt for qty -- (get(key) --> value: bk : setter/getter for qty)
In case of a new book , store book details in the map.
In case of duplicate title , just update the quantity

2.2 Display All books in a library
(values ---for-each)

2.3 Issue out a book.
i/p book title
If the book is found , update the quantity suitably.
(Map : get(key) --> bk , use settters: reduce qty

2.4 Return a book
i/p book title
If the book is found , update the quantity suitably.
(Map : get(key) --> bk , use settters: increase qty)

2.5 Remove book
i/p book title
(Map : remove)