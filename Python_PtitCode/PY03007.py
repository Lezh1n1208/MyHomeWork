import re

def split_string(text):
    sentence_list = re.split(r'[.!?]+', text)
    
    for sentence in sentence_list:
        sentence = sentence.strip()
        if len(sentence) > 0:
            sentence = ' '.join(sentence.split())
            sentence = sentence.capitalize()
            print(sentence)
            
text = input()
split_string(text)