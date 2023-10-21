
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;

class Test {

	@org.junit.jupiter.api.Test
	void testvallidartistdata() {
			

	        // checking testdata1
		/*
	        ArrayList<String> occupations = new ArrayList<>();
	        occupations.add("Singer");
	        occupations.add("producer");
	        
	        ArrayList<String> awards = new ArrayList<>();
	        awards.add("2022, Best Song of year");
	        
	        ArrayList<String> genres = new ArrayList<>();
	        genres.add("jazz");
	        genres.add("classic");
	        genres.add("reggae");
	        
	        
	        Artist testdata2 = new Artist("556ABCDE@#","john morgon", "15-11-1990", "Melbourne|Victoria|Australia", "hello my name is john and I am very good singer", occupations, awards,genres);
	        assertEquals(true,testdata2.addArtist());
	      */ 
	        
	        
	        // checking testdat2
	        /*
	        ArrayList<String> occupations = new ArrayList<>();
	        occupations.add("producer");
	        occupations.add("songwriter");
	        occupations.add("actor");
	        
	        ArrayList<String> awards = new ArrayList<>();
	        awards.add("2022, Best actor in hollywood");
	        
	        ArrayList<String> genres = new ArrayList<>();
	        genres.add("disco");
	        genres.add("techno");
	        genres.add("kpop");
	        genres.add("folk");
	        
	        Artist testdata3 = new Artist("678OPQRS!@","max","11-11-1995", "Sydeny|Newsouthwales|Australia", "good noon my name is max I am from sydeny and I am producer", occupations, awards,genres);
	        assertEquals(true,testdata3.addArtist());
       	    */   
	        
	        //testdata3
		/*
	        ArrayList<String> occupations = new ArrayList<>();
	        occupations.add("singer");
	        occupations.add("producer");
	        occupations.add("photographer");
	        
	        ArrayList<String> awards = new ArrayList<>();
	        awards.add("2015,Best of  hollywood");
	        
	        ArrayList<String> genres = new ArrayList<>();
	        genres.add("jazz");
	        genres.add("classic");
	        genres.add("reggage");
	       
	        
	        Artist testdata4 = new Artist("895ABCDE*$","maxi"," 05-11-2005 ", "Brisbane|Queensland|Australia", "hello my name is maxi and I am very good writer", occupations, awards,genres);
	        assertEquals(true,testdata4.addArtist());
	        */
	        

	}
	
//testcase 2
	
