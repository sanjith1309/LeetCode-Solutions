class Solution:
    def reverseWords(self, s: str) -> str:
        ss = s.split(" ")
        ss=ss[::-1]
        string = ""
        for i in ss:
            string+=i
            string+=" "
        string=string[0:len(string)-1]
        newstring=string[0]
        for i in range(1,len(string)):
            if(string[i-1]!=" " and string[i]==" "):
                newstring+=string[i]
            elif(string[i].isalnum()):
                newstring+=string[i]
        if(newstring[0]==" "):
            newstring=newstring[1:len(newstring)]
        if(newstring[len(newstring)-1]==" "):
            newstring=newstring[0:len(newstring)-1]
        return newstring
