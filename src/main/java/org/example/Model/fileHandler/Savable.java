package org.example.Model.fileHandler;
import java.io.Serializable;

import org.example.Model.familyTree.FamilyTree;
import org.example.Model.human.FamilyTreeObject;

public interface Savable {
    public boolean save(Serializable serializable, String path);
    public FamilyTree<FamilyTreeObject> load(String path);
}
