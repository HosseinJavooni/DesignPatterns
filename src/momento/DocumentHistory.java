package momento;

import java.util.ArrayList;
import java.util.List;

public class DocumentHistory {
    List<DocumentStatus> documentList = new ArrayList<>();
    public void push(DocumentStatus documentStatus){
        documentList.add(documentStatus);
    }

    public DocumentStatus pop(){
        if(documentList.size() <= 1)
            return documentList.get(0);
        int lastIndex = documentList.size() - 1;
        DocumentStatus documentStatus = documentList.get(lastIndex);
        documentList.remove(lastIndex);
        return documentStatus;
    }
}
