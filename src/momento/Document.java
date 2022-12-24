package momento;

public class Document {
    String content;
    String fontName;
    int fontSize;
    DocumentHistory documentHistory = new DocumentHistory();

    public Document(String content, String fontName, int fontSize) {
        this.content = content;
        this.fontName = fontName;
        this.fontSize = fontSize;
    }

    public DocumentStatus createStatus(){
        return new DocumentStatus(this.content, this.fontName, this.fontSize);
    }

    public void restore(DocumentStatus documentStatus){
        this.content = documentStatus.getContent();
        this.fontName = documentStatus.getFontName();
        this.fontSize = documentStatus.getFontSize();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {

        this.content = content;
    }

    public String getFontName() {
        return fontName;
    }

    public void setFontName(String fontName) {
        this.fontName = fontName;
    }

    public int getFontSize() {
        return fontSize;
    }

    public void setFontSize(int fontSize) {
        this.fontSize = fontSize;
    }

    @Override
    public String toString() {
        return "Document{" +
                "content='" + content + '\'' +
                ", fontName='" + fontName + '\'' +
                ", fontSize=" + fontSize +
                '}';
    }
}
