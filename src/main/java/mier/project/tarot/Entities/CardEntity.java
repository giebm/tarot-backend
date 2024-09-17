package mier.project.tarot.Entities;

public class CardEntity {
    
    private Long id;
    private String type;
    private String name;
    private String meaning;
    private String description;
    private String image;

    public CardEntity() {
    }
    
    public CardEntity(Long id, String type, String name, String meaning, String description, String image) {
        this.id = id;
        this.type = type;
        this.name = name;
        this.meaning = meaning;
        this.description = description;
        this.image = image;
    }

    public CardEntity(String type, String name, String meaning, String description, String image) {
        this.type = type;
        this.name = name;
        this.meaning = meaning;
        this.description = description;
        this.image = image;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMeaning() {
        return meaning;
    }

    public void setMeaning(String meaning) {
        this.meaning = meaning;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    

    

}
