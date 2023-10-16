def is_palindrome_0001(word):
    return word == word[::-1]

def find_palindromic_words_0001(sentence):
    words = sentence.split()
    palindromic_words = [word for word in words if is_palindrome_0001(word)]
    return palindromic_words

sentence = "hello madam radar"
palindromic_words = find_palindromic_words_0001(sentence)
print("Palindromic words:", palindromic_words)
