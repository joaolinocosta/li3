package mypackage;

import java.util.*;


public class Article
{
	private long id;
	private String title;	
	private long nWords;
	private long nBytes;
	private HashMap<Long, Revision> revisionsHashTable;



	public Article()
	{
		this.id = 0;
		this.title = "Empty";		
		this.nWords = 0;
		this.nBytes = 0;
		this.revisionsHashTable = new HashMap<Long, Revision>();
	}


	public Article(long pId, String pTitle, long pNWords, long pNBytes, HashMap<Long, Revision> pRevisionsHashTable)
	{
		this.id = pId;
		this.title = pTitle;
		this.nWords = pNWords;
		this.nBytes = pNBytes;
		this.revisionsHashTable = pRevisionsHashTable;
	}


	public Article(Article a)
	{
		this.id = a.getId();
		this.title = a.getTitle();
		this.nWords = a.getNWords();
		this.nBytes = a.getNBytes();
		this.revisionsHashTable = a.getRevisionsHashTable();
	}


	public long getId()										{ return this.id; 					}
	public String getTitle() 								{ return this.title; 				}
	public long getNWords() 								{ return this.nWords; 				}
	public long getNBytes() 								{ return this.nBytes; 				}
	public HashMap<Long, Revision> getRevisionsHashTable() 	{ return this.revisionsHashTable; 	}


	public void setId(long pId)														{ this.id = pId; 					}
    public void setTitle(String pTitle) 											{ this.title = pTitle; 				}
	public void setNWords(long pNWords) 											{ this.nWords = pNWords; 				}
	public void setNBytes(long pNBytes) 											{ this.nBytes = pNBytes; 				}
	public void setRevisionsHashTable(HashMap<Long, Revision> pRevisionsHashTable) 	{ this.revisionsHashTable = pRevisionsHashTable; 	}


	public boolean equals(Object o)
    {
        if (this == o) {
            return true;
        } 
        
        if (o == null) {
            return false;
        }
        
        if (getClass() != o.getClass()) {
            return false;
        }
        
        Article a = (Article) o;
        return this.id.equals(a.getId())
            && this.title.equals(a.getTitle())
            && this.nWords.equals(a.getNWords())
            && this.nBytes.equals(a.getNBytes())
            && this.revisionsHashTable.equals(a.getRevisionsHashTable());	
    }


    public Article clone()
    {
        return new Article(this);
    }    
}
