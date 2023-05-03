package com.alibou.databaseserver;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
@RequiredArgsConstructor
public class DatabaseServerService {
    List<DocData> db=new ArrayList<>();;
    List<GeneratedData> genDb=new ArrayList<>();
    public void saveDoc(DocData doc) {
        db.add(doc);
    }

    public List<GeneratedData> getDocs(String fullName) {
        List<GeneratedData> res=new ArrayList<>();
        for(int i=0;i<genDb.size();i++){
            GeneratedData temp=genDb.get(i);
            if(temp.getFullName().equals(fullName)){
                res.add(temp);
            }
        }
        return res;
    }

    public void saveGenerated(GeneratedData doc) {
        genDb.add(doc);
    }
}
