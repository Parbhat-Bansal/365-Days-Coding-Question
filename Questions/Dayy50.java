
//Question Link :- http://geeksforgeeks.org/batch/dsa-self-paced-july/track/DSASP-Sorting/problem/counting-sort

class Solution
{
    //Function to arrange all letters of a string in lexicographical 
    //order using Counting Sort.
    public static String countSort(String arr)
    {
        int[] count = new int[26]; // For 'a' to 'z'

    // Count frequency of each character
        for (char ch : arr.toCharArray()) 
        {
        count[ch - 'a']++;
        }

    // Build the sorted string
        StringBuilder sorted = new StringBuilder();
        for (int i = 0; i < 26; i++) 
        {
            while (count[i]-- > 0) 
            {
                sorted.append((char) (i + 'a'));
            }
        }

        return sorted.toString();
    }
}