Nth character is decrypted string:
/*Every character in the input string is followed by its frequency.Write a function to decrypt the string and find the n0' character of the decrypted string.
If no character exisyts at that position then return "-1".

for eg:- if the input string is "a2b3" the decrypted string is "aabbb".
NOTE: The frequency string cannot be greater than a single digit i.e < 10.

Input Specifications:
ip1 : a string
ip2 : n, the position of the character starting from 1

Output Specifications:
Return the character which occurs at the nu' position in the decrypted string. Return "-1" if no character exists at that place.


ip1 : a1b1c3
ip2: 5
op : c
class Main{
public static void Main(string[] args){

       string str = Console.ReadLine();
        int k = Convert.ToInt32(Console.ReadLine());
        
        string ans="";
        for(int i=0;i<str.Length;i=i+2)
        {
            
            char ch = str[i+1];
            int ar = Convert.ToInt32(new string(ch, 1));
            for(int j=0;j<ar;j++)
            {
                ans=ans+str[i];
 
            }
 
        }
        if(k-1<ans.Length){
             Console.WriteLine(ans[k-1]);
        }
        else
        {
 
            Console.WriteLine("-1");
 
        }

    }
}