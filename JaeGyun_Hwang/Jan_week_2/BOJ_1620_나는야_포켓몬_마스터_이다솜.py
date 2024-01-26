'''
문제:

입력:
첫째 줄에는 도감에 수록되어 있는 포켓몬의 개수 N이랑 
내가 맞춰야 하는 문제의 개수 M이 주어져. 
N과 M은 1보다 크거나 같고, 100,000보다 작거나 같은 자연수

둘째 줄부터 N개의 줄에 
포켓몬의 번호가 1번인 포켓몬부터 N번에 해당하는 포켓몬까지 
한 줄에 하나씩 입력으로 들어와. 

포켓몬의 이름은 모두 영어로만 이루어져있고, 
또, 첫 글자만 대문자이고, 나머지 문자는 소문자로만 이루어져 있어. 

아참! 일부 포켓몬은 마지막 문자만 대문자일 수도 있어. 

포켓몬 이름의 최대 길이는 20, 최소 길이는 2야. 
그 다음 줄부터 총 M개의 줄에 내가 맞춰야하는 문제가 입력으로 들어와. 

문제가 알파벳으로만 들어오면 포켓몬 번호를 말해야 하고, 
숫자로만 들어오면, 포켓몬 번호에 해당하는 문자를 출력해야해. 
입력으로 들어오는 숫자는 반드시 1보다 크거나 같고, N보다 작거나 같고, 
입력으로 들어오는 문자는 반드시 도감에 있는 포켓몬의 이름만 주어져. 
그럼 화이팅!!!

출력:
첫째 줄부터 차례대로 M개의 줄에 각각의 문제에 대한 답을 말해줬으면 좋겠어!!!. 
입력으로 숫자가 들어왔다면 그 숫자에 해당하는 포켓몬의 이름을, 
문자가 들어왔으면 그 포켓몬의 이름에 해당하는 번호를 출력하면 돼. 그럼 땡큐~

'''
import sys

N, M = map(int, sys.stdin.readline().split(" "))



pokedex = {} # 키:값 = 번호 : 이름
inverted_pokedex = {} # 키:값 = 이름 : 번호

for i in range(N):
    pokemon_name = sys.stdin.readline().strip()
    pokedex[i+1] = pokemon_name
    inverted_pokedex[pokemon_name] = i+1
    
#print(pokedex)
#print(inverted_pokedex)
#print('answer:')

for i in range(M):

    question = sys.stdin.readline().strip()
    
    if question.isdigit():
        #print(question,":",pokedex[int(question)])
        print(pokedex[int(question)])
    else:
        #print(question,":",inverted_pokedex[question])
        print(inverted_pokedex[question])

'''
리스트에서 탐색을 할 경우 시간 복잡도는 O(n)이다. ( index() )
하지만 파이썬 딕셔너리는 hash table을 사용한 것으로써 읽을때 시간 복잡도가
O(1)이다 대박

인덱스 탐색이나 특정 문자 탐색을 할 때 dictionary를 사용하는 것이 유리할 수 있다.
'''
    