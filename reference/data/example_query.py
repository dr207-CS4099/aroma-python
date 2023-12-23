# class c:
#     if(True and 1==1):
#         print("hello")
#         print("world")

# class c:
#     for line in article_file:
#         fields = line.split("\t")
#         location = fields[3]
#         text = fields[4]
#         self.count += 1
#         return_article = {"text": text, "location": location}
#         # print("TEXT %s", text)
#         self.write("output", return_article)




def test():
    sum = 0
    for i in range(1,10):
        # print("hello")
        for j in range(1, i):
            print("world")
            for k in range(1, j):
                sum += j
    return sum


