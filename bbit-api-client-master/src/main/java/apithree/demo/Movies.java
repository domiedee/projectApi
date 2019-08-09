package apithree.demo;

public class Movies {
    private Long id;
    private String name;
    private String category;
    private int length;


    public Movies(Long id, String name, String category, int length) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.length = length;
    }

    Movies(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public String toString(){
        return "Movies{" + "id=" + id + ", name='" + name + '\'' + '}';

    }
}
