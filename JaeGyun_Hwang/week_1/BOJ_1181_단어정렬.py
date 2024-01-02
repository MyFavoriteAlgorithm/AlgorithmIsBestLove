'''
문제:
알파벳 소문자로 이루어진 N개의 단어가 들어오면 
아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

1. 길이가 짧은 것부터
2. 길이가 같으면 사전 순으로

단, 중복된 단어는 하나만 남기고 제거해야 한다.

입력:
첫째 줄에 단어의 개수 N이 주어진다. (1 ≤ N ≤ 20,000) 
둘째 줄부터 N개의 줄에 걸쳐 
알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
주어지는 문자열의 길이는 50을 넘지 않는다.

출력:
조건에 따라 정렬하여 단어들을 출력한다.
'''


N = int(input())

word_list = []

for i in range(0,N): # N회 반복
    word_list.append(input()) # 단어 입력
    
word_set = set(word_list) # set 형으로 변환하여 중복제거
    
word_list = list(word_set) # 다시 list로 변환

#하위조건 먼저 정렬
word_list.sort() # 정렬함수. 디폴트는 알파벳or숫자 오름차순

word_list.sort(key=len) # 문자열 길이 순으로 정렬


for word in word_list:
    print(word)