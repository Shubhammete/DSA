# https://leetcode.com/problems/merge-strings-alternately/description/
class Solution:
    def mergeAlternately(self, word1: str, word2: str) -> str:
        lenword1 = len(word1)
        lenword2 = len(word2)
        i = 0
        j = 0
        final = []

        while i < lenword1 or j < lenword2:
            if i < lenword1:
                final += word1[i]
                i += 1
            if j < lenword2:
                final += word2[j]
                j += 1
        return "".join(final)
