class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        max=0
        c=0
        for i in range(0,len(sentences)):
            c=0
            a=sentences[i]
            for j in range(0,len(a)):
                if(a[j]==" "):
                    c+=1
            if c>max:
                max=c
        return max+1;