	void testinvalid_id() {
		// testdata1: id : first character 123 which is invalid
	/*	
		ArrayList<String> occupations = new ArrayList<>();
        occupations.add("Singer");
        occupations.add("producer");
        
        ArrayList<String> awards = new ArrayList<>();
        awards.add("2022, Best Song of year");
        
        ArrayList<String> genres = new ArrayList<>();
        genres.add("jazz");
        genres.add("classic");
        genres.add("reggae");
        
        
        Artist testdata1 = new Artist("123ABCDE-#","john morgon", "15-11-1990", "Melbourne|Victoria|Australia", "hello my name is john and I am very good singer", occupations, awards,genres);
        assertEquals(false,testdata1.addArtist());
     */   
        
        //testdata2:alphabat must more than 5 
		/*
		
        ArrayList<String> occupations = new ArrayList<>();
        occupations.add("Singer");
        occupations.add("producer");
        
        ArrayList<String> awards = new ArrayList<>();
        awards.add("2022, Best Song of year");
        
        ArrayList<String> genres = new ArrayList<>();
        genres.add("jazz");
        genres.add("classic");
        genres.add("reggae");
        
        
        Artist testdata2 = new Artist("568hjklmop-#","john morgon", "15-11-1990", "Melbourne|Victoria|Australia", "hello my name is john and I am very good singer", occupations, awards,genres);
        assertEquals(false,testdata2.addArtist());
        */
        
		//testdata3: last two character is number .
		/*
        ArrayList<String> occupations = new ArrayList<>();
        occupations.add("Singer");
        occupations.add("producer");
        
        ArrayList<String> awards = new ArrayList<>();
        awards.add("2022, Best Song of year");
        
        ArrayList<String> genres = new ArrayList<>();
        genres.add("jazz");
        genres.add("classic");
        genres.add("reggae");
        
        
        Artist testdata3= new Artist("556ABCDE88","john morgon", "15-11-1990", "Melbourne|Victoria|Australia", "hello my name is john and I am very good singer", occupations, awards,genres);
        assertEquals(false,testdata3.addArtist());
        */
	}

//testcase3 invalid birthdate
	void testinvalid_birthdate()
	{
		//testcas1(date(yyyy-mm-dd)
		/*
		ArrayList<String> occupations = new ArrayList<>();
        occupations.add("producer");
        occupations.add("songwriter");
        occupations.add("actor");
        
        ArrayList<String> awards = new ArrayList<>();
        awards.add("2022, Best actor in hollywood");
        
        ArrayList<String> genres = new ArrayList<>();
        genres.add("disco");
        genres.add("techno");
        genres.add("kpop");
        genres.add("folk");
        
        Artist testdata3 = new Artist("678OPQRS!@","kath smith","2001-05-02", "Sydeny|Newsouthwales|Australia", "good noon my name is max I am from sydeny and I am producer", occupations, awards,genres);
        assertEquals(false,testdata3.addArtist());
        */
        
       //testcase2(date(yyyy-dd-mm)
		/*
    		ArrayList<String> occupations = new ArrayList<>();
            occupations.add("producer");
            occupations.add("songwriter");
            occupations.add("actor");
            
            ArrayList<String> awards = new ArrayList<>();
            awards.add("2022, Best actor in hollywood");
            
            ArrayList<String> genres = new ArrayList<>();
            genres.add("disco");
            genres.add("techno");
            genres.add("kpop");
            genres.add("folk");
            
            Artist testdata3 = new Artist("678OPQRS!@","max","1990-15-06", "Sydeny|Newsouthwales|Australia", "good noon my name is max I am from sydeny and I am producer", occupations, awards,genres);
            assertEquals(false,testdata3.addArtist());
    	*/
	}

// testcase4: invalid bio 
	
	void testinvalid_bio()
	{
		//testcase 1: word less than 10
		/*
		ArrayList<String> occupations = new ArrayList<>();
        occupations.add("Singer");
        occupations.add("producer");
        
        ArrayList<String> awards = new ArrayList<>();
        awards.add("2022, Best Song of year");
        
        ArrayList<String> genres = new ArrayList<>();
        genres.add("jazz");
        genres.add("classic");
        genres.add("reggae");
        
        
        Artist testdata2 = new Artist("556ABCDE@#","john morgon", "15-11-1990", "Melbourne|Victoria|Australia", "hello my name is john", occupations, awards,genres);
        assertEquals(false,testdata2.addArtist());
		*/
	
      //testcase 2: word more than 30
		/*
      		ArrayList<String> occupations = new ArrayList<>();
              occupations.add("Singer");
              occupations.add("producer");
              
              ArrayList<String> awards = new ArrayList<>();
              awards.add("2022, Best Song of year");
              
              ArrayList<String> genres = new ArrayList<>();
              genres.add("jazz");
              genres.add("classic");
              genres.add("reggae");
              
              
              Artist testdata2 = new Artist("556ABCDE@#","john morgon", "15-11-1990", "Melbourne|Victoria|Australia", "hello my name is john and I am very good singer and I am doing good work for society. I am owner of child trust and there are more than 100 children live there.", occupations, awards,genres);
              assertEquals(false,testdata2.addArtist());
		*/
	
	}

// testcase5 :invalid genres

