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

class Text extends Section{
    Text(String c){
        super(c);
    }
    public void display(){
        String[] to_display = this.content.split("###");
        for(int i=0;i<to_display.length;i++){
            System.out.println(to_display[i]);
            System.out.print("\n\n");
        }
    }
}

class Table extends Section{
    Table(String c){
        super(c);
    }

    @Override
    public void display() {
        String[] to_display = this.content.split("\\},\\{");

        to_display[0] = to_display[0].substring(2);
        to_display[to_display.length-1] = to_display[to_display.length-1].substring(0,to_display[to_display.length-1].length()-2);

        for (int i=0;i<to_display.length;i++){
            String[] to_displayB = to_display[i].split(",");

            //System.out.println(to_display[i]);
            System.out.println(to_displayB[0] + "\t" + to_displayB[1] );
            System.out.print("\n");
        }
    }
}

