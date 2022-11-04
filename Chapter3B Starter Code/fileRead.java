import java.io.*;
import java.util.*;
/**
 * Vinay Narahari
 *10/31/22
 *This Program analyzes speeches to see how the length, average length, and how many times some specifc words were mentioned
 *Variable List: gov,econ,freed,avgLen,wordCount,len
 */
public class fileRead
{
    public static void main(String[] args) throws IOException
    {
        
        Scanner scanner = new Scanner(System.in);
        Scanner fileScan = new Scanner(new File("speeches//obamatakebackamerica.txt"));
        /* other speeches used were George Washingtons Inaugrual Speech, the JFK Speech, the MLK I have a Dream speech,the Thomas Jefferson Speech , the obama inaugural speech, and the 
         *  obama take back america speech
         */
        int len = 0, avgLen = 0, freed =0 , gov =0, econ =0, wordCount =0;

        String word = " " ;
        // while loop goes through the entire speech and checks the length and how many times a specific word was said
        while(fileScan.hasNext()){
            word = fileScan.next();
            if(word.equalsIgnoreCase("Government")){
                gov++;
            }
            if(word.equalsIgnoreCase("Economy")){
                econ++;
            }
            if(word.equalsIgnoreCase("freedom")){
                freed++;
            }
            len+= word.length();
            wordCount++;
        }
        
        /* Results:
         * George Washingtons Inaugrual Speech:
         *      average length: 5 ; total words: 7299   
         *      government was mentioned 3 times; both economy and freedom were not mentioned
         * JFK Speech
         *      average length: 4 ; total words: 6197
         *      government and economy were mentioned 0 times; freedom was mentioned 2 times
         * MLK I have a Dream
         *      average length: 4 ; total words: 4162
         *      government and economy were mentioned 0 times; Freedom was mentioned 5 times
         * Thomas Jefferson Speech
         *      average length: 4 ; total words: 8421
         *      government was mentioned 7 times ; economy was mentioned once ; freedom was mentioned 4 times
         * obama inaugural speech
         *      average length: 4 ; total words: 11062
         *      government was mentioned 2 times ; economy was mentioned 3 times; freedom was mentioned 2 times
         * obama take back america
         *      average length: 4 ; total words: 13949
         *      government was mentioned 8 times ; economy was mentioned once ; freedom was mentioned once
          
         *      Reflection:
           
           Looking through the data I collected, I found it interesting how George Washingtons Inaugural speech didn't contain the word "freedom" as America was a new country at the time.
           Another thing I found interest was how in the older speech there was a higher average word length ( as seen in washington's speech) yet there was a lower word count compared to
           modern speech. Lastly, I found it interesting how the "I have a Dream" speech did not mention the government at all due to how intertwined African American Independance was with
           the government.
           */
        
        
    }
    
    
}
