import java.util.*;
import java.lang.*;
import java.io.*;

class Tokenizer
{

    public static void main (String[] args) throws java.lang.Exception
	{
		//Taking a fix string as input for testing. Can be taken from file as well. 
		String input="Suffix Removal from privacy refusal communism chemist maintainence freedom trainer veracity argument heaviness fellowship transition eradicate enlighten terrify\n Now comes prefix like nonviolent enact inert unambigious discomfort coorperation devalue autopilot prejudgment postmortem";
	        String regex = "[\n\\s;.,:'!?()-]";
		
		String[] tokens = input.split(regex);
	       	String[] db_terms = new String[100];
        
		int k=0;
		
		for(int i = 0; i < tokens.length; i++)
        	{
            //System.out.println(tokens[i]);
        
		if( !tokens[i].equals("is") && !tokens[i].equals("the") && !tokens[i].equals("in")  && !tokens[i].equals("to")  && !tokens[i].equals("a") )
            	{
                if(tokens[i].endsWith("ed"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-2);
                else if(tokens[i].endsWith("ment"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-4);
                else if(tokens[i].endsWith("ness"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-4);
                else if(tokens[i].endsWith("ship"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-4);
                else if(tokens[i].endsWith("ing"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-3);   
                else if(tokens[i].endsWith("acy"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-3);
                else if(tokens[i].endsWith("al"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-2);
                else if(tokens[i].endsWith("ence"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-4);
                else if(tokens[i].endsWith("dom"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-3);
                else if(tokens[i].endsWith("er"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-2);
                else if(tokens[i].endsWith("ism"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-3);
                else if(tokens[i].endsWith("ist"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-3);
                else if(tokens[i].endsWith("ty"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-2);
                else if(tokens[i].endsWith("ion"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-3);
                else if(tokens[i].endsWith("ate"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-3);
                else if(tokens[i].endsWith("en"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-2);
                else if(tokens[i].endsWith("fy"))
                    db_terms[k]=tokens[i].substring(0,tokens[i].length()-2);
                else if(tokens[i].startsWith("un"))
                    db_terms[k]=tokens[i].substring(2,tokens[i].length());
                else if(tokens[i].startsWith("non"))
                    db_terms[k]=tokens[i].substring(3,tokens[i].length());
                else if(tokens[i].startsWith("in"))
                    db_terms[k]=tokens[i].substring(2,tokens[i].length());
                else if(tokens[i].startsWith("en"))
                    db_terms[k]=tokens[i].substring(2,tokens[i].length());
                else if(tokens[i].startsWith("ex"))
                    db_terms[k]=tokens[i].substring(2,tokens[i].length());
                else if(tokens[i].startsWith("dis"))
                    db_terms[k]=tokens[i].substring(3,tokens[i].length());
                else if(tokens[i].startsWith("co"))
                    db_terms[k]=tokens[i].substring(2,tokens[i].length());
                else if(tokens[i].startsWith("de"))
                    db_terms[k]=tokens[i].substring(2,tokens[i].length());
                else if(tokens[i].startsWith("auto"))
                    db_terms[k]=tokens[i].substring(4,tokens[i].length());
                else if(tokens[i].startsWith("pre"))
                    db_terms[k]=tokens[i].substring(3,tokens[i].length());
                else if(tokens[i].startsWith("post"))
                    db_terms[k]=tokens[i].substring(4,tokens[i].length());
                else 
                    db_terms[k]=tokens[i].substring(0,tokens[i].length());
                
		//printing the terms on stdout. Can be taken to a file.
		System.out.println(db_terms[k]);
                k++;
            }
        }
	}
}

