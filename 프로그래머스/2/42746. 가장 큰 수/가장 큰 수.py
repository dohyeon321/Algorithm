from functools import cmp_to_key

def solution(numbers):
    def compare(x,y):
        if x+y > y+x:
            return -1;
        elif x+y < y+x:
            return 1;
        else: 
            return 0;
        
    numbers = list(map(str, numbers))
    numbers.sort(key=cmp_to_key(compare))
    result = ''.join(numbers)
    
    return str(int(result))
    