		void testinvalid_genres() 
		{
			//testdata1: only 1 genres 
		/*	
			ArrayList<String> occupations = new ArrayList<>();
            occupations.add("Singer");
            occupations.add("producer");
            
            ArrayList<String> awards = new ArrayList<>();
            awards.add("2022, Best Song of year");
            
            ArrayList<String> genres = new ArrayList<>();
            	genres.add("jazz");
            
            
            Artist testdata1 = new Artist("556ABCDE@#","john morgon", "15-11-1990", "Melbourne|Victoria|Australia", "hello my name is john and I am very good singer and I am doing good work for society. I am owner of child trust and there are more than 100 children live there.", occupations, awards,genres);
            assertEquals(false,testdata1.addArtist());
		*/	
            
		// testdat2: rock and pop together which is invlid:
		/*	
    			ArrayList<String> occupations = new ArrayList<>();
                occupations.add("Singer");
                occupations.add("producer");
                
                ArrayList<String> awards = new ArrayList<>();
                awards.add("2022, Best Song of year");
                
                ArrayList<String> genres = new ArrayList<>();
                genres.add("jazz");
                genres.add("pop");
                genres.add("rock");
                
                
                Artist testdata2 = new Artist("556ABCDE@#","john morgon", "15-11-1990", "Melbourne|Victoria|Australia", "hello my name is john and I am very good singer and I am doing good work for society. I am owner of child trust and there are more than 100 children live there.", occupations, awards,genres);
                assertEquals(false,testdata2.addArtist());
    		*/	 
		}
		
// testcase6:invalid awards:
		void testinvalid_awards()
		{
		/*	
			//testcase 1 : invalid awrds title count
			ArrayList<String> occupations = new ArrayList<>();
            occupations.add("Singer");
            occupations.add("producer");
            
            ArrayList<String> awards = new ArrayList<>();
            awards.add("2022, Best Song ");
            
            ArrayList<String> genres = new ArrayList<>();
            genres.add("jazz");
            genres.add("pop");
            genres.add("rock");
            
            
            Artist testdata2 = new Artist("556ABCDE@#","john morgon", "15-11-1990", "Melbourne|Victoria|Australia", "hello my name is john and I am very good singer and I am doing good work for society. I am owner of child trust and there are more than 100 children live there.", occupations, awards,genres);
            assertEquals(false,testdata2.addArtist());
         */  
            //tetcase2:invalid awerds title more words than limit
		
		/*	
            
            ArrayList<String> occupations = new ArrayList<>();
            occupations.add("Singer");
            occupations.add("producer");
            
            ArrayList<String> awards = new ArrayList<>();
            awards.add(2020,"best lengthy and good  song of the year in world music industry");
            
            ArrayList<String> genres = new ArrayList<>();
            genres.add("jazz");
            genres.add("pop");
            genres.add("rock");
            
            
            Artist testdata2 = new Artist("556ABCDE@#","john morgon", "15-11-1990", "Melbourne|Victoria|Australia", "hello my name is john and I am very good singer and I am doing good work for society. I am owner of child trust and there are more than 100 children live there.", occupations, awards,genres);
            assertEquals(false,testdata2.addArtist());
          */
		}
		

// TESTCASE7: UPDATE OCCUPATIONS WITH INVALID DETAILS:
		void testupdate_invalidoccupations()
		{
			// testcase1: invalid occupation add beacause born is before 1990.
		/*
			ArrayList<String> occupations = new ArrayList<>();
            occupations.add("Singer");
            occupations.add("producer");
            // new data
            occupations.add("songwriter");
            
            ArrayList<String> awards = new ArrayList<>();
            awards.add("2022, Best Song of year");
            
            ArrayList<String> genres = new ArrayList<>();
            	genres.add("jazz");
            	genres.add("classic");
            	genres.add("reggae");
            
            
            Artist testdata1 = new Artist("556ABCDE@#","john morgon", "15-11-1990", "Melbourne|Victoria|Australia", "hello my name is john and I am very good singer and I am doing good work for society. I am owner of child trust and there are more than 100 children live there.", occupations, awards,genres);
            assertEquals(false,testdata1.updateArtist());
            
         */
			
			// testcase2: invalid occupation more than limit
		/*
			ArrayList<String> occupations = new ArrayList<>();
            occupations.add("producer");
            occupations.add("songwriter");
            occupations.add("filmwriter");
            occupations.add("painter");
            occupations.add("photographer");
            occupations.add("desgiener");
           
            
            ArrayList<String> awards = new ArrayList<>();
            awards.add("2022, Best actor in hollywood");
            
            ArrayList<String> genres = new ArrayList<>();
            genres.add("disco");
            genres.add("techno");
            genres.add("kpop");
            genres.add("folk");
            
            Artist testdata2 = new Artist("678OPQRS!@","max","1990-15-06", "Sydeny|Newsouthwales|Australia", "good noon my name is max I am from sydeny and I am producer", occupations, awards,genres);
            assertEquals(false,testdata2.addArtist());
		*/
		}

//testcase8: update occupation with valid inputs
		void testupdate_validoccupations()
		{
			
		/*	testcase1: update occupation born after 2000
			ArrayList<String> occupations = new ArrayList<>();
            occupations.add("producer");
            occupations.add("songwriter");
            occupations.add("filmwriter");
            
            ArrayList<String> awards = new ArrayList<>();
            awards.add("2022, Best actor in hollywood");
            
            ArrayList<String> genres = new ArrayList<>();
            genres.add("disco");
            genres.add("techno");
            genres.add("kpop");
            genres.add("folk");
            
            Artist testdata1 = new Artist("678OPQRS!@","max","1990-15-06", "Sydeny|Newsouthwales|Australia", "good noon my name is max I am from sydeny and I am producer", occupations, awards,genres);
            assertEquals(true,testdata1.addArtist());
         */
			
          // testcase2: born after 2000
		  /*
            ArrayList<String> occupations = new ArrayList<>();
	        occupations.add("singer");
	        occupations.add("producer");
	        occupations.add("photographer");
	        occupations.add("director)";
	        
	        ArrayList<String> awards = new ArrayList<>();
	        awards.add("2015,Best of  hollywood");
	        
	        ArrayList<String> genres = new ArrayList<>();
	        genres.add("jazz");
	        genres.add("classic");
	        genres.add("reggage");
	       
	        
	        Artist testdata2 = new Artist("895ABCDE*$","maxi"," 05-11-2005 ", "Brisbane|Queensland|Australia", "hello my name is maxi and I am very good writer", occupations, awards,genres);
	        assertEquals(true,testdata2.addArtist());
	        
	       */
		}

// testcase9: update awards with invalid inputs
		
		
		void testupdate_invalidawards()
		{	
			//testcase1: limit of award title is less.
			/*
			ArrayList<String> occupations = new ArrayList<>();
            occupations.add("producer");
            occupations.add("songwriter");
            occupations.add("filmwriter");
            
            ArrayList<String> awards = new ArrayList<>();
            awards.add("2022, Best actor ");
            
            ArrayList<String> genres = new ArrayList<>();
            genres.add("disco");
            genres.add("techno");
            genres.add("kpop");
            genres.add("folk");
            
            Artist testdata1 = new Artist("678OPQRS!@","max","1990-15-06", "Sydeny|Newsouthwales|Australia", "good noon my name is max I am from sydeny and I am producer", occupations, awards,genres);
            assertEquals(false,testdata1.addArtist());
            */
			
			//testcas2: invalid awards title more than words
			/*
			ArrayList<String> occupations = new ArrayList<>();
	        occupations.add("singer");
	        occupations.add("producer");
	        occupations.add("photographer");
	        occupations.add("director");
	        
	        ArrayList<String> awards = new ArrayList<>();
	        awards.add("2015,best song of the month in the world of the april ");
	        
	        ArrayList<String> genres = new ArrayList<>();
	        genres.add("jazz");
	        genres.add("classic");
	        genres.add("reggage");
	       
	        
	        Artist testdata2 = new Artist("895ABCDE*$","maxi"," 05-11-2005 ", "Brisbane|Queensland|Australia", "hello my name is maxi and I am very good writer", occupations, awards,genres);
	        assertEquals(false,testdata2.addArtist());
	       */
		
		}
//testcase 10: update with valid awards
		void testupdate_validawards() 
		{
		/*
//			testcase1: update awards title 
			ArrayList<String> occupations = new ArrayList<>();
	        occupations.add("Singer");
	        occupations.add("producer");
	        
	        ArrayList<String> awards = new ArrayList<>();
	        awards.add("2022, best actor of the year");
	        
	        ArrayList<String> genres = new ArrayList<>();
	        genres.add("jazz");
	        genres.add("classic");
	        genres.add("reggae");
	        
	        
	        Artist testdata2 = new Artist("556ABCDE@#","john morgon", "15-11-1990", "Melbourne|Victoria|Australia", "hello my name is john and I am very good singer", occupations, awards,genres);
	        assertEquals(true,testdata2.addArtist());
		*/
			//testcase2: update awards title:
			/*
			ArrayList<String> occupations = new ArrayList<>();
	        occupations.add("producer");
	        occupations.add("songwriter");
	        occupations.add("actor");
	        
	        ArrayList<String> awards = new ArrayList<>();
	        awards.add("2022, Best song in hollywood");
	        
	        ArrayList<String> genres = new ArrayList<>();
	        genres.add("disco");
	        genres.add("techno");
	        genres.add("kpop");
	        genres.add("folk");
	        
	        A
	        rtist testdata3 = new Artist("678OPQRS!@","max","11-11-1995", "Sydeny|Newsouthwales|Australia", "good noon my name is max I am from sydeny and I am producer", occupations, awards,genres);
	        assertEquals(true,testdata3.addArtist());
	        */
		
		}

//testcase11: trying update with invalid id:
		
