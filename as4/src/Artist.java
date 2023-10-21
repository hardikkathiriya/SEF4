
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;


class Artist {
    private String ID;
    private String Name;
    private String Address;
    private String Birthdate;
    private String Bio;
    private ArrayList<String> Occupations;
    private ArrayList<String> Genres;
    private ArrayList<String> Awards;

    public Artist(String id, String name, String address, String birthdate, String bio, ArrayList<String> occupations, ArrayList<String> genres, ArrayList<String> awards) {
        this.ID = id;
        this.Name = name;
        this.Address = address;
        this.Birthdate = birthdate;
        this.Bio = bio;
        this.Occupations = occupations;
        this.Genres = genres;
        this.Awards = awards;
    }
   
    public String getID() {
    
    	return ID;
    }

    public String getName() {
        return Name;
    }

    public String getAddress() {
        return Address;
    }

    public String getBirthdate() {
        return Birthdate;
    }

    public String getBio() {
        return Bio;
    }

    public ArrayList<String> getOccupations() {
        return Occupations;
    }

    public ArrayList<String> getGenres() {
        return Genres;
    }

    public ArrayList<String> getAwards() {
        return Awards;
    }

    //add artist function which is all condition meet so the pass data to addartistfile which is store data into txtfile
    public boolean addArtist() {
        if (validateArtist()) 
        {
            // Add the artist's information to a TXT file here
            boolean addedSuccessfully = addArtistToFile(this);
            
            // all data are stored in file if return true.
            if (addedSuccessfully) 
            {
                return true;
            }
        }
        
        //when any of if condition are not meet their criteria so return false.
        return false;
    }

    // update function which is check update condition.
    public boolean updateArtist() 
    {
        if (!validateArtist())
        {
         return false;  
        }
        
        // this condition checking occupation condition if artist born years is before 2000
        if (Integer.parseInt(Birthdate.split("-")[2]) < 2000 && Occupations.size() > 0) {
            return false;
        }

        // Awards that were given to an artist before 2000 can not be changed. 
        for (String award : Awards) {
            if (Integer.parseInt(award.split(",")[0]) < 2000 && award.split(",")[1].contains(" ")) {
                return false;
            }
        }
        
        return true;
    }

    // write condition which is usefult for add artist details.
    private boolean validateArtist() {
    	if (!ID.matches("[5-9]{3}[A-Z]{5}[_\\!@#$%^&*]{2}")) {
    		return false;
    	}
    	

    	//Check if the birth date meets the condition.
    	if (Birthdate.matches("d{2}-d{2}-d{4}"))
    	{
    	    return false;
    	}

    	// Check if the address meets the condition.
    	String addressPattern = "[A-Za-z]+\\|[A-Za-z]+\\|[A-Za-z]+";
    	if (Address.matches(addressPattern)) {
    		return false;
    	}

    	// Check if the bio meets the condition.
    	if (Bio.length() >= 10 && Bio.length() <= 30) {
    		return false;
    	}

    	// Check if the occupations meet the condition.
    	if (Occupations.size() < 1 || Occupations.size() > 5) {
    		System.out.println("The occupations do not meet the condition.");
    		return false;
    	}

    	// Check if the awards meet the condition.
    	if (Awards.size() > 3) 
    	{
    		return false;
//    			
    	}
    	else {
    		for (String award : Awards) {
				if (award.matches("\\d{4},[A-Za-z ]{4,50}")) 
					{	
					return false;
					}
				}
    		}

    	
    	// Check if the genres meet the condition.
    	
    	if((Genres.size()<=2 || Genres.size() >= 5) || (Genres.contains("pop") && Genres.contains("rock")) ) 
    	{
    				return false;
    	}
//       
      return true; 
    }

    
    
    
    private static final String ARTIST_FILE = "artists.txt"; // Replace with your actual file path
    
    // this function convert artist data into string format with comma and verticalbars.
    public static String artistToString(Artist artist) {
        // Convert the Artist object to a string format for storage in the file
        StringBuilder sb = new StringBuilder();
        sb.append(artist.getID()).append(",");
        sb.append(artist.getName()).append(",");
        sb.append(artist.getAddress()).append(",");
        sb.append(artist.getBirthdate()).append(",");
        sb.append(artist.getBio()).append(",");
        sb.append(String.join("|", artist.getOccupations())).append(",");
        sb.append(String.join("|", artist.getGenres())).append(",");
        sb.append(String.join(",", artist.getAwards()));
        return sb.toString();
    }
    
    // this function take data from artist class and store into artistdata variable and pass to apeendtofile functtion
    public static boolean addArtistToFile(Artist artist) {
        String artistData = artistToString(artist);
        return appendToFile(ARTIST_FILE, artistData);
    }


    // this function is store data into txt file which take two argument one is file name and second is data here is use try and catch for catch error
    public static boolean appendToFile(String fileName, String data) {
        try (FileWriter writer = new FileWriter(fileName, true)) {
            writer.write(data + System.lineSeparator());
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
       
}
