
def test():
    sum = 0
    for i in range(1,10):
        # print("hello")
        for j in range(1, i):
            print("world")
            for k in range(1, j):
                sum += j
    return sum


