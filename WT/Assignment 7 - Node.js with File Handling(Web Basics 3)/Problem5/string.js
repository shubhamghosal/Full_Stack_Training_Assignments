exports.palindrome = function(string) {
    for (i = 0; i < string.length / 2; i++) {
        if (string[i] !== string[string.length - 1 - i]) {
            return 'Not a palindrome';
        }
    }
    return 'Is a palindrome';
}

exports.upper = function(string) {
    return string.toUpperCase();
}
var counter = 0;
exports.searchh = function(string) {
    string.forEach(site => {
        if (site.search(/www\./) == 0)
            ++counter;
    })
    return counter;
}