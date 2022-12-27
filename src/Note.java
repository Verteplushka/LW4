import java.util.Objects;

public class Note {
    private String message;
    private String writer;

    public Note(Korotishka korotishka, String message){
        this.message = message;
        this.writer = korotishka.getName();
    }

    public void put(){
        System.out.println(this.writer + " оставил записку \"" + this.message + "\"");
    }

    public String getMessage() {
        return message;
    }

    public String getWriter() {
        return writer;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    @Override
    public String toString(){
        return "Записка";
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || this.getClass() != obj.getClass()){ return false;}
        Note note = (Note) obj;
        return this.getMessage().equals(note.getMessage());
    }

    @Override
    public int hashCode(){
        return Objects.hash(this.getMessage(), this.getWriter());
    }
}