		void testupdate_invalidid() {
		//testcas1:upadat with is not valid id:
			/*
			ArrayList<String> occupations = new ArrayList<>();
	        occupations.add("Singer");
	        occupations.add("producer");
	        
	        ArrayList<String> awards = new ArrayList<>();
	        awards.add("2022, Best Song of year");
	        
	        ArrayList<String> genres = new ArrayList<>();
	        genres.add("jazz");
	        genres.add("classic");
	        genres.add("reggae");
	        
	        
	        Artist testdata2 = new Artist("556ABCDEAU","john morgon", "15-11-1990", "Melbourne|Victoria|Australia", "hello my name is john and I am very good singer", occupations, awards,genres);
	        assertEquals(false,testdata2.addArtist());
	        */
	        
	      // testcase2: update with invalid id:
			/*
	        ArrayList<String> occupations = new ArrayList<>();
	        occupations.add("producer");
	        occupations.add("songwriter");
	        occupations.add("actor");
	        
	        ArrayList<String> awards = new ArrayList<>();
	        awards.add("2022, Best actor in hollywood");
	        
	        ArrayList<String> genres = new ArrayList<>();
	        genres.add("disco");
	        genres.add("techno");
	        genres.add("kpop");
	        genres.add("folk");
	        
	        Artist testdata3 = new Artist("123OPQRS!@","max","11-11-1995", "Sydeny|Newsouthwales|Australia", "good noon my name is max I am from sydeny and I am producer", occupations, awards,genres);
	        assertEquals(false,testdata3.addArtist());
	       	*/
	        

			
		}
		
//testcase12:update birthdate:
		
