import javax.print.Doc;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Document{
    private String title;
    List<Section> sections;
    Document(String t){
        title = t;
        sections = new ArrayList<>();
    }
    public void display(){
        for(int i=0;i<sections.size();i++){
            sections.get(i).display();
            System.out.println("");
        }
    }
    public void add(Section s){
        sections.add(s);
    }
}


abstract class Section{
    protected String content;
    Section(String c){
        content = c;
    }
    public void display(){}
}

