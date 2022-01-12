
public class PetPOJO
{
	private String[] photoUrls = {"","","","","","","","","",""};
    private String name;
    private String id;
    private Category category = new Category();
    private Tags[] tags = new Tags[10];
    private String status;

    public PetPOJO (){
        
    	Tags tagValue = new Tags();
    	
    	tagValue.setId(0);
    	tagValue.setName("");

    	for (int i=0; i<10; i++) { 
    		tags[i] = tagValue; 
        	}
    	
    	
    }
    
    public String[] getPhotoUrls ()
    {
        return photoUrls;
    }

    public void setPhotoUrls (String[] photoUrls)
    {
        this.photoUrls = photoUrls;
    }

    public String getPhotoUrl (int position)
    {
        return photoUrls[position];
    }

    public void setPhotoUrl (String photoUrls, int position)
    {
        this.photoUrls[position] = photoUrls;
    }
    
    public String getName ()
    {
        return name;
    }

    public void setName (String name)
    {
        this.name = name;
    }

    public String getId ()
    {
        return id;
    }

    public void setId (String id)
    {
        this.id = id;
    }
    
    public Category getCategory ()
    {
        return category;
    }

    public void setCategory (String categoryName, int categoryID)
    {
        category.setId(categoryID);
        category.setName(categoryName);
    }
    
    public Tags getTag (int position)
    {
        return tags[position];
    }

    public void setTag (String tagName, int position)
    {
    	Tags tagValue = new Tags();
    	tagValue.setId(position);
    	tagValue.setName(tagName);
    	
    	tags[position] = tagValue;
    }
    
    public Tags[] getTags ()
    {
        return tags;
    }

    public void setTags (Tags[] tags)
    {
        this.tags = tags;
    }

    
    
    public String getStatus ()
    {
        return status;
    }

    public void setStatus (String status)
    {
        this.status = status;
    }

    public String petJSON() {
    	
    	String photoURLString ="[";
    	
    	for (int i=0; photoUrls[i]!="";i++) {
    		photoURLString = photoURLString + "\"" + photoUrls[i] + "\"\r\n";
    		if (photoUrls[i+1]!="")
    			photoURLString = photoURLString + ",";
    	}
    	photoURLString = photoURLString + "]";
    	
    	String categoryString ="{\r\n\"id\":" + String.valueOf(category.getId()) + ",\r\n"
    							+ "\"name\": \"" + category.getName() + "\"\r\n}";
    	
    	String tagsString ="[\r\n";
    	
    	for (int i=0; tags[i].getName()!="";i++) {
    		tagsString = tagsString + "{\"id\":" + tags[i].getId() + ",\r\n";
    		tagsString = tagsString + "\"name\":\"" + tags[i].getName() + "\"}\r\n";
    		if (tags[i+1].getName()!="")
    			tagsString = tagsString  + ",";
    	}
    	tagsString = tagsString  + "],";
    	
    	String petBody = "{\r\n"
    			+ "  \"id\": " + id + ",\r\n"
    			+ "  \"name\": \"" + name + "\",\r\n"
		    	+ "  \"category\":" + categoryString + ",\r\n"
    			+ "  \"photoUrls\": " + photoURLString + ",\r\n"
		    	+ "  \"tags\":\r\n" + tagsString + "\r\n"
    			+ "  \"status\": \""+ status + "\"\r\n"
    			+ "}";
    	   	
    	return petBody;
    	
    }
    
  /*  @Override
    public String toString()
    {
        return "ClassPojo [photoUrls = "+photoUrls+", name = "+name+", id = "+id+", category = "+category+", tags = "+tags+", status = "+status+"]";
    }*/
}