		void testupdate_validbirthdate()
		{
			//testcase1: update with valid birthdate
			/*
			ArrayList<String> occupations = new ArrayList<>();
	        occupations.add("Singer");
	        occupations.add("producer");
	        
	        ArrayList<String> awards = new ArrayList<>();
	        awards.add("2022, Best Song of year");
	        
	        ArrayList<String> genres = new ArrayList<>();
	        genres.add("jazz");
	        genres.add("classic");
	        genres.add("reggae");
	        
	        
	        Artist testdata1 = new Artist("556ABCDE@#","john morgon", "12-09-1990", "Melbourne|Victoria|Australia", "hello my name is john and I am very good singer", occupations, awards,genres);
	        assertEquals(true,testdata1.addArtist());
	       	*/
	        
	     // testcase2: update with valid birthdate:
	        ArrayList<String> occupations = new ArrayList<>();
	        occupations.add("producer");
	        occupations.add("songwriter");
	        occupations.add("actor");
	        
	        ArrayList<String> awards = new ArrayList<>();
	        awards.add("2022, Best actor in hollywood");
	        
	        ArrayList<String> genres = new ArrayList<>();
	        genres.add("disco");
	        genres.add("techno");
	        genres.add("kpop");
	        genres.add("folk");
	        
	        Artist testdata2 = new Artist("678OPQRS!@","max","05-05-2003", "Sydeny|Newsouthwales|Australia", "good noon my name is max I am from sydeny and I am producer", occupations, awards,genres);
	        assertEquals(true,testdata2.addArtist());
	        
			
		}
		
			
		
	
						

		
 
	
	
	
	
	
	
	
